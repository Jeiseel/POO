package ConcessionariaDecorate;

public class TesteConcessionaria {
	public static void main(String [] args){
		Veiculo veiculo = new Veiculo(45000);
		Acessorios comAr = new Ar();
		Acessorios comDirecao = new Direcao();
		Acessorios cambio = new Cambio();
		Acessorios completo = new Ar(new Direcao(new Cambio()));
		
		
		double valor1 = comAr.calculaValor(veiculo);
		double valor2 = comDirecao.calculaValor(veiculo);
		double valor3 = cambio.calculaValor(veiculo);
		double valor4 = completo.calculaValor(veiculo);
		
		
		System.out.println(valor1);
		System.out.println(valor2);
		System.out.println(valor3);
		System.out.println(valor4);
	}

}
