package br.com.stefanini.aprendendocomeclipse.operadores;

public class OperadoresLogicos {
	public static void main(String[] args) {
		/**
		 *AND
		 *V AND F => F
		 *V AND v => v
		 *F AND V => F
		 *F AND F => F
		 *
		 *OR
		 *V OR F => V
		 *V OR V => V
		 *F OR V => V
		 *F OR F => F
		 *
		 *XOR
		 *V XOR F =>V
		 *V XOR V =>F
		 *F XOR V =>V
		 *F XOR F =>F
		 *
		 *NEGACAO LOGICA
		 *!V => F
		 *!F => V
		 */
		
		boolean v = true;
		boolean f = false;
		
		// and &&
		
		System.out.println(v && f);
		
		//or ||
		System.out.println(v || f);
		
		//xor !=
		
		System.out.println(v != f);
		
		//!
		
		System.out.println(!v);
		System.out.println(!f);
	}
}
