package it.prova.probabuilderpattern.builderpattern;

import it.prova.provabuilderpattern.model.Automobile;

public class AutomobileBuilder {

	private Long id;
	private String modello;
	private String telaio;
	private Integer cilindrata;
	private String casaProduttrice;
	private boolean assicurazione;

	private AutomobileBuilder(Long id) {
		this.id = id;
	}

	public static AutomobileBuilder newBuilder(Long id) {
		return new AutomobileBuilder(id);
	}

	public AutomobileBuilder modello(String modello) {
		this.modello = modello;
		return this;
	}

	public AutomobileBuilder telaio(String telaio) {
		this.telaio = telaio;
		return this;
	}

	public AutomobileBuilder cilindrata(Integer cilindrata) {
		this.cilindrata = cilindrata;
		return this;
	}

	public AutomobileBuilder casaProduttrice(String casaProduttrice) {
		this.casaProduttrice = casaProduttrice;
		return this;
	}

	public AutomobileBuilder assicurazione(boolean assicurazione) {
		this.assicurazione = assicurazione;
		return this;
	}

	public Automobile build() {
		return new Automobile(id, modello, telaio, cilindrata, casaProduttrice, assicurazione);
	}

}
