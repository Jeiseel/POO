package Lista2Questao1;

import java.util.Random;

import javax.swing.JOptionPane;

public class MainOrdena {
	public static void main (String [] args){
		int array[] = new int [1000];
		Random r = new Random();
		for(int i = 0; i < 1000; i++){
			array[i] = r.nextInt();
		}
		Ordena insertionSort = new InsertionSort();
		Ordena quickSort = new QuickSort();
		Ordena mergeSort = new MergeSort();
		Ordena  bubbleSort = new BubbleSort();
		int cont = 0;
		while(cont !=1){
			String opcao = JOptionPane.showInputDialog("[1] - InsertionSort\n" + "[2] - BubbleSort\n" + "[3] - QuickSort\n" + "[4] - MergeSort\n" + "[5] - Sair");
			switch (opcao){
			case "1":
				long inicio = System.currentTimeMillis();
				insertionSort.ordena(array);
				long fim = System.currentTimeMillis() - inicio;
				JOptionPane.showMessageDialog(null, "InsertionSort levou" + fim + "milisegundos");
				break;
			case "2":
				long play = System.currentTimeMillis();
				bubbleSort.ordena(array);
				long end = System.currentTimeMillis() - play;
				JOptionPane.showMessageDialog(null, "BubbleSort levou" + end+ "milisegundos");
				break;
			case "3":
				long inicioq = System.currentTimeMillis();
				quickSort.ordena(array);
				long fimq = System.currentTimeMillis() - inicioq;
				JOptionPane.showMessageDialog(null, "QuickSort levou" + fimq + "milisegundos");
				break;
			case "4":
				long iniciom = System.currentTimeMillis();
				mergeSort.ordena(array);
				long fimM = System.currentTimeMillis() - iniciom;
				JOptionPane.showMessageDialog(null, "MergeSort levou" +fimM+ "milisegundos");
				break;
			case "5":
				cont = 1;
				break;
			default:
				JOptionPane.showMessageDialog(null, "Acabou A Brincadeira ");
			}
		}
	}

}