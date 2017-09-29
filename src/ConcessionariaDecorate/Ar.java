package ConcessionariaDecorate;

public class Ar extends Acessorios{

	public Ar(Acessorios outroAcessorio){
		super(outroAcessorio);
	}
	public Ar(){
		
	}
	
	public double calculaValor(Veiculo veiculo) {
		System.out.println("Ar-condicionado:");
		return 2000 +calcula(veiculo);
	}

}
