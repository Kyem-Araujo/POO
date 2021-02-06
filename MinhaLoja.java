package ExerciciosPOO;

import java.util.ArrayList;
import java.util.Scanner;

public class MinhaLoja {
public static void main (String [] args) {
	Scanner leia = new Scanner (System.in);
	int op;
	
	
	ArrayList<String>meuEstoque= new ArrayList();
	
	System.out.println("Bem vindes ao nosso sistema de controle de estoque."
			+ " Somos A ESTOCAVENTOS a maior e mais desenvolvida plataforma de sistema de controle de estoque do mundo!");
	
	do {
		System.out.println("\n          Qual atividade deseja realizar hoje: "           );
		System.out.println("**********************************************");
		System.out.println("(1)Para adicionar produtos ao estoque\n(2)Para remover produtos do estoque \n(3)Atualizar produtos do estoque "
				+ "\n(4)Mostrar todos os produtos do estoque\n(0)Finalizar atividades do programa");
		System.out.println("\n          Digite aqui a o��o desejada: "          );
		System.out.println("**********************************************");
		op=leia.nextInt();
		
		switch(op)
		{
			case 1:
				leia.nextLine();
				System.out.print("Digite o produto que voc� deseja adicionar ao estoque:");
				String produto = leia.nextLine();
				meuEstoque.add(produto);
				break;
			case 2:
				leia.nextLine();
				System.out.println("Informe que produto voc� deseja remover do estoque: ");
				String retirada = leia.nextLine();
				if(meuEstoque.contains(retirada))
				{
				meuEstoque.remove(retirada);
				}
				else
				{
					System.out.print("Opa! Parece que este produto n�o existe no estoque ou voc� j� removeu do estoque. "
							+ "Deseja enviar solicita��o de compra para o setor de compras?");
					
					System.out.println("1 -- Sim \n 2 -- N�O");
					op=leia.nextInt();
					
				
					
					switch (op) {
					
					case 1: System.out.println("Rela��o de produtos enviados para o setor de compras com sucesso ");
					break;
					case 2: System.out.println(" Rela��o de compras arquivada!");
					break;
					default:
					System.out.println(" Atividade finalizada! ");
						
					}
					
				}
				break;
				
			case 3:
				leia.nextLine();
				System.out.println("Digite o produto que quer atualizar: ");
				String verificacao = leia.nextLine();
				System.out.println("Digite o nome do produto que entrar� no lugar de "+verificacao+":");
				String novoItem = leia.nextLine();
				
				if(meuEstoque.contains(verificacao))
				{
					meuEstoque.remove(verificacao);
					meuEstoque.add(novoItem);
				}
				else
				{
					System.out.println("Este produto que voc� deseja atualizar n�o existe!!!");
				}
				System.out.println(meuEstoque);
				break;
	
			case 4:
				
				System.out.println(" Os produtos  do estoque:");
				System.out.println(meuEstoque);
				break;
				
			default:
				System.out.println("Programa finalizado!!!");
		
			}
		
	}while(op!=0);
}

}
