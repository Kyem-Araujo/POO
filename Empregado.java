package ExerciciosPOO;

public class Empregado extends Pessoa {
	private int codigoSetor;
	private float salarioBase;
	private float imposto;
	
	
	public Empregado(String nome, String endereco, String telefone, 
			int codigoSetor, float salarioBase, float imposto) {
		super(nome, endereco, telefone);
		this.codigoSetor=codigoSetor;
		this.salarioBase=salarioBase;
		this.imposto=imposto;
		
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getImposto() {
		return imposto;
		
	}

	public void setImposto(float imposto) {
		this.imposto = imposto;
		
	}
	
	public float calcularSalario () {
		imposto*=salarioBase/100;
		return getSalarioBase() - getImposto();
	}
	public void imprimirInformacoes() {
		System.out.println("*** INFORMAÇÕES SOBRE FUNCIONÁRIO *** \nNome do Empregado: "+getNome()+"\nCódigo do Setor: " +getCodigoSetor()+" \nEndereço: "+getEndereco()+
				" \nTelefone: "+getTelefone()+ " \nSalario: "+calcularSalario());
	}

}
