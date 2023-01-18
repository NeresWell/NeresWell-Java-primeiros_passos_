package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos alunos: ");
		int qtdAluno = sc.nextInt();
		
		System.out.println("Quantas notas por aluno: ");
		int qtdNotas = sc.nextInt();
		
		double[][] notasDaTurma = new double[qtdAluno][qtdNotas];
		
		double total = 0;
		for (int a = 0; a < notasDaTurma.length; a++) {
			for (int n = 0; n < notasDaTurma[a].length; n++) {
				System.out.printf("Informe a nota %d do aluno %d: ", n +1, a +1);
				notasDaTurma[a][n] = sc.nextDouble();
				total += notasDaTurma[a][n];
			}
		}
		
		double media = total / (qtdAluno * qtdNotas);
		System.out.println("Média da turma é " + media);
		
		for(double[] notasDoAluno: notasDaTurma) {
			System.out.println(Arrays.toString(notasDoAluno));
		}
		
		sc.close();
	}	
}
