package br.edu.ifsud.mg.tsi.OpEnvia;

import java.io.Serializable;

public class MeuObjeto implements Serializable{

	String nome;
	int valor;
		
	public MeuObjeto() {
		
	}
	public MeuObjeto(String nome, int valor) {
		this.nome = nome;
		this.valor = valor;
	}
	
	public String toString() {
		return "MeuObjeto >> Nome=" + nome + ", Valor=" + valor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getValor() {
		return valor;
	}
	
	public void setValor(int valor) {
		this.valor = valor;
	}

}
