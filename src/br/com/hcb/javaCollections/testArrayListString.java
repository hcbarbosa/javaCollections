package br.com.hcb.javaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class testArrayListString {

	public static void main(String[] args) {
		String aula1 = "Modelando a classe Aula";
        String aula2 = "Conhecendo mais de listas";
        String aula3 = "Trabalhando com Cursos e Sets";

        ArrayList<String> aulas = new ArrayList<>();
        //existe tbm a collection vector no java 1.2
        //Vector<Aluno> vetor = new Vector<>();
        //possui acesso sincronizado ou Thread Safety
        addElemento(aulas, aula1);
        addElemento(aulas, aula2);
        addElemento(aulas, aula3);     
        addElemento(aulas, aula3); 
        
        rmElemento(aulas, aula3);
        
        ordenaList(aulas);
        
        percorreLista(aulas);
	}
	
	public static void addElemento(List<String> lista, String valor){
		lista.add(valor);
	}
	
	public static void rmElemento(List<String> lista, String valor){
		lista.remove(valor); // por conteudo
		// aulas.remove(0); // por indice
	}

	public static void percorreLista(List<String> lista){
		// java 1.6
//		for (int i = 0; i < lista.size(); i++) {
//		    System.out.println("aula : " + lista.get(i));
//		}
		
		// java 1.7
//		for (String aula : lista) {
//		    System.out.println("Aula: " + aula);
//		}
		
		// java 1.8
		System.out.println("Percorrendo:");
		lista.forEach(aula -> {
		    System.out.println("Aula " + aula);
		});
		
		//iterator
//		Iterator<String> iterador = lista.iterator();
//
//		while (iterador.hasNext()) {
//		    System.out.println(iterador.next());
//		}
	}
	
	public static void ordenaList(List<String> lista){
		Collections.sort(lista);
	}
	
}
