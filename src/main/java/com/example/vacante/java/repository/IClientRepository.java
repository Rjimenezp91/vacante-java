package com.example.vacante.java.repository;

import com.example.vacante.java.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface IClientRepository extends JpaRepository<Client, Long> {

   @Query(value= "select c from Client c where c.clientId = ?1 AND c.isActive is True")
   Optional<Client>findById(Long id);

   Optional<Client>findByClientIdAndBalanceNotNull(Long id);
}
