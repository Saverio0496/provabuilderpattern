package it.prova.builderpattern.test;

import it.prova.probabuilderpattern.builderpattern.AutomobileBuilder;
import it.prova.provabuilderpattern.model.Automobile;

public class Test {

	public static void main(String[] args) {

		Automobile automobilePerTestBuild = AutomobileBuilder.newBuilder(3L).modello("Punto").telaio("F89232")
				.cilindrata(90).assicurazione(true).casaProduttrice("Fiat").build();

		System.out.println("Stampa prova Builder Pattern:");
		System.out.println(automobilePerTestBuild);

	}

}
