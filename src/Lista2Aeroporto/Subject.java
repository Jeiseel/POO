package Lista2Aeroporto;

public interface Subject {
	
	public void addObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObserver();
	public Object getData();

}
