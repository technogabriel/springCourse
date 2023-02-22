package clase1;

public class Secretaria implements Persona {
	private Informe informe;
	private String email;
	private String escuela;

	@Override
	public String getTarea() {
	
		return "tarea de la secretaria";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "informe de la secretaria :" + informe.crearInforme();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setInforme(Informe informe) {
		this.informe = informe;
	}

	public String getEscuela() {
		return escuela;
	}

	public void setEscuela(String escuela) {
		this.escuela = escuela;
	}
	
	public void metodoInicial() {
		System.out.println("Iniciando bean");
	}
	
	public void metodoFinal() {
		System.out.println("destruyendo el bean");
	}

}
