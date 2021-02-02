package ExerciciosPOO;

public class Aviao {
	private String nomeCompanhia;
	private String nomePiloto;
	private String destino;
	private int capacidade;
	
	public Aviao (String nomeCompanhia, String nomePiloto, String destino , int capacidade) {
		
		this.nomeCompanhia = nomeCompanhia;
		this.destino = destino;
		this.nomePiloto = nomePiloto;
		this.capacidade = capacidade;		
			
	}		
	public void infoaviao() {
			System.out.println("Companhia: "+nomeCompanhia+"\nPilotado por: "+nomePiloto+"\n Destino:"+destino+"\nCapacidade:"+capacidade);
	}

}
