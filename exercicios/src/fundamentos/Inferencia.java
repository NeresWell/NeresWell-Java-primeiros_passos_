package fundamentos;

public class Inferencia {

	public static void main(String[] args) {
		
		// Recurso java 10
		// Infere valor e determina tipo de variável
		// não pode associar valores diferente do primeiro
		double a = 4.5;
		System.out.println(a);
		
		var b = 4.5; // o java entende q é double
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
		
		double d;
		d = 123.65;
		System.out.println(d);
		
		// var e;
		// e = 123.45;
	}
}
