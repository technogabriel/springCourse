package com.educacionit.demo;

import java.util.Calendar;
import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.educacionit.demo.entities.Alumno;
import com.educacionit.demo.entities.BrazoHabil;
import com.educacionit.demo.entities.Cliente;
import com.educacionit.demo.entities.Usuario;
import com.educacionit.demo.repositories.AlumnoRepository;
import com.educacionit.demo.repositories.ClienteRepository;
import com.educacionit.demo.repositories.UsuarioRepository;

@SpringBootApplication
@EnableJpaRepositories
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	CommandLineRunner commandLineRunner(AlumnoRepository repository, ClienteRepository clienteRepository, UsuarioRepository usuarioRepository) {
		return args ->{
		//	Alumno alumno = new Alumno(null,"Adan","Tarazona",null,Boolean.TRUE, BrazoHabil.RIGTH, Calendar.getInstance());
			//repository.save(alumno);
			
			//System.out.println(repository.findById(1));
			Usuario usuario = new Usuario("Juan","Perez");
			usuarioRepository.save(usuario);
			
			Cliente cliente = new Cliente(null,"Andres","Lopez",null,Boolean.FALSE,BrazoHabil.LEFT, Calendar.getInstance(), usuario);
			clienteRepository.save(cliente);
		};
	}

}
