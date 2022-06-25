package br.com.stefanini.aprendendocomeclipse.orientacaoobjetos;

public class Principal extends Carro2 {
	public static void main(String[] args) {
		Carro2 bmw = new Carro2();
		bmw.setMarca("BMW");
		bmw.setModelo("M3");
		bmw.setQuilometroPorLitro(7.5);
		//bmw.setTaxaAceleracao(50);
		bmw.setVelocidadeMaxima(280);
		
		Carro2 mercedes = new Carro2("Mercedes", "c18");
		System.out.println(mercedes.getMarca());
		System.out.println(mercedes.getModelo());
		
		System.out.println(bmw.getMarca());
		System.out.println(bmw.getModelo());
		System.out.println(bmw.getQuilometroPorLitro());
		System.out.println(bmw.getTaxaAceleracao());
		System.out.println(bmw.getVelocidadeMaxima());
		
		bmw.acelerar();
		bmw.frear();
		
		System.out.println(bmw.calcularTaxaAceleracao(bmw.getVelocidadeMaxima(), 0, 10, 0));
		
		System.out.println(bmw.calcularTaxadeAceleracao(bmw.getVelocidadeMaxima(), 5));
		
	}
}
