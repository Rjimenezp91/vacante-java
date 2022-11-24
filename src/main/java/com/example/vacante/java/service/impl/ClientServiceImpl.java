package com.example.vacante.java.service.impl;

import com.example.vacante.java.entity.Client;
import com.example.vacante.java.entity.Product;
import com.example.vacante.java.exception.BadRequestException;
import com.example.vacante.java.exception.NotFoundException;
import com.example.vacante.java.repository.IClientRepository;
import com.example.vacante.java.service.IClientService;
import net.bytebuddy.implementation.bytecode.Throw;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements IClientService {

    @Autowired
    private IClientRepository clientRepository;

    @Override
    public List<Client> getAll() {
        return null;
    }

    private Client getActiveClient(Long id) {

        Optional<Client> activeClient = clientRepository.findById(id);
        if(activeClient.isEmpty()){
            throw new NotFoundException();
        }
        return activeClient.get();
    }

    @Override
    public ResponseEntity<BigDecimal> addBalance(Long id, BigDecimal balance) {

        Client client = getActiveClient(id);

        if(client.getBalance() == null){
            throw new BadRequestException("The balance must not be null");
        }

        client.setBalance(client.getBalance().add(balance));
        Client clientRepo = clientRepository.save(client);
        return new ResponseEntity<>(clientRepo.getBalance(), HttpStatus.OK);

    }

    @Override
    public ResponseEntity<Product> buyProduct (@NotNull Product product, Long id){

        Client client = clientRepository.findByClientIdAndBalanceNotNull(id).get();
        BigDecimal totalProducts = BigDecimal.valueOf(product.getQuantity());

        if ( client.getBalance().subtract(product.getValue()
                .multiply( totalProducts )).intValue() < 0 ){

            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        client.setBalance(client.getBalance().subtract(product.getValue()
                .multiply( totalProducts )));

        clientRepository.save( client );


        return new ResponseEntity<>(product, HttpStatus.OK);
    }



}
