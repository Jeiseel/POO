package MortalKombate;

public class NãoAtira implements ComportamentoAtirador {
	
	private int nada;
	
	
	public NãoAtira(int nada){
		this.nada = nada;
		
	}
	
	public NãoAtira(){
		this.nada = 0;
		
	}
	
	public int atirar(){
		return this.nada;
	}
}
