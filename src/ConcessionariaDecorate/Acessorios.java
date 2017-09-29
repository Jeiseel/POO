package ConcessionariaDecorate;

public abstract class Acessorios {
	
	protected Acessorios outroAcessorio;
	
	public Acessorios(Acessorios outroAcessorio){
		this.outroAcessorio = outroAcessorio;
	}
	
	public Acessorios(){
		
	}
	public abstract double calculaValor(Veiculo veiculo);
	
	protected double calcula(Veiculo veiculo){
		if(outroAcessorio == null){
			return 0;
		}else{
			return outroAcessorio.calculaValor(veiculo);
		}
	}

}
