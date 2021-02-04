package ExerciciosPOO;

public class Cavalo extends Animal{
	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}
@Override
public void som () {
	
	System.out.println("Riiiim riiiim");

}
@Override
public void habilidade() {
	System.out.println("Uma das habilidades do seu animal é correr");
}
}