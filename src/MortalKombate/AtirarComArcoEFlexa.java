package MortalKombate;

public class AtirarComArcoEFlexa implements ComportamentoAtirador{
	
	private int flexa;
	
	
	public AtirarComArcoEFlexa(int flexa){
		this.flexa = flexa;
		
	}
	
	public AtirarComArcoEFlexa(){
		this.flexa = -4;
		
	}
	
	public int  atirar(){
		return this.flexa;
	}
}
