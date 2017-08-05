package Questão9;

public class Quadrado extends Quadrilateros {
	private double lado1;

	public Quadrado(int lado){
		super(lado, lado, lado, lado);
	}
	public double area(){
		return lado1*lado1;
	}
	
	public String toString(){
		 return "QUADRADO\nTamanho dos lados: " + lado1 + "\nPerímetro: " + super.perimetro() + "cm" + "\nÁrea: " + this.area() + "cm²\n";  
	}

}
