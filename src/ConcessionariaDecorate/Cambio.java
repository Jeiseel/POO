package Concessionaria;

public class Cambio extends Acessorios {
	
	
	public Cambio(Acessorios outroAcessorio){
		this.outroAcessorio = outroAcessorio;
	}
	
	public Cambio(){
		
	}
	
	public double calculaValor(Veiculo veiculo){
		System.out.println("Cambio Automatico");
		return 1500 + calcula(veiculo);
	}
}
