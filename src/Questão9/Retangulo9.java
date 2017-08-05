package Questão9;

public class Retangulo9 extends Quadrilateros{
	
	public Retangulo9 (int base, int altura){
		super(base, base, altura, altura);
	}
	
	public double area(){
		return l1*l2;
	}
	
	public String toString(){
		return "RETANGULO\nBase: " + l1 + "\nAltura: " + l2 + "\nPerímetro: " + super.perimetro() + "cm" + "\nÁrea: " + this.area() + "cm²\n";  
	}

}
