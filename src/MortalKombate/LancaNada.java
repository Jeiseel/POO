package MortalKombate;

public class LancaNada implements ComportamentoBruxo{
	
	private int nada;
	
	
	public LancaNada(int nada){
		this.nada = nada;
		
	}
	
	public LancaNada(){
		this.nada = 0;
		
	}
	
	public int lancaMagia(){
		return this.nada;
	}

}
