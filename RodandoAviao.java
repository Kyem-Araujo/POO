package ExerciciosPOO;

import java.util.Scanner;

public class RodandoAviao {
	public static void main (String args []) {

			String nomePiloto = null, companhia = null, destino = null;
			int  p, capacidade = 0;
			Scanner leia = new Scanner (System.in);
					
			System.out.println("Quantos aviões darão partida hoje?");
			 p = leia.nextInt();
					
			Aviao[] objAviao = new Aviao [p];
			
			for (int x=0;x<p;x++) {
				
				System.out.println("Qual companhia?");
				companhia = leia.next();
				System.out.println("Qual nome do Piloto?");
				nomePiloto = leia.next();
				System.out.println("Qual é o destino?");
				destino = leia.next();
				System.out.println("Qual capacidade do avião?");
				capacidade = leia.nextInt();
				
				objAviao[x] = new Aviao (companhia,nomePiloto, destino,capacidade);
									
			}				
			
			for (int x=0;x<p;x++) {
				
				objAviao[x].infoaviao();
				System.out.println("\nCompanhia: "+companhia+ " \nCapacidade de: " +capacidade+ "\nPilotado por"+nomePiloto+ "\ndestino" +destino );
			}
			
			
		}

	

	

}
