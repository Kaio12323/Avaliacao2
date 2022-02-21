package avaliacao2.questao9;

import java.util.List;
import java.util.Scanner;

import avaliacao2.questao9.controller.ProdutoController;
import avaliacao2.questao9.modelo.Produto;



public class Decisao {
	int escolha;
	private ProdutoController produtoController;
	
	public Decisao() {
	produtoController = new ProdutoController();
	}
	
	public void Decide(int escolha) {
		if (escolha == 1) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite o id do produto:");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Digite o nome do produto:");
			String nome = sc.nextLine();
			System.out.println("Digite a descrição do produto:");
			String descricao = sc.nextLine();
			System.out.println("Digite o valor do produto:");
			Float valor = sc.nextFloat();
			sc.nextLine();
			System.out.println("Digite o desconto do produto:");
			String desconto = sc.nextLine();
			Produto produto = new Produto(id, nome, descricao, valor, desconto);
			produtoController.salvar(produto);
			Main.rodaprograma();
			sc.close();
			
		}else if (escolha == 2) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite o novo id do produto que deseja alterar:");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Digite o novo nome do produto:");
			String nome = sc.nextLine();
			System.out.println("Digite a nova descrição do produto:");
			String descricao = sc.nextLine();
			produtoController.alterar(nome, descricao, id);
			List<Produto> listar = produtoController.listar();
			System.out.println(listar);
			Main.rodaprograma();
			sc.close();
			
		}else if (escolha == 3) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite o id do produto a ser escolhido:");
			int id = sc.nextInt();
			produtoController.deletar(id);	
			List<Produto> listar = produtoController.listar();
			System.out.println(listar);
			Main.rodaprograma();
			sc.close();
			
		}else if (escolha == 4) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite sua busca:");
			String nome = sc.nextLine();
			List<Produto> listar = produtoController.listar(nome);
			System.out.println(listar);
			Main.rodaprograma();
			sc.close();
			
		}else if(escolha == 0 ) {
			System.out.println("FIM DO PROGRAMA!");
		}else if(escolha<0 || escolha>4) {
			System.out.println("ESCOLHA INVÁLIDA! TENTE NOVAMENTE.");
			Main.rodaprograma();
		}
	}
}
