package com.example.vacante.java.controller;

import com.example.vacante.java.dto.ClientMinifiedRequest;
import com.example.vacante.java.entity.Client;
import com.example.vacante.java.entity.Product;
import com.example.vacante.java.repository.IClientRepository;
import com.example.vacante.java.service.IClientService;
import org.jetbrains.annotations.NonNls;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.Optional;

@RestController
public class ClientController {

    @Autowired
    IClientService clientService;

    @Autowired
    IClientRepository clientRepository;

    /*
    @GetMapping
    public List<Client> getAll(){
        return Collections.emptyList();
    }

     */
    @GetMapping("client/{id}")
    public Client getClient(@PathVariable Long id){

return null;
       // return clientService.getClient(id);
    }

    @PostMapping("add/balance")
    public ResponseEntity<BigDecimal> addBalance(@RequestBody ClientMinifiedRequest clientRequest){

        return clientService.addBalance(clientRequest.getId(), clientRequest.getBalance());
    }

    @PostMapping("buy/{userId}")
    public ResponseEntity<Product> buyProducts(@RequestBody @NonNull Product product, @PathVariable Long userId){

        return clientService.buyProduct(product, userId);
    }
}
