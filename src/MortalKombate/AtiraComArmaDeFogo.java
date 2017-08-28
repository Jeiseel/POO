package MortalKombate;

public class AtiraComArmaDeFogo implements ComportamentoAtirador{
	private int tiro;
	
	
	public AtiraComArmaDeFogo(int tiro){
		this.tiro = tiro;
		
	}
	
	public AtiraComArmaDeFogo(){
		this.tiro = -5;
	
	}
	
	public int  atirar(){
		return this.tiro;
	}

}
