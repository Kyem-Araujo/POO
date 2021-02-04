package ExerciciosPOO;

import java.util.Scanner;

public class RodandoFornecedor {

	public static void main(String[] args) {
		Scanner leia=new Scanner (System.in);
		System.out.print(" Informe o nome do Fornecdor \n Dado: ");
		String nome=leia.nextLine();
		System.out.print(" Informe endereço do Fornecedor \ninf: ");
		String endereco=leia.nextLine();
		System.out.print(" Informe o telefone do Fornecedor \ntel: ");
		String telefone=leia.nextLine();
		System.out.print(" Informe o valor do credito d Fornecedor \ninf: ");
		float valorCredito=leia.nextFloat();
		System.out.print(" Informe o valor da divida do Fornecedor \ninf: ");
		float valorDivida=leia.nextFloat();
		
		Fornecedor fonte = new Fornecedor(nome,endereco, telefone,valorCredito, valorDivida);
		
		fonte.imprima();
		
	}
	
}
