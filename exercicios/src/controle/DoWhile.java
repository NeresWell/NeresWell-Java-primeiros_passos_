package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String palavra = "";
		
		do {
			System.out.println("palavra: ");
			palavra = sc.next();
			
		} while (!palavra.equalsIgnoreCase("sair"));
		
		System.out.println("Obrigado.");
		sc.close();
	}
}
