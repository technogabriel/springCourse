package com.educacionit.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.educacionit.demo.entities.Alumno;

@Repository
public interface AlumnoRepository extends CrudRepository<Alumno, Integer> {

}
