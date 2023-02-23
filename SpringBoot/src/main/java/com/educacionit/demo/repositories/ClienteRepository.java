package com.educacionit.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.educacionit.demo.entities.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer> {

}
