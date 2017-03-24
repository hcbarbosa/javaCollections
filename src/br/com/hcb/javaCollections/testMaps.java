package br.com.hcb.javaCollections;

public class testMaps {
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);
		Aluno a4 = new Aluno("Paulo Silveira", 5617);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		javaColecoes.matricula(a4);
		
		System.out.println(javaColecoes);
		
		System.out.println("Quem é o aluno com matricula 17645?");
		Aluno aluno17645 = javaColecoes.buscaAluno(17645);
		System.out.println("Aluno: "+ aluno17645);
		
		//existem 2 alunos com mesma matricula
		//o map associou o paulo com a matricula e "deletou" o guilherme
		System.out.println("Quem é o aluno com matricula 5617?");
		Aluno aluno5617 = javaColecoes.buscaAluno(5617);
		System.out.println("Aluno: "+ aluno5617);
		
		//para resolver usaria isso
		//Map<Integer, Set<Aluno>> matriculaAlunos;
		
		System.out.println("Quem é o aluno com matricula 1818?");
		Aluno aluno1818 = javaColecoes.buscaAluno(1818);
		System.out.println("Aluno: "+ aluno1818);
		
		
	}
}
