package annotations;

import org.springframework.stereotype.Component;

@Component("miVendedor")
public class Vendedor implements Empleado {

	@Override
	public String getTarea() {
		return "tarea del vendedor";
	}

	@Override
	public String getInforme() {
		
		return "informe del vendedor";
	}

}
