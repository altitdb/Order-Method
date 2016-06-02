package br.com.estruturaDados.sort;

import java.util.Arrays;

import br.com.factoryPattern.Factory;
import br.com.factoryPattern.WriteFactory;

public class InsertionSort implements Factory {
	public long[]time = new long[6];
	int cont=0;

	public int[] structure(int[] value) {
		int i;
		int j;
		int eleito;
		long start_time = System.currentTimeMillis();
		for (i = 0; i < value.length; i++) {
			eleito = value[i];
			for (j = i;(j>0)&&(value[j-1]>eleito);j--) {
				value[j]=value[j-1];
			}
			value[j]= eleito;
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
