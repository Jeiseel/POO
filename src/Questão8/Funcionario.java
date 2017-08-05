package Questão8;

public class Funcionario extends Pessoa8 {
	float salario;
	
	public Funcionario(String nome, int dia, int mes, int ano, float salario){
		super();
		this.salario = salario;
	}
	public float calculaImposto(){
		return (float) (salario*0.03);
	}
	
	public String imprimeDados(){
		String msg = "Funcionario:" + super.nome + "\n Nascimento:" + super.nascimento + "\n Salario $:" + super.salario + "\n Imposto" +
		(this.salario +  this.calculaImposto());
		return msg;
	}

}
