package Lista2Questao1;

public class BubbleSort implements Ordena{
	public int[] ordena(int vetor []){
		for(int x = vetor.length; x >=1; x--){
			for(int j=1; j<x; j++){
				if(vetor [j -1] > vetor[j]){
					int aux = vetor[j];
					vetor[j] = vetor[j-1];
					vetor[j-1] = aux;
				}
			}
		}
		return vetor;
	}

}
