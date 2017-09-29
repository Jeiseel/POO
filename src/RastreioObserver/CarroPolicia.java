package RastreioObserver;

import java.util.Observable;
import java.util.Observer;

public class CarroPolicia implements Observer, Carro{
	
	public void frente(){
		System.out.println("Policia Segue em frente!\n");
	}
	
	public void direita(){
		System.out.println("Policia Vira a Direita!\n");
	}
	
	public void esquerda(){
		System.out.println("Policia Vira a Esquerda!\n");
	}
	
	public void parar(){
		System.out.println("Policia Parar!\n");
	}
	
	public void update(Observable arg0, Object arg1){
		CarroRoubado carroObservado = (CarroRoubado) arg0;
		String acao = String.valueOf(arg1);
		if (acao.equals("frente")){
			this.frente();
		}
		else if(acao.equals("direita")){
			this.direita();
		}
		else if (acao.equals("esquerda")){
			this.esquerda();
		}
		else if(acao.equals("parar")){
			this.parar();
		}
	}
}
