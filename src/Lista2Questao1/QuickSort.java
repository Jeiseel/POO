package Lista2Questao1;

public class QuickSort implements Ordena {
	public int[] ordena(int[] vetor){
		int start = vetor[0];
		int end = vetor.length;
		return quicksort(vetor, start, end);
	}
	public int [] quicksort(int[] vetor, int start, int end){
		int meio;
		if(start < end){
			meio = partition(vetor, start, end);
			quicksort(vetor, start, end);
			quicksort(vetor, meio + 1, end);
		}
		return vetor;
	}
	public static int partition(int[] vetor, int play, int end){
		int pivo, topo, i;
		pivo = vetor[play];
		topo = play;
		for(i = play + 1; i <= end; i++){
			if(vetor[i] < pivo){
				vetor[topo] = vetor [i];
				vetor[i] = vetor[topo + 1];
				topo++;
			}
		}
		vetor[topo] = pivo;
		return topo;
	}

}
