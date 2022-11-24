package com.example.vacante.java.service;

import com.example.vacante.java.entity.Client;
import com.example.vacante.java.entity.Product;
import org.springframework.http.ResponseEntity;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface IClientService {

    List<Client> getAll();

   // Client getClient(Long id );
    ResponseEntity<BigDecimal> addBalance(Long id, BigDecimal balance );

    ResponseEntity<Product> buyProduct(Product product, Long id);


}
