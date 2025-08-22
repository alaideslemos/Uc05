//1 . Define o pacote
package app;
//2. Crie uma classe
public class Mercado {
// 3. Metodo principal
	public static void main(String[] args) {
		// 3.1 Declaraçao de variaveis
		
		//Dados do produto
		String nomeProduto = "Arroz Camil 5kg";
		double precoProduto = 27.90;
		int estoqueProduto = 120;
		//Dados do cliente
		String nomeCliente = "Ana Carolina";
		int idadeCliente = 35;
		char generoCliente = 'F';
		//Dados do caixa
		int numeroCaixa = 3;
		boolean caixaAberto = true;
		//Exibir as informações
		
		System.out.println("=== SISTEMA DE MERCADO ===");
		System.out.println("Produto" + nomeProduto);
		System.out.println("Preco" + precoProduto);
		System.out.println("Estoque" + estoqueProduto + "Unidades");
		System.out.println("Cliete" + nomeCliente);
		System.out.println("Cliente" + nomeCliente + " ("+ idadeCliente + "anos)");
		System.out.println("Caixa nº = + numeroCaixa + = Aberto?"+ caixaAberto );

	}

}
