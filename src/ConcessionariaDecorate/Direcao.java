package ConcessionariaDecorate;

public class Direcao extends Acessorios{
	
	public Direcao(Acessorios outroAcessorio){
		super(outroAcessorio);
	}
	
	public Direcao(){
		
	}
	
	public double calculaValor(Veiculo veiculo){
		System.out.println("Direção Hidraulica");
		return 1000 + calcula(veiculo);
	}
}
