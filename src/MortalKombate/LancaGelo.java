package MortalKombate;

public class LancaGelo implements ComportamentoBruxo {
	
	private int gelo;
	
	public LancaGelo(int gelo){
		this.gelo = gelo;
	}
	
	public LancaGelo(){
		this.gelo = -5;
	}
	
	public int lancaMagia(){
		return this.gelo;
	}

}
