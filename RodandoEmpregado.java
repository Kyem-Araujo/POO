package ExerciciosPOO;

import java.util.Scanner;

public class RodandoEmpregado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia=new Scanner (System.in);
		System.out.print("Informe o nome do funcionário: ");
		String nome=leia.nextLine();
		System.out.print("Informe endereço do funcionário: ");
		String endereco=leia.nextLine();
		System.out.print("Informe o telefone do funcionário: ");
		String telefone=leia.nextLine();
		System.out.print("Informe o Código do Setor do funcionário:");
		int codigoSetor=leia.nextInt();
		System.out.print("Informe o Salário Base do funcionário: ");
		float salarioBase=leia.nextFloat();
		System.out.print("Informe o percentual de impostos a serem debitados do salário:");
		float imposto=leia.nextFloat();
		System.out.print("-----------------------------------------------------------------\n");
		Empregado funcionario=new Empregado(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		funcionario.imprimirInformacoes();
	}
	

}
