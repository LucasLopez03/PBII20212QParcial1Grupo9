package ar.edu.unlam.pb2.Zoologico;

public class Cliente {

	private Integer dni;
	private String nombreApellido;
	private Integer entrada;

	public Cliente(Integer dni, String nombreApellido) {
		super();
		this.dni = dni;
		this.nombreApellido = nombreApellido;
		this.entrada = 0;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
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
