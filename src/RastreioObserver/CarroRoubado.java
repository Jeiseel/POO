package RastreioObserver;

import java.util.Observable;

public class CarroRoubado extends Observable implements Carro{
	
	private String acao ="";
	
	public void frente(){
		acao = "frente";
		System.out.println("Carro Roubado segue em frente!");
		this.mudaEstado();
	}
	
	public void direita(){
		acao = "direita";
		System.out.println("Carro Roubado Vira a Direita!");
		this.mudaEstado();
	}
	
	public void esquerda(){
		acao = "esquerda";
		System.out.println("Carro Roubado vira a Esquerda!");
		this.mudaEstado();
	}
	
	public void parar(){
		acao = "parar";
		System.out.println("Carro Roubado Para!");
		this.mudaEstado();
	}
	
	public void mudaEstado(){
		setChanged();
		notifyObservers(acao);
	}

}
