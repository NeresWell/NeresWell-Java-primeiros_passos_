package classe;

public class Produto {

	// 25% de desconto
	// aplicar o mesmo desconto para todos os produtos
	
	String nome;
	double preco;
	static double desconto = 0.25;

	Produto(){}
	
	Produto(String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
	double precoComDesconto(double descontoGerente) {
		return preco * (1 - desconto + descontoGerente);
	}
}
