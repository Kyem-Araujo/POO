package ExerciciosPOO;

import java.util.Scanner;

public class RodandoEmpregado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia=new Scanner (System.in);
		System.out.print("Informe o nome do funcion�rio: ");
		String nome=leia.nextLine();
		System.out.print("Informe endere�o do funcion�rio: ");
		String endereco=leia.nextLine();
		System.out.print("Informe o telefone do funcion�rio: ");
		String telefone=leia.nextLine();
		System.out.print("Informe o C�digo do Setor do funcion�rio:");
		int codigoSetor=leia.nextInt();
		System.out.print("Informe o Sal�rio Base do funcion�rio: ");
		float salarioBase=leia.nextFloat();
		System.out.print("Informe o percentual de impostos a serem debitados do sal�rio:");
		float imposto=leia.nextFloat();
		System.out.print("-----------------------------------------------------------------\n");
		Empregado funcionario=new Empregado(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		funcionario.imprimirInformacoes();
	}
	

}
