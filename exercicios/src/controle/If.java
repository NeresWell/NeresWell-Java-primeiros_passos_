package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		
		// scanner
		// informar média
		
		Scanner sc = new Scanner(System.in);
		
		double media = sc.nextDouble();
		
		if(media >= 9) {
			System.out.println("Mensagem 1");
			System.out.println("Mensagem 2");
		}
		
		sc.close();
	}
}
