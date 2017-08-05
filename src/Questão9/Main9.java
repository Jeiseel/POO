package Questão9;
import javax.swing.JOptionPane;

import Questão1.Retangulo1;

public class Main9 {
	public static void main(String [] args){
		FormaGeometrica r1 = (FormaGeometrica) new Retangulo1(3,4);
		FormaGeometrica r2 = (FormaGeometrica) new Retangulo1(4,5);
		FormaGeometrica q1 = (FormaGeometrica) new Quadrado(6);
		FormaGeometrica q2 = (FormaGeometrica) new Quadrado(10);
		FormaGeometrica c1 = new Circulo(2);
		FormaGeometrica c2 = new Circulo(6);
		FormaGeometrica [] vetor = {r1, r2, q1, q2, c1, c2};
		for (int x=0; x<vetor.length; x++){
			JOptionPane.showMessageDialog(null, vetor[x].toString());
		}
	}

}
