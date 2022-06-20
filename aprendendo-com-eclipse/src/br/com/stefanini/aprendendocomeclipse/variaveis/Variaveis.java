package br.com.stefanini.aprendendocomeclipse.variaveis;

public class Variaveis {
	public static void main(String[] args) {
		byte numByte = 110; //-128 a 127 (8bits)
		short numShort = 12321; //-321768 a 21767 (16bits)
		int numInt = 43333543; //-2.147.483.648 a 2.147.483.648 (32bits)
		long numLong = 234234232; //-9.223.372.036.854.770.000 a 9.223.372.036.854.770.000 (64bits)
		float numFloat = 10.000f;
		double numDouble = 10000000000000000.000;
		
		char varChar = 'f'; // 0 a 65535
		
		boolean varBoolean = true; // true ou false (1bit)
		
		String texto = "Hello Devs";
		Integer numeroConta = 4000;
		Long numeroLongo = 12343231L;
		String nomeCompleto = "Wesley Pereira do Nascimento";
		
		System.out.println(numByte);
		System.out.println(numShort);
		System.out.println(numInt);
		System.out.println(numLong);
		System.out.println(numFloat);
		System.out.println(numDouble);
		System.out.println(varChar);
		System.out.println(varBoolean);
		System.out.println(texto);
		System.out.println(numeroConta);
		System.out.println(numeroLongo);
		
		System.out.println(nomeCompleto);
	}
}
