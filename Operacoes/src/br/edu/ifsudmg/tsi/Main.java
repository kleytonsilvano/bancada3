package br.edu.ifsudmg.tsi;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Operacoes operacoes = new Operacoes();

		
		ServerSocket servidor = new ServerSocket(8024);
	

		
		System.out.println("Porta aberta!");

		while(true){
			

		Socket cliente = servidor.accept();
		System.out.println("Nova conexão com o cliente " +   
				cliente.getInetAddress().getHostAddress()
				);
		
		Scanner s = new Scanner(cliente.getInputStream());
		PrintStream saida = new PrintStream(cliente.getOutputStream());
		
		
			while(s.hasNextLine())
			{
				String op = s.nextLine();
				
				System.out.println("\nO valor de Op é = " + op);
				
				if(op.contains("fatorial"))
				{
					String argss[]=op.split(" ");
					
					int num1 = Integer.parseInt(argss[1]);
					
					saida.println("O resultado é: " + operacoes.fatorial(num1));
				}
				if(op.contains("soma"))
				{
					String argss[]=op.split(" ");
					
					int num1 = Integer.parseInt(argss[1]);
					int num2 = Integer.parseInt(argss[2]);
					
					operacoes.soma(num1,num2);
					saida.println("O resultado é: " + operacoes.soma(num1,num2));
				}
				if(op.contains("produto"))
				{
					String argss[]=op.split(" ");
					
					int num1 = Integer.parseInt(argss[1]);
					int num2 = Integer.parseInt(argss[2]);
					
					saida.println("O resultado é: " + operacoes.produto(num1,num2));
				}
			}
		
		
	}
	}

}


