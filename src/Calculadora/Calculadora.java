package Calculadora;

public class Calculadora {
	
	public int maior(int a, int b){
		return a>b? a:b;
	}
	
	public int soma(int...num){
		int resultado = 0;
		for(int i: num){
			resultado +=i;
		return resultado;
		}
		return resultado;
	}
	
	public int subtrai(int a, int b){
		return a- b;
	}
	
	public double raiz(double num){
		return Math.sqrt(num);
	}
	public double media(double...numeros){
		double resultado =0;
		for(double i:numeros)
			resultado +=i;
		return resultado/numeros.length;
	}
	

}
