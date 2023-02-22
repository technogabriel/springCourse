package clase1;

public class Alumno implements Persona {
	
	private Informe informe;
	
	/*
	 Injeccion por constructor
	 public Alumno(Informe informe){
	 	this.informe = informe;
	 }
	 */
	 public Alumno(Informe informe){
		 	this.informe = informe;
		 }
	
	public String getTarea() {
		return "primera clase de spring";
	}
	
	public String getInforme() {
		return "informe del alumno :" + informe.crearInforme();
		
	}

}
