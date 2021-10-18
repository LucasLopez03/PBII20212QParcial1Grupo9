package ar.edu.unlam.pb2.Zoologico;

public class Venta {
	
	private Integer dniCliente;
	private String nombreCliente;

	public Venta(Integer dniCliente, String nombreCliente) {
		this.setDniCliente(dniCliente);
		this.setNombreCliente(nombreCliente);
	}

	public Integer getDniCliente() {
		return dniCliente;
	}

	public void setDniCliente(Integer dniCliente) {
		this.dniCliente = dniCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

}
