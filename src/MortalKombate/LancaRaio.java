package MortalKombate;

public class LancaRaio implements ComportamentoBruxo {

	private int raio;
	
	public LancaRaio(int raio){
		this.raio = raio;
	}
	
	public LancaRaio(){
		this.raio = -10;
	}
	
	public int lancaMagia(){
		return this.raio;
	}
}
