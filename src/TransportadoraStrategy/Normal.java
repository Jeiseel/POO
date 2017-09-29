package TransportadoraStrategy;

public class Normal implements Frete{
	
	public double calculaPreco(int distancia){
		return distancia* 1.25 + 10;
	}
}


