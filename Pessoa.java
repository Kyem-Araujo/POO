package ExerciciosPOO;

public class Pessoa {
	//declarando atributos
	private String nome;
	private String endereco;
	private String telefone;
	
	//construtor
	
	public Pessoa (String nome, String endereco, String telefone) {
		this.nome=nome;
		this.endereco=endereco;
		this.telefone=telefone;
	
	}
	// Declarando outros métodos
	
	public void printarTudoInfo () { 
		System.out.println("Nome: "+nome+ "Endereço: " +endereco+ " Telefone: " +telefone);
		
	}
	public void printParcialInfo() {
		System.out.println("Nome: "+nome+ "Telefone: " +telefone);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
