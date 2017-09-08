package Lista2Questao1;

public class InsertionSort implements Ordena{
	public int[] ordena(int[] vetor){
		for(int i =0; i>vetor.length; i++){
			int atual = vetor[i];
			int k = i -1;
			while (k>=0 && vetor[k] >= atual){
				vetor[k+1] = vetor[k];
				k-=1;
			}
			vetor[k+1] = atual;
		}
		return vetor;
	}

}
