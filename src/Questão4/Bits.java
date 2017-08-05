package Questão4;

public class Bits {
	
	boolean [] bits;
	
	public Bits(int tamanho){
		bits = new boolean [tamanho];
	}
	public boolean[] getConjuntoBits(){
		return bits;
	}
	
	public void setConjuntoBits(boolean [] bits){
		this.bits = bits;
	}
	
	public void mudaBits(boolean valor, int pos){
		this.bits[pos] = valor;
	}
	
	public boolean retornaBits(int pos){
		return this.bits [pos];
	}
	
	public boolean equals(Object obj){
		if (obj == null) return false;
		if(obj instanceof Bits){
			Bits b = (Bits) obj;
			if(b.toString().equals(this.toString())) return true;
		}
		return false;
	}
	
	public String toString(){
		String x = "";
		for(int y=0; y<bits.length; y++){
			if(bits[y] == true) x += "1";
			else x += "0";
		}
		return x;
	}
	
	public int size(){
		return bits.length;
	}

	public void and(boolean[] b) throws ParametrosDeTamanhosDiferentesException{
		if (!(b.length == this.size())) throw new ParametrosDeTamanhosDiferentesException("");
		for(int i =0; i < this.size(); i ++){
			if(this.bits[i] == true && b[i] == true) this.bits[i] = true;
			else this.bits[i] = false;
		}
		
		
}
	
	public void or(boolean[] b) throws ParametrosDeTamanhosDiferentesException{
		if (!(b.length == this.size())) throw new ParametrosDeTamanhosDiferentesException("");
		for(int i =0; i < this.size(); i ++){
			if(this.bits[i] == true || b[i] == true) this.bits[i] = true;
			else this.bits[i] = false;
		}
}
	public void not(){
		for(int i = 0; i < this.size(); i ++){
			if(this.bits[i] == true) this.bits[i] = false;
			else this.bits[i] = true;
		}
	}
	
}

