package Editora;

import java.util.List;

public class Assinante {
	private Subject subject;
	private String nome;
	private String email;
	private int cpf;
	
	private List<String> revistas;
	
	public Assinante(String nome, String email, int cpf){
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
	}
	
	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getEmail(){
		return this.email;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public int getCpf(){
		return this.cpf;
	}
	
	public void setCpf(int cpf){
		this.cpf = cpf;
	}
	 
	
	

}
