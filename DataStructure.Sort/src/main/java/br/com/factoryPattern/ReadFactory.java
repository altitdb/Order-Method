package br.com.factoryPattern;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

import br.com.estruturaDados.sort.BubbleSort;

public class ReadFactory {
	public String[] read(String path) {
		String[] group = null;
		try {
			Path byway = Paths.get(path);
			byte[] bytes = Files.readAllBytes(byway);
			String orderly = new String(bytes);
			group = orderly.split(",");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return group;

	}

	public int[] converts(String[] group) {

		int[] entire = new int[group.length];
		for (int i = 0; i < entire.length; i++) {
			entire[i] = Integer.parseInt(group[i]);
		}

		return entire;
	}

	public static void main(String[] args) throws IOException {
		BubbleSort bubble = new BubbleSort();
		Scanner scanner = new Scanner(System.in);
		System.out.println("informe Qual arquivo deseja calcular? (orderly,disorderly,orderReverse,percentageLeft,percentageRigth)");
		String value = scanner.next();
		for(int i =1; i<=5;i++){
			String teste = value+i+".txt";
			String[] a = new ReadFactory().read(teste);
			int[] b = new ReadFactory().converts(a);
			
			bubble.structure(b);
		}
//		System.out.println(Arrays.toString(bubble.time));
		bubble.write();
//		String teste = "orderly1.txt";
//		new ReadFactory().read(teste);

	}
}
