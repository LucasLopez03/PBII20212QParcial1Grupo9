package ar.edu.unlam.pb2.Zoologico;

public class Cliente {

	private String dni;
	private String nombreApellido;
	private Integer entrada;

	public Cliente(String dni, String nombreApellido, Integer entrada) {
		this.dni = dni;
		this.nombreApellido = nombreApellido;
		this.entrada = entrada;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombreApellido() {
		return nombreApellido;
	}

	public void setNombreApellido(String nombreApellido) {
		this.nombreApellido = nombreApellido;
	}

	public Integer getEntrada() {
		return entrada;
	}

	public void setEntrada(Integer entrada) {
		this.entrada = entrada;
	}
	
	
}
