package clase1;


public class Profesor implements Persona{
	
	private Informe informe;

	@Override
	public String getTarea() {
		return "un profesor";
	}
	
	public String getInforme() {
		return "informe del profesor: " + informe.crearInforme();
	}
	//Injeccion de dep por metodo:
	
	public void setInforme(Informe informe) {
		this.informe = informe;
	}
}
