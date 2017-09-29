package TransportadoraStrategy;

import java.util.Scanner;

public class ExemploMain {
	public static void main(String [] args){
		try (Scanner leitor = new Scanner(System.in)){
			System.out.print("Informe a Distancia");
			int distancia = leitor.nextInt();
			System.out.print("Informe o tipo de Frete:\n [1] Para Norma:\n [2] Para Sedex:");
			int opcaoFrete = leitor.nextInt();
			TipoFrete tipoFrete = TipoFrete.values()[opcaoFrete - 1];
			Frete frete = TipoFrete.obterFrete();
			double preco = frete.calculaPreco(distancia);
			System.out.printf("O valor total é de R$.2f", preco);
		}
	}

}
