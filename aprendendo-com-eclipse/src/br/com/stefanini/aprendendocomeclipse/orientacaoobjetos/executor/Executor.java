package br.com.stefanini.aprendendocomeclipse.orientacaoobjetos.executor;

import br.com.stefanini.aprendendocomeclipse.orientacaoobjetos.BMW;
import br.com.stefanini.aprendendocomeclipse.orientacaoobjetos.Carro;
import br.com.stefanini.aprendendocomeclipse.orientacaoobjetos.Mercedes;

public class Executor {

	public static void main(String[] args) {
		Carro  carro1 = new Carro();
		
		carro1.setMarca("BMW");
		carro1.setModelo("320i");
		carro1.setChassi(9999);
		carro1.setPlaca("AAA9999");
		carro1.setBancos(5);
		carro1.setRoda(20);
		carro1.setVelocidade(230);
		
		Carro carro2 = new Carro("Mercedes");
		
		
		System.out.println("A marca é:" +carro1.getMarca());
		System.out.println("O modelo é " +carro1.getModelo());
		System.out.println("O numero do Chassi é " +carro1.getChassi());
		System.out.println("A placa é " +carro1.getPlaca());
		System.out.println("Possui " +carro1.getBancos() + " Bancos");
		System.out.println("Possui rodas aro " +carro1.getRoda());
		
		System.out.println("Sua velocidade é de " +carro1.acelerar());
		
		System.out.println(carro2.getMarca());
		
		
		BMW bmw = new BMW();
		bmw.setVelocidade(100);
		System.out.println(bmw.acelerar());
		
		Mercedes mercedes = new Mercedes();
		System.out.println(mercedes.acelerar());
	
	}

}
