package Singleton;

public class GerenciadorDeTempo {
	
	private static GerenciadorDeTempo tempo;
	private GerenciadorDeTempo(){}
	public static GerenciadorDeTempo getTempo1(){
		if(tempo==null){
			tempo = new GerenciadorDeTempo();
		}
		return tempo;
	}
	
	public GerenciadorDeTempo(int tempo){
		tempo = 1;
	}
	
	public GerenciadorDeTempo getTempo(){
		return tempo;
	}
	
	public int setTempo(int tempo){
		return tempo;
	}

	
}
