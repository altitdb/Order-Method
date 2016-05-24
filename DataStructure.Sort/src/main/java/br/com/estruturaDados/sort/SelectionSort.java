package br.com.estruturaDados.sort;

import br.com.factoryPattern.Factory;

public class SelectionSort implements Factory{

	public int[] structure(int[] value) {
		for (int fixo = 0; fixo < value.length-1; fixo++) {
			int menor = fixo;
			for (int i = fixo+1; i < value.length; i++) {
				if (value[i] < value[menor]) {
					menor = i;
				}
			}
			if (menor!= fixo) {
				int aux = value[fixo];
				value[fixo] = value[menor];
				value[menor] = aux;
			}
		}
		return value;
	}

}
