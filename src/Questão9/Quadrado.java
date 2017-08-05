package Quest�o9;

public class Quadrado extends Quadrilateros {
	private double lado1;

	public Quadrado(int lado){
		super(lado, lado, lado, lado);
	}
	public double area(){
		return lado1*lado1;
	}
	
	public String toString(){
		 return "QUADRADO\nTamanho dos lados: " + lado1 + "\nPer�metro: " + super.perimetro() + "cm" + "\n�rea: " + this.area() + "cm�\n";  
	}

}
