package br.com.estruturaDados.sort;

import java.util.Arrays;

import br.com.factoryPattern.Factory;
import br.com.factoryPattern.WriteFactory;

public class BubbleSort implements Factory {
	public long[]time = new long[5];
	int cont=0;

	public int[] structure(int[] value) {
		int aux;
		long start_time = System.currentTimeMillis();
		for (int i = value.length - 1; i >= 1; i--) {
			for (int j = 0; j < i; j++) {
				if (value[j] > value[j + 1]) {
					aux = value[j];
					value[j] = value[j + 1];
					value[j + 1] = aux;
				}
			}
		}
		long end_time = System.currentTimeMillis();

		long difference = end_time-start_time;
		
		time[cont]=difference;
		cont++;
		System.out.println("tempo de execução"+difference);
		System.out.println(cont +"cont");
		System.out.println(Arrays.toString(time) +" atual tempo");
		return value;
	}
	public void write(){
		WriteFactory write = new WriteFactory();
		write.transform(time);
	}
}
