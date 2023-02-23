package com.educacionit.demo.entities;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="cliente")
public class Cliente {
	
	@Id
	@SequenceGenerator(name="cliente_sequence", sequenceName = "cliente_sequence", allocationSize = 1, initialValue = 1000)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "cliente_sequence")//Auto por defecto -Identity uso del autoincrement - Sequence secuencial
	//No funciona SEQUENCE con el dialect
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
	
	@OneToOne
	private Usuario usuario;

	public Cliente(Integer id, String nombre, String apellido, String comentario, Boolean activo, BrazoHabil brazoHabil,
			Calendar createdDate, Usuario usuario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.comentario = comentario;
		this.activo = activo;
		this.brazoHabil = brazoHabil;
		this.createdDate = createdDate;
		this.usuario = usuario;
	}
	
	
	public Cliente() {}


	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", comentario=" + comentario
				+ ", activo=" + activo + ", brazoHabil=" + brazoHabil + ", createdDate=" + createdDate + ", usuario="
				+ usuario + "]";
	}
	
	

}
