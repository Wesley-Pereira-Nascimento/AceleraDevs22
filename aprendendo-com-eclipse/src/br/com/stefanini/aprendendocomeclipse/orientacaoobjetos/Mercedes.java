package br.com.stefanini.aprendendocomeclipse.orientacaoobjetos;

public class Mercedes extends Carro {
	public Mercedes() {
		this.setMarca("Mercedes");
	}
	
	@Override
	public String acelerar() {
	
		return "A Mercedes tem uma Acelera��o diferente para cada Modelo";
	}
}
