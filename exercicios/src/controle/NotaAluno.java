package controle;

import java.util.Scanner;

public class NotaAluno {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		double media = (nota1 + nota2) / 2;
		
		if (media >= 7) {
			System.out.println("aprovado");
		} else if (media >= 4 && media < 7) {
			System.out.println("recuperação");
		} else {
			System.out.println("reprovado");
		}
		
		sc.close();
	}
}
