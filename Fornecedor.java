package ExerciciosPOO;

public class Fornecedor extends Pessoa{
	private float valorCredito;
	private float valorDivida;

	
	public Fornecedor(String nome, String endereco, String telefone, float valorCredito, float valorDivida) {
		super(nome, endereco, telefone);
		
		this.valorCredito = valorCredito;
		this.valorDivida =valorDivida;
		
	}
	
	
	public float getValorCredito() {
		return valorCredito;
	}


	public void setValorCredito(float valorCredito) {
		this.valorCredito = valorCredito;
	}


	public float getValorDivida() {
		return valorDivida;
	}


	public void setValorDivida(float valorDivida) {
		this.valorCredito = valorDivida;
	}


	public float obterSaldo () {
		return getValorCredito()-getValorDivida();

	}
	public void imprima () {
		System.out.println("***Informações do Fornecedor***\nNome: " +getNome()+ "\nEndereço: "+getEndereco()+ "\nTelefone: "+getTelefone()+
				"\nO Saldo do fornecedor é: " +obterSaldo());
	}
}
