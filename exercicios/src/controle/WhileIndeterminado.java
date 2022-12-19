package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("palavra: ");
		String valor = sc.next();
		
		while(!valor.equalsIgnoreCase("sair")) {
			System.out.println("palavra: ");
			valor = sc.next();
		}
		
		System.out.println("saiu do programa.");
		sc.close();
	}
}
