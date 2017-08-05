package Questão8;

public class Cliente extends Pessoa8 {
	int cod;
	String nome;
	
	public Cliente(String nome, int dia,int mes, int ano, int cod){
		super();
		this.cod = cod;
	}
	
	public String imprimeDados(){
		String msg = "Cliente:" + super.nome + "\n Nascimento:" + super.nascimento + "\n Codigo:" + getCodigo();
		return msg;
	}
	public int getCodigo(){
		return this.cod;
	}
	

}
