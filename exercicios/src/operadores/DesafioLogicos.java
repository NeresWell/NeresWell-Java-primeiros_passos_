package operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		// trabalho na terça (V ou F)
		// trabalho na quinta (V ou F)
		// se os 2 trabalhos deu certo TV 50 e sorvete
		// se 1 trabalho deu certo TV 32 e sorvete
		// 2 trabalho deu errado e nao vai tomar sorvete (FICOU COM FOME)
		// mapear as operações lógicas
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		boolean comprouTv32 = trabalho1 ^ trabalho2;
		boolean comprouTv50 = trabalho1 && trabalho2;
		boolean sorvete = comprouTv32 || comprouTv50;
		boolean saude = !comprouTv32 && !comprouTv50;

		System.out.println("Comprou TV32: " + comprouTv32);
		System.out.println("Comprou TV50: " + comprouTv50);
		System.out.println("Sorvete: " + sorvete);
		System.out.println("Não deu Certo: " + saude);
	}
}
