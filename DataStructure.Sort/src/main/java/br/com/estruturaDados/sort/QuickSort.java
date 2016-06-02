package br.com.estruturaDados.sort;

import java.util.Arrays;

import br.com.factoryPattern.Factory;
import br.com.factoryPattern.WriteFactory;

public class QuickSort implements Factory {
	public long[]time = new long[6];
	int cont=0;

	public int[] structure(int[] value) {
		long start_time = System.currentTimeMillis();
		new QuickSort().ordenar(value, 0, value.length - 1);
		long end_time = System.currentTimeMillis();

		long difference = end_time-start_time;
		
		time[cont]=difference;
		cont++;
		System.out.println("tempo de execução"+difference);
		System.out.println(cont +"cont");
		System.out.println(Arrays.toString(time) +" atual tempo");
		
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
	
	public void write(){
		WriteFactory write = new WriteFactory();
		write.transform(time);
	}

}
