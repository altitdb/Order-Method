package br.com.estruturaDados.sort;

public class BubbleSort {
	public int [] orderly(int[] sort) {
		int aux;
		for (int i = sort.length - 1; i >= 1; i--) {
			for (int j = 0; j < i; j++) {
				if (sort[j] > sort[j + 1]) {
					aux = sort[j];
					sort[j] = sort[j + 1];
					sort[j + 1] = aux;
				}
			}
		}
		return sort;
	}
}
