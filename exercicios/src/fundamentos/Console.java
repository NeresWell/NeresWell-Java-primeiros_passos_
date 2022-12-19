package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {

		System.out.print("Bom");
		System.out.print("dia!\n\n");
		
		System.out.println("Bom");
		System.out.println("dia!");
		
		System.out.printf("Megasena %d %d %d %d %d %d", 1,2,3,4,5,6);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = sc.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = sc.nextInt();
		
		sc.nextLine(); // le o \n ao apertar Enter
		
		System.out.printf("%s %s tem %d anos.%n", nome, sobrenome, idade);
		
		sc.close();
	}
}
