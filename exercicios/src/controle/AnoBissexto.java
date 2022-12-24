package controle;

import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ano = sc.nextInt();
		
		if (ano % 4 == 0) {
			System.out.println("ano bissexto.");
		} else {
			System.out.println("não é ano bissexto");
		}
		sc.close();
	}
}
