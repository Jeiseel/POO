package Questão9;

public class Circulo implements FormaGeometrica{
	int raio;
	double pi;
	
	public Circulo(int raio){
		this.raio = raio;
		pi = 3.14;
	}
	
	public double perimetro(){
		return (raio*pi*2);
	}
	
	public double area(){
		return pi*Math.pow(raio, 2);
	}
	
	public String toString(){
		return "\n Circulo:" + this.raio + "\n Perimetro:" +  this.perimetro() + "\n Area:" + this.area(); 
	}
	

}
