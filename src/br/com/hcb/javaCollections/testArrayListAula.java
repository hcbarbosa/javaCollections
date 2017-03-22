package br.com.hcb.javaCollections;

import java.util.ArrayList;
import java.util.Comparator;

public class testArrayListAula {

	public static void main(String[] args) {
		Aula a1 = new Aula("Revistando as ArrayLists", 21);
		Aula a2 = new Aula("Listas de objetos", 20);
		Aula a3 = new Aula("Relacionamento de listas e objetos", 15);

		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		//Collections.sort(aulas); //apenas por nome
		//Collections.sort(aulas, Comparator.comparing(Aula::getTempo)); // compara por tempo
		
		// java 1.8
		aulas.sort(Comparator.comparing(Aula::getTempo)); //toda lista agora tem metodo sort

		System.out.println(aulas); //necessario sobrescrever toString da classe
	}
}