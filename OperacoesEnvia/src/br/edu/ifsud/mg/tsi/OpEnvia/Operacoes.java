package br.edu.ifsud.mg.tsi.OpEnvia;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Operacoes{
	
	private Socket cliente;
	private PrintStream saida;
	private Scanner le;
	private MeuObjeto obj;

	public Operacoes(String ip, int porta) throws UnknownHostException, IOException {
		
		cliente = new Socket(ip,porta);
		System.out.println("O cliente se conectou ao servidor!");
		
		saida = new PrintStream(cliente.getOutputStream());
		le = new Scanner(cliente.getInputStream());
		  

	}
	
	public void fatorial(int valor1)
	{
		saida.println("fatorial "+valor1);
		System.out.println(le.nextLine());
		
	}
	public void soma(int valor1, int valor2)
	{
		saida.println("soma "+valor1+" "+valor2);
		System.out.println(le.nextLine());
	}
	public void produto(int valor1, int valor2)
	{
		saida.println("produto "+valor1+" "+valor2);
		System.out.println(le.nextLine());
		
	}
	
	public void objeto() {
		saida.println("getObj");
		
	}

}
