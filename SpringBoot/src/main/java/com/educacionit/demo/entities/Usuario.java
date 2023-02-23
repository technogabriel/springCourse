package com.educacionit.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;


@Entity
@Table(name="usuarios")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)//Auto por defecto -Identity uso del autoincrement - Sequence secuencial
	//No funciona SEQUENCE con el dialect
	private Integer id;
	@Column(name="nombre", length = 50, nullable = false)
	private String nombre;
	
	private String apellido;

	public Usuario(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	


}
