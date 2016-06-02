package br.com.estruturaDados.sort;

import java.util.Arrays;

import br.com.factoryPattern.Factory;
import br.com.factoryPattern.WriteFactory;

public class SelectionSort implements Factory{
	public long[]time = new long[5];
	int cont=0;

	public int[] structure(int[] value) {
		long start_time = System.currentTimeMillis();
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
