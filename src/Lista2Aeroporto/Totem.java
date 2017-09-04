package Lista2Aeroporto;

import java.util.ArrayList;
import java.util.List;

public class Totem implements Observer{
	private List<Voo> voos;
	private TipoVoo tipoTotem;
	private Subject bdVoo;
	
	public Totem(TipoVoo tipoTotem){
		this.tipoTotem = tipoTotem;
		voos = new ArrayList<Voo>();
	
	}
	
	public void setBDVoo(Subject bdVoo){
		this.bdVoo = bdVoo;
		this.bdVoo.addObserver(this);
	}
	
	public void Update(){
		List<Voo> data = (List<Voo>) bdVoo.getData();
		List<Voo> voosNoBd = data;
		for(Voo v: voosNoBd){
			if(v.getTipo().equals(tipoTotem)){
				voos.add(v);
			}
		}
	}
	
	public String toString(){
		String ouput = "";
		for(Voo v: voos){
			ouput += v.toString() + "\n";
		}
		return ouput;
	}

}
