package com.educacionit.demo.entities;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;




@Entity
@Table(name="alumnos")

public class Alumno {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)//Auto por defecto -Identity uso del autoincrement - Sequence secuencial
	private Integer id;
	@Column(name="nombre", length = 50, nullable = false)
	private String nombre;
	//@Column(nullable = false)
	private String apellido;
	
	@Transient
	private String comentario;
	
	private Boolean activo;

	@Enumerated(EnumType.STRING)
	private BrazoHabil brazoHabil;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar createdDate;
	
	public Alumno() {}
	
	public Alumno(Integer id, String nombre, String apellido, String comentario, Boolean activo, BrazoHabil brazoHabil,
			Calendar createdDate) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.comentario = comentario;
		this.activo = activo;
		this.brazoHabil = brazoHabil;
		this.createdDate = createdDate;
	}
	
	
	
	
}
