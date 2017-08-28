package MortalKombate;

public class Lutador {
	
	ComportamentoBruxo bruxo;
	ComportamentoAtirador atirar;
	
	private int life = 100;
	private int socar = - 3;
	private int chutar = - 5;
	private int defender = -1;

	public int socar(){
		return this.socar;
	}
	
	public int chutar(){
		return this.chutar;
	}
	
	public int defender(){
		return this.defender;
	}
	public int lancaMagia(){
		return bruxo.lancaMagia();
	}
	public int atirar(){
		return atirar.atirar();
	}
	
}
