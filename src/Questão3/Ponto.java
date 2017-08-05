package Questão3;

public class Ponto {
	protected int x;
	protected int y;
	
	public Ponto(){
		x = 0;
		y = 0; 
	}
	
	public Ponto(int X, int Y){
		x = X;
		y = Y;
	}
	
	public int getX(){
		return this.x;
	}
	public int setX(int x){
		return this.x = x;
	}
	
	public int getY(){
		return this.y;
	}
	public int setY(int y){
		return this.y = y;
	}
	
	public boolean metEquals(Object obj){
		if (obj == null) return false;
		if (obj instanceof Ponto){
			Ponto p1 = (Ponto) obj;
			if(p1.x == this.x && p1.y == this.y) return true;
		}
		return false;
	}
	
	public String toString(){
		return "\n X:" + x + "\n Y:" + y;
	}

	
	

}
