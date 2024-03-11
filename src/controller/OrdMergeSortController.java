package controller;

import br.edu.fateczl.mergesort.MergeSort;

public class OrdMergeSortController {

	public OrdMergeSortController() {
		super();
	}

	public int[] ordenar(int[] vetor) {
		MergeSort mergeSort = new MergeSort();
		return mergeSort.mergeSort(vetor, 0, vetor.length - 1); // Passando os parâmetros inicio e fim
	}
	
}
