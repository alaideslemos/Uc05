package app;

import java.util.Scanner;

public class ControleEstoque {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		
		
		
		//1. Declaração das variáveis do protudo
		String nomeProduto = "Arroz 5kg";
		int quantidadeEstoque = 150;
		double precoProduto = 22.50;
		boolean disponivel = true;
		char categoria = 'A';
		long codigoBarras = 7891234567890l;
		
		//2. Exibir informações iniciais
		System.out.println("===Informações do produto ===");
		System.out.println("Nome:" + nomeProduto);
		System.out.println("Quantidade em estoque:" + quantidadeEstoque);
		System.out.println("Preco: R$" + precoProduto);
		System.out.println("Disponível:" + disponivel);
		System.out.println("Categoria: " + categoria);
		System.out.println("Codigo de barras: " + codigoBarras);
		
		//3. Simulação de venda
		System.out.print("\nDigite a quantidade vendida: ");
		int quantidadeVenda = entrada.nextInt();
		quantidadeEstoque -= quantidadeVenda;
		System.out.println("Ëstoque após a venda: " + quantidadeEstoque);
		
		//4. Simulação de reposição
		System.out.print("\nDigite a quantidade de reposição: ");
		int quantidadeReposição = entrada.nextInt();
		quantidadeEstoque += quantidadeReposição;
		System.out.println("Estoque após a reposição: " + quantidadeEstoque);
		
		entrada.close();
	} 

}
		
		
	
	
	
	
	
	


