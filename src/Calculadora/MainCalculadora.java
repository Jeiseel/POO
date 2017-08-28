package Calculadora;

public class MainCalculadora {
	
	public static void main(String [] args){
		Calculadora c = new Calculadora();
		
		if (20==c.maior(2,20)){
			System.out.println("TestMaio Passed");
		}
		else{
			System.out.println("TestMaior falide");
		}
		if (5==c.subtrai(10, 5)){
			System.out.println("TestSubtração: Passad");
		}
		else{
			System.out.println("TestSubtração: Falide");
		}
		if(4==c.raiz(16)){
			System.out.println("TestRaiz: Passad"); 
		}
		else{
			System.out.println("TestRaiz: Falide");
		}
		
	}

}
