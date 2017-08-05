package Questão8;

public abstract class Pessoa8 {
	
	String nome;
	Data nascimento;
	double salario;
	
	public void Pessoa (String nome, int dia, int mes, int ano){
		this.nome = nome;
		this.nascimento = new Data(dia,mes,ano);
	}
	public abstract String imprimeDados();

}
