package br.com.estruturaDados.sort;

import br.com.factoryPattern.Factory;

public class QuickSort implements Factory {

	public int[] structure(int[] value) {
		new QuickSort().ordenar(value, 0, value.length - 1);
		return value;
	}

	public void ordenar(int[] vetor, int inicio, int fim) {
		if (inicio < fim) {
			int posicaoPivo = separa(vetor, inicio, fim);
			ordenar(vetor, inicio, posicaoPivo - 1);
			ordenar(vetor, posicaoPivo + 1, fim);
		}
	}

	public int separa(int[] vetor, int inicio, int fim) {
		int pivo = vetor[inicio];

		for (int i = inicio + 1; i <= fim;) {
			if (vetor[i] <= pivo) {
				i++;
			} else if (pivo < vetor[fim]) {
				fim--;
			} else {
				int troca = vetor[i];
				vetor[i] = vetor[fim];
				vetor[fim] = troca;
				i++;
				fim--;
			}
		}
		vetor[inicio] = vetor[fim];
		vetor[fim] = pivo;
		return fim;
	}

}
