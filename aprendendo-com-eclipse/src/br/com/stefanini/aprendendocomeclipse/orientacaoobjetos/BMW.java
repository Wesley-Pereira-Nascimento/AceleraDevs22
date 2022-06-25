package br.com.stefanini.aprendendocomeclipse.orientacaoobjetos;

public class BMW extends Carro{
	
	public BMW() {
		this.setMarca("BMW");
	}
	
	@Override
	public String acelerar() {
		return "A BMW pode fazer de 0 " + this.getVelocidade() + " em 5s";
	}

}
