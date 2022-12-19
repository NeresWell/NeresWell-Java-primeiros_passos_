package operadores;

public class Ternario {
	public static void main(String[] args) {
		
		double media = 4.6;

		String resultadoFinal = media >= 7.0 ? "aprovado." : 
			media >= 5.0 ? "em recuperação." : "reprovado";
		System.out.println("O aluno está " + resultadoFinal);
	}
}
