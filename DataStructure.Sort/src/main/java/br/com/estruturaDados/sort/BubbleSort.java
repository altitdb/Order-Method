package br.com.estruturaDados.sort;

import br.com.factoryPattern.Factory;

public class BubbleSort implements Factory {

	public int[] structure(int[] value) {

		int aux;
		for (int i = value.length - 1; i >= 1; i--) {
			for (int j = 0; j < i; j++) {
				if (value[j] > value[j + 1]) {
					aux = value[j];
					value[j] = value[j + 1];
					value[j + 1] = aux;
				}
			}
		}
		return value;
	}
}
