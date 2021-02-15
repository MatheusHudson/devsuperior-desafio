package com.devSuperiorDesafio.DevSuperioDesafio.repositories;

import org.springframework.stereotype.Repository;

import com.devSuperiorDesafio.DevSuperioDesafio.entities.Client;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
