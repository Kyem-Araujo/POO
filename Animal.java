package ExerciciosPOO;

public abstract class Animal {
	protected String nome;
	protected int idade;
	
	public Animal() {
		
	}
	
	public Animal(String nome, int idade) {
		
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void imprimirPet() {
		System.out.println("*** INFORMAÇÕES SOBRE PET *** \nNome:" +getNome()+ "\nIdade: " +getIdade());
	}
	 public abstract void som();
	 public abstract void habilidade ();
}
