package MortalKombate;

public class LancaBolaDeFogo implements ComportamentoBruxo{
	
	private int BolaDeFogo;
	
	
	public LancaBolaDeFogo(int BolaDeFogo){
		this.BolaDeFogo = BolaDeFogo;
		
	}
	
	public LancaBolaDeFogo(){
		this.BolaDeFogo = -10;
	}

	public int lancaMagia(){
		return this.BolaDeFogo;
	}

}
