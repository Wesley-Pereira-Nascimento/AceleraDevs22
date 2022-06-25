package br.com.stefanini.aprendendocomeclipse.vetor;

public class Vetor2 {
	public static void main(String[] args) {
String[] meses = new String[] {"Janeiro", "Fevereiro", "Março", "Abril", "Maio"};
		
		System.out.println(meses.length);
		
		for(String m: meses) {
			System.out.println(m);
		}
		
		int[][] matriz = new int[5][5];
		
		matriz[0][1] = 5;
		matriz[2][4] = 10;
		matriz[3][2] = 15;
		
		for(int [] m : matriz) {
			for(int v : m) {
				System.out.println(v);
				
			}
		}
	}
}
