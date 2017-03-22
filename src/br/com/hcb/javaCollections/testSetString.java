package br.com.hcb.javaCollections;

import java.util.HashSet;
import java.util.Set;

public class testSetString {
	public static void main(String[] args) {

        Set<String> alunos = new HashSet<>();
        //não aceita elementos repetidos
        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");
        alunos.add("Sergio Lopes");
        alunos.add("Renan Saggio");
        alunos.add("Mauricio Aniche");
        alunos.add("Mauricio Aniche");

//        for (String aluno : alunos) {
//            System.out.println(aluno);
//        }
        
        System.out.println(alunos);
        
        System.out.println(alunos.contains("Paulo Silveira"));

    }
}
