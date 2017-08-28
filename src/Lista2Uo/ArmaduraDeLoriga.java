package Lista2Uo;

public class ArmaduraDeLoriga  implements Armaduras {

	public int defesaDeLoriga;
	
	public ArmaduraDeLoriga(){
		this.defesaDeLoriga = +5;
	}

	public int defesa(){
		return this.defesaDeLoriga;
	}
}
