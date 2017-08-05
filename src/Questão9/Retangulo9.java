package Quest�o9;

public class Retangulo9 extends Quadrilateros{
	
	public Retangulo9 (int base, int altura){
		super(base, base, altura, altura);
	}
	
	public double area(){
		return l1*l2;
	}
	
	public String toString(){
		return "RETANGULO\nBase: " + l1 + "\nAltura: " + l2 + "\nPer�metro: " + super.perimetro() + "cm" + "\n�rea: " + this.area() + "cm�\n";  
	}

}
