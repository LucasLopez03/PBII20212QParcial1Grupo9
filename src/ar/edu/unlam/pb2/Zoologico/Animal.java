package ar.edu.unlam.pb2.Zoologico;

public abstract class Animal {
	
	private Double peso;
	private Double altura;
	private Integer extremidades;
	private Boolean tieneHambre;

	public Animal(Double peso, Double altura, Integer extremidades, Boolean tieneHambre) {
		super();
		this.peso = peso;
		this.altura = altura;
		this.extremidades = extremidades;
		this.tieneHambre= tieneHambre;
	}
	
	public abstract  void  alimentar () ;

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Integer getExtremidades() {
		return extremidades;
	}

	public void setExtremidades(Integer extremidades) {
		this.extremidades = extremidades;
	}

	public Boolean getTieneHambre() {
		return tieneHambre;
	}

	public void setTieneHambre(Boolean tieneHambre) {
		this.tieneHambre = tieneHambre;
	}

}
