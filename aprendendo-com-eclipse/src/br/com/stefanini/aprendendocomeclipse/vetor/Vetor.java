package br.com.stefanini.aprendendocomeclipse.vetor;

public class Vetor {
	public static void main(String[] args) {
		int[] notas = new int[10];
		
		notas [0] = 5;
		notas [2] = 9;
		notas [6] = 2;
		notas [4] = 4;
		notas [1] = 7;
		notas [9] = 8;
		notas [7] = 8;
		
		String[] carros = new String[] {"BMW","Mercedes","Tesla", "Corsa"};
		System.out.println(carros.length);
		
		for (String carro: carros) {
			System.out.println(carro);
		}
		for (int i = 0 ; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
	}
}
