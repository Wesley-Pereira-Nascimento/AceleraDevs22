package br.com.stefanini.aprendendocomeclipse.orientacaoobjetos;

public class Carro2 {

	private String marca;
	private String modelo;
	private int velocidadeMaxima;
	private int taxaAceleracao;
	private double quilometroPorLitro;
	
	//construtor
	public Carro2() {
		System.out.println("Construindo carro");
	}
	
	public Carro2(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
	
	
	//metodos de carros
	void acelerar() {
		System.out.println("Acelerando");
	}
	
	public void frear() {
		System.out.println("Freando");
	}
	
	public double calcularTaxaAceleracao(double velocidadeFinal, double velocidadeInicial, double tempoFinal, double TempoInicial) {
		return (velocidadeFinal - velocidadeInicial) / (tempoFinal - TempoInicial) * 3.6;
		
	}
	
	public double calcularTaxadeAceleracao(double velocidadeFinal, double tempoFinal) {
		return (velocidadeFinal - 0) / (tempoFinal - 0) * 3.6;
	}

	
	//sets e gets
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(int velocidadeMaxima) {
		if(velocidadeMaxima < 0) {
			System.out.println("Vaor é invalido");
		}else {
			this.velocidadeMaxima = velocidadeMaxima;
		}
		
	}

	public int getTaxaAceleracao() {
		return taxaAceleracao;
	}

	public void setTaxaAceleracao(int taxaAceleracao) {
		this.taxaAceleracao = taxaAceleracao;
	}

	public double getQuilometroPorLitro() {
		return quilometroPorLitro;
	}

	public void setQuilometroPorLitro(double quilometroPorLitro) {
		this.quilometroPorLitro = quilometroPorLitro;
	}
	

	
	
	
	
	
	
	

}
