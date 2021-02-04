package ExerciciosPOO;

import java.util.Scanner;

public class RodandoBicharada {
	public static void main(String args[]) {
		
		Scanner leia=new Scanner (System.in);
		int n;
		System.out.print("Informe o nome do seu pet: ");
		String nome=leia.nextLine();
		System.out.print("Informe a idade do seu pet: ");
		int idade=leia.nextInt();
		do {
			
		System.out.print("Seu pet é :\n1- Cachorro \n2--Cavalo \n3--Preguiça ");
		n=leia.nextInt();
		if(n<1 || n>3) {
			System.out.print("Resposta inválida, por favor, informe novamente\n");
			
		}
		}while(n<1 || n>3);

		Cachorro dog=new Cachorro(nome, idade);
		Cavalo horse=new Cavalo(nome, idade);
		Preguica sloth=new Preguica(nome, idade);
	
	
	if(n==1) {
		
		dog.imprimirPet();
		dog.som();
		dog.habilidade();
	}
	else if(n==2) {
		horse.imprimirPet();
		horse.som();
		horse.habilidade();
		
	}
	else {
		sloth.imprimirPet();
		sloth.som();
		sloth.habilidade();
	}
	
	}
}
		
	

