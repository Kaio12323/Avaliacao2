package avaliacao2.questao9;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		rodaprograma();
	}
	public static void rodaprograma(){
		Decisao decisao = new Decisao();
		decisao.Decide(Entrada());
	}
	
	public static int Entrada(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Bem vindo");
		System.out.println("1.Cadastrar ofertas");
		System.out.println("2.Atualizar Oferta");
		System.out.println("3.Excluir oferta");
		System.out.println("4.Listar Produtos");
		System.out.println("0.Sair do programa");
		System.out.println("Escolha uma opção:");
		int escolha = sc.nextInt();
		return escolha;
	}
	
	}


