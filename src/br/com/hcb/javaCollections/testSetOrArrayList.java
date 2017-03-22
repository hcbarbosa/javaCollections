package br.com.hcb.javaCollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class testSetOrArrayList {
	public static void main(String[] args) {
		Collection<Integer> numerosArray = new ArrayList<Integer>();

		long inicio = System.currentTimeMillis();
		long fim = System.currentTimeMillis();
		long tempoDeExecucao = fim - inicio;
		
		inicio = System.currentTimeMillis();
		
		for (int i = 1; i <= 50000; i++) {
			numerosArray.add(i);
		}
		
		fim = System.currentTimeMillis();
		tempoDeExecucao = fim - inicio;

		System.out.println("Tempo gasto ArrayList insercao: " + tempoDeExecucao);
		
		inicio = System.currentTimeMillis();
		
		for (Integer numero : numerosArray) {
			numerosArray.contains(numero);
		}

		fim = System.currentTimeMillis();
		tempoDeExecucao = fim - inicio;

		System.out.println("Tempo gasto ArrayList consulta: " + tempoDeExecucao);
		
		// #########
		

		Collection<Integer> numerosSet = new HashSet<Integer>();

		inicio = System.currentTimeMillis();

		for (int i = 1; i <= 50000; i++) {
			numerosSet.add(i);
		}
		
		fim = System.currentTimeMillis();
		tempoDeExecucao = fim - inicio;

		System.out.println("Tempo gasto Set insercao: " + tempoDeExecucao);

		inicio = System.currentTimeMillis();
		
		for (Integer numero : numerosArray) {
			numerosArray.contains(numero);
		}

		fim = System.currentTimeMillis();
		tempoDeExecucao = fim - inicio;

		System.out.println("Tempo gasto Set consulta: " + tempoDeExecucao);
	}
}
