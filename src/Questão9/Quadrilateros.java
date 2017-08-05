package Questão9;

public abstract class Quadrilateros implements FormaGeometrica{
	int l1;
	int l2;
	int l3;
	int l4;
	
	public Quadrilateros (int l1, int l2, int l3, int l4){
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
		this.l4 = l4;
	}
	public double perimetro(){
		return l1 + l2 + l3 + l4;
	}

}
