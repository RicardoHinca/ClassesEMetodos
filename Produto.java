package classe;

public class Produto {

// a classe vai ter 3 atributos
	String nome;
	double preco;
	static double desconto = 0.25;
	
//construtor 
	Produto (){
		
	}
	Produto (String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
	}
//metodo criado para o preço com desconto 
	double precoComDesconto () {
		return preco * (1 - desconto);
	}
	double precoComDesconto (double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
	}
}
