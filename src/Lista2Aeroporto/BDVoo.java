package Lista2Aeroporto;

import java.util.List;

public class BDVoo implements Subject {

	private List<Observer> observers;
	private List<Voo> voos;
	
	
	public void addObserver(Observer o) {
		if(!observers.contains(o)){
			observers.add(o);
		}
	}

	
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	
	public void notifyObserver() {
		for(Observer x: observers){
			x.Update();
		}
	}
	@Override
	public List<Voo> getData() {
		return voos;
	}
	
	public void addVoo(Voo v){
		if(!voos.contains(v)){
			voos.add(v);
			notifyObserver();
		}
	}	
}
