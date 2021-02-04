package ExerciciosPOO;

public class Cachorro extends Animal {
	public Cachorro(String nome, int idade) {
		super (nome, idade);
	}
	
@Override

public void som () {
	
	System.out.println(" au au au");
		
	}

@Override
public void habilidade() {
	System.out.println("Uma das habilidades do seu animal é correr");
	
}
}
