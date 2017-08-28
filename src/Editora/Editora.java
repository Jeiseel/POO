package Editora;

import java.util.ArrayList;
import java.util.List;

public class Editora implements Subject {
	
	private List<Assinante> observers;
	private String revistaAtual;
	
	public Editora(){
		this.observers = new ArrayList<Assinante>();
	}
	
	public void Subject(){
	
	}
	
	public void registerObserver(){
		
	}
	
	public void removeObserver(){
		
	}
	
	public void notifyObserver(){
	
	}
	public void getState(){
		
	}
	
}
