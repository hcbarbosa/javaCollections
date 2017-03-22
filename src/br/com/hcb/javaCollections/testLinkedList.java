package br.com.hcb.javaCollections;

public class testLinkedList {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		//o bom eh somente curso acessar as aulas
		// javaColecoes.adiciona(...) ou javaColecoes.getAulas().add(...) devem ser restritos

	    javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
	    javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
	    javaColecoes.adiciona(new Aula("Modelando com coleções", 24));
	
	    System.out.println(javaColecoes.getAulas());
	}

}
