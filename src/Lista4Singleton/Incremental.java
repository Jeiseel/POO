package Lista4Singleton;

public class Incremental {
	
	private static int cont =0;
	private int numero;
	public static Incremental uniqueInstance;
	Incremental(){}
	
	public static Incremental getInstance(){
		if(uniqueInstance == null){
			uniqueInstance = new Incremental();
		return uniqueInstance;
		}
		return uniqueInstance;
	}
	
	public String toString(){
		return"Incremental " + numero;
	}

}
