package br.com.estruturaDados.sort;

import java.util.Random;

import br.com.factoryPattern.WriteFactory;

public class Create{
	
	Random random = new Random();
	
	public int[] orderly(int size) {
		int[] sequence = new int[size];
		for (int i = 0; i < size; i++) {
			sequence[i] = i + 1;
		}
		return sequence;
	}

	public int[] orderReverse(int size){
		int [] sequence = new int[size];
		int j =0;
		for(int i = size;i>0;i--){
			sequence[j]=i;
			j++;
		}
		
		return sequence;
	}
	
	public int [] disorderly(int size){
		int[] sequence = new int [size];
		
		
		for(int i =0;i< size;i++){
			sequence[i]=this.random.nextInt(size);
		}
		return sequence;
	}
	
	public int [] percentageRight(int size){
		int[] sequence = new int [size];
		int percentage = size*10/(100);
		for(int i= 0;i<size;){
			if(i<size-percentage){
				sequence[i]= i+1;
				i++;
			}else{
				sequence[i] =this.random.nextInt(size);
				i++;
			}
		}
		return sequence;
	}
	
	public int [] percentageLeft(int size){
		int[] sequence = new int[size];
		int percentage = size*10/(100);
		for(int i = 0;i<size;){
			if(i>=percentage){
				sequence [i]=i+1;
				i++;
			}else{
				sequence[i]= this.random.nextInt(size);
				i++;
			}
		}
		return sequence;
	}
	
	public static void main(String[] args) {
       WriteFactory write = new WriteFactory();
       write.collection(10);
       System.out.println("foi");
	}
}
