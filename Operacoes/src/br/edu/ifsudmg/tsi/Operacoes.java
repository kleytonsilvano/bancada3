package br.edu.ifsudmg.tsi;

public class Operacoes {

	public Operacoes() {
	}

	public int soma(int x,int y) {
		return x+y;
	}
	
	public int produto (int x,int y) {
		return x*y;
	}
	
	public int fatorial(int n) {
		int fat = 1;
		
		if(n==0)
			return n;
		for(int indice = 1; indice <= n; indice++)
			fat *= indice;
		
		return fat;
	}
	
}
