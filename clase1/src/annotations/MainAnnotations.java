package annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAnnotations {
	
	//crear el context
	//crar el bean
	//utilizar
	public static void main(String[] args) {
	ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContextAnnotations.xml");
	
	Empleado vendedor = contexto.getBean("miVendedor", Empleado.class);
	
	System.out.println(vendedor.getInforme());
	
	contexto.close();


	}
}
