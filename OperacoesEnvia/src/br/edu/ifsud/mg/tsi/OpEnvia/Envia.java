package br.edu.ifsud.mg.tsi.OpEnvia;

import java.io.IOException;
import java.net.UnknownHostException;

public class Envia {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Operacoes objeto = new Operacoes("10.3.1.52",8686);
		
		objeto.fatorial(0);
		objeto.produto(10,10);
		objeto.soma(1, -3);
		objeto.objeto();
		
	}

}
