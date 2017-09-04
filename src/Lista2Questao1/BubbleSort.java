package Lista2Questao1;

public class BubbleSort{
	public static void main(String [] args){
	
		int [] vetor = {2,1,3,5,4};
		int x = 0;
		int num = 0;
		
		System.out.println("Desordenados:");
		for(num =0; num<5; num++){
			System.out.println(" " + vetor[num]);
		}
		System.out.println("\n Pulo do gato \n");
		
		for(num= 0; num<5; num++){
			for(int j=0; j<4; j++){
				if(vetor [j] > vetor[j+1]){
					x = vetor[j];
					vetor[j] = vetor[j+1];
					vetor [j+1] =x;
				}
			}
		}
		System.out.println("Ordenado:");
		for(num=0; num<5; num++){
			System.out.println(" "+ vetor[num]);
		}
	
	}
}