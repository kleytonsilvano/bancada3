package br.edu.ifsudmg.tsi;

import java.io.*;
import java.net.*;
import java.util.Hashtable;
import java.util.Scanner;
public class ServNome {

	public static void main(String[] args) {
		try
		{
			// Criar um socket no servidor
			ServerSocket ss = new ServerSocket(8082);

			// hashtable Lista dos usuarios on-line e off-line.
			Hashtable tOnlineUsers = new Hashtable(10);
			Hashtable tOfflineUsers = new Hashtable(10);

			// ---------------------------------------------------------------
			// Agora comece a aceitar conexões de clientes em um loop while
			// O servidor deve ser executado em um loop infinito
			while(true)
			{
				Socket socket = ss.accept();    // aceitar a conexão do cliente
				System.out.println("Um novo cliente está conectado.");

				Scanner scaner = new Scanner(socket.getInputStream());
				PrintStream saida = new PrintStream(socket.getOutputStream());

				// ler o nome de usuário do cliente e joga na tabela
				// o nome de usuário + socket
				tOnlineUsers.put("soma", "10.3.1.51");
				tOnlineUsers.put("produto", "10.3.1.52");
				tOnlineUsers.put("fatorial", "10.3.1.51");
				
				while(scaner.hasNextLine()) 
				{
					String op = scaner.nextLine();
					
					if(tOnlineUsers.containsKey(op))
					{
						Object obj = tOnlineUsers.get(op);
						String ip = obj.toString();
						saida.println(ip);
					}
					   
				}
			}    // Fim do while

		}    // Fim do try
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}


}


