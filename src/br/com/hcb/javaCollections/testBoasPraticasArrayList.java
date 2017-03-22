package br.com.hcb.javaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class testBoasPraticasArrayList {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as colecoes do Java",
                "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));

        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        System.out.println(aulasImutaveis);

        List<Aula> aulas = new ArrayList<>(aulasImutaveis);
        //opcao de como conseguir ordenar lista imutavel 

        Collections.sort(aulas);
        System.out.println(aulas);
        
        System.out.println(javaColecoes.getTempoTotal());
        
        System.out.println(javaColecoes);//printa curso
        
        Collections.reverse(aulas);//inverter a ordem
        System.out.println(aulas);
        
        Collections.shuffle(aulas);//embaralhar a ordem
        System.out.println(aulas);
        
        Collections.singletonList(aulas);//�nico elemento 
        System.out.println(aulas);
	}

}
