package Observer;

public class MainRastreio {
	public static void main(String [] args){
		
		CarroPolicia policia = new CarroPolicia();
		CarroRoubado roubado = new CarroRoubado();
		
		roubado.addObserver(policia);
		
		roubado.frente();
		roubado.esquerda();
		roubado.direita();
		roubado.parar();
	}

}
