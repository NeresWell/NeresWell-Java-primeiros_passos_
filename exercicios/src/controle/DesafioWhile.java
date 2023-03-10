package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		// calcular media de alunos  
		// digitar nota valida 0 a 10 e armazenar em uma variavel totalNotasDigitadas (total soma de todas as notas)
		// variavel para contar notas validas para calcular a media
		// avisar nota invalida
		// calcular media totalNotasDigitadas / notasValidasdigitadas
		// sair digitar -1
		
		Scanner sc = new Scanner(System.in);

		double nota = 0;
		double total = 0;
		double tentativasValidas = 0;
		
		while(nota != -1) {
			System.out.println("Digite a nota: ");
			nota = sc.nextDouble();
			
			if (nota >= 0 && nota <= 10) {
				total = total + nota;
				tentativasValidas++;
			} else if (nota != -1) {
				System.out.println("Digite uma nota válida!");
			}
		}
		
		double media = total / tentativasValidas;
		System.out.println("Média: " + media);
		
		
		sc.close();
	}
}
