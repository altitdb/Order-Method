package br.com.estruturaDados.sort;

import br.com.factoryPattern.Factory;

public class InsertionSort implements Factory {

	public int[] structure(int[] value) {
		int i;
		int j;
		int eleito;
		for (i = 0; i < value.length; i++) {
			eleito = value[i];
			for (j = i;(j>0)&&(value[j-1]>eleito);j--) {
				value[j]=value[j-1];
			}
			value[j]= eleito;
		}
		return value;
	}

}
