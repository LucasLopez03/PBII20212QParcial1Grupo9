package ar.edu.unlam.pb2.Zoologico;



public abstract class Animal {
	
	
	
	private Double peso;
	private String nombreDeanimal;
	private Double altura;
	private Integer extremidades;
	private Boolean tieneHambre;
	private Edad edad;
    private ActividadesQueRealizan []listaDeActividades;
    
	public Animal(Double peso, Double altura, Integer extremidades, Boolean tieneHambre,String nombreDeAnimal, Edad edad) {
		super();
		this.peso = peso;
		this.altura = altura;
		this.extremidades = extremidades;
		this.tieneHambre= tieneHambre;
		this.listaDeActividades=new ActividadesQueRealizan[10];
	    this.nombreDeanimal=nombreDeAnimal;
	    this.setEdad(edad);

	}
	
	public abstract  void  alimentar () ;
    public Boolean aprender(ActividadesQueRealizan nuevaActividad) {
    	Boolean agregado=false;
    	for (int i = 0; i < listaDeActividades.length; i++) {
			if(listaDeActividades[i]==null) {
				listaDeActividades[i]=nuevaActividad;
				agregado=true;
				break;
			}
		}
    	return agregado;
    }
    
	public void crecer() {
		switch(edad) {
			case BEBE:
				this.edad = edad.JOVEN;
				break;
			case JOVEN:
				this.edad = edad.ADULTO;
				break;
			case ADULTO:
				this.edad = edad.MUERTO;
				break;
			default:
				break;
		}
	}
        
	public String getNombreDeanimal() {
		return nombreDeanimal;
	}

	public void setNombreDeanimal(String nombreDeanimal) {
		this.nombreDeanimal = nombreDeanimal;
	}

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

	public Edad getEdad() {
		return edad;
	}

	public void setEdad(Edad edad) {
		this.edad = edad;
	}

}
