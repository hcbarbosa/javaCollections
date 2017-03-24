package br.com.hcb.javaCollections;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {

	private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<Aula>();
    private Set<Aluno> alunos = new HashSet<>();
    //LinkedHashSet - mantem a ordem de insercao
    //TreeSet - so funciona com classes q implementa comparable
    private Map<Integer, Aluno> matriculaAluno = new HashMap<>();
    //Hashtable map antigo com thread safe, usado para multiplas threads
    

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }
    
    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }
    
    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

	public Aluno buscaAluno(int numero) {
		//sem um map seria assim
//		for(Aluno aluno : alunos){
//			if(aluno.getNumeroMatricula() == numero){
//				return aluno;
//			}
//		}
//		throw new NoSuchElementException("matricula nao encontrada: "+numero);
		
		//com map
		if(!matriculaAluno.containsKey(numero)){
			throw new NoSuchElementException("matricula nao encontrada: "+numero);
		}		
		return matriculaAluno.get(numero);
	}

    public void adiciona(Aula aula) {
        this.aulas.add(aula);
    }
    
    public void matricula(Aluno aluno){
        this.alunos.add(aluno);
        //associa matricula com aluno, melhor para pesquisa
        this.matriculaAluno.put(aluno.getNumeroMatricula(), aluno);
    }
    
    public int getTempoTotal() {
//        int tempoTotal = 0;
//        for (Aula aula : aulas) {
//            tempoTotal += aula.getTempo();
//        }
//        return tempoTotal;
    	//java 1.8
    	return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }
    
    @Override
    public String toString() {
        return "[Curso: " + this.getNome() + ", tempo total: " + this.getTempoTotal()
                + ", aulas: + " + this.aulas + "]";
    }
}