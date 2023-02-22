package clase1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Alumno alumno = new Alumno();
//		System.out.println(alumno.getTarea());
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//ejecucion con bean:
//		Persona alumno =  context.getBean("miAlumno", Persona.class);
//		
//		System.out.println(alumno.getTarea());
//		
//		Persona profesor = context.getBean("miProfesor", Persona.class);
//		
//		System.out.println(profesor.getTarea());
		
		//context.close();
		
		//Injeccion Dependencias
		
//		Persona alumno = context.getBean("miAlumno", Persona.class);
//		System.out.println(alumno.getTarea());
//		System.out.println(alumno.getInforme());
//		
//		Persona profesor = context.getBean("miProfesor", Persona.class);
//		System.out.println(profesor.getTarea());
//		System.out.println(profesor.getInforme());
		
		//Comparacion de beans:
//		Persona profesor = context.getBean("miProfesor", Persona.class);
//		Persona profesor2 = context.getBean("miProfesor", Persona.class);
//		
//		System.out.println(profesor);
//		System.out.println(profesor2);
//		
//		if(profesor == profesor2) System.out.println("es el mismo bean");
//		else System.out.println("es distinto");
		
		//aplicado el prototype en el applicationContext:
//		Persona alumno = context.getBean("miAlumno", Persona.class);
//		Persona alumno2 = context.getBean("miAlumno", Persona.class);
//		
//		if(alumno == alumno2) System.out.println("es el mismo bean");
//		else System.out.println("es distinto");
		
		Secretaria secre = context.getBean("miSecretaria", Secretaria.class);
		
		System.out.println(secre.getEmail());
		System.out.println(secre.getEscuela());
		
		context.close();

	}

}
