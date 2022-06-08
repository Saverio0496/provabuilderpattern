package it.prova.provabuilderpattern.model;

public class Automobile {

	private Long id;
	private String modello;
	private String telaio;
	private Integer cilindrata;
	private String casaProduttrice;
	private boolean assicurazione;

	public Automobile() {
	}

	public Automobile(Long id, String modello, String telaio, Integer cilindrata, String casaProduttrice,
			boolean assicurazione) {
		this.id = id;
		this.modello = modello;
		this.telaio = telaio;
		this.cilindrata = cilindrata;
		this.casaProduttrice = casaProduttrice;
		this.assicurazione = assicurazione;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public String getTelaio() {
		return telaio;
	}

	public void setTelaio(String telaio) {
		this.telaio = telaio;
	}

	public Integer getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(Integer cilindrata) {
		this.cilindrata = cilindrata;
	}

	public String getCasaProduttrice() {
		return casaProduttrice;
	}

	public void setCasaProduttrice(String casaProduttrice) {
		this.casaProduttrice = casaProduttrice;
	}

	public boolean isAssicurazione() {
		return assicurazione;
	}

	public void setAssicurazione(boolean assicurazione) {
		this.assicurazione = assicurazione;
	}

	public String toString() {
		return "Automobile [id=" + id + ", modello=" + modello + ", telaio=" + telaio + ", cilindrata=" + cilindrata
				+ ", casaProduttrice=" + casaProduttrice + ", assicurazione=" + assicurazione + "]";
	}

}
