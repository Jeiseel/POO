package Transportadora;

public class Sedex implements Frete {
	public double calculaPreco(int distancia){
		return distancia *1.45 + 12;
		
	}

}
