package br.com.factoryPattern;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import br.com.estruturaDados.sort.BubbleSort;
import br.com.estruturaDados.sort.InsertionSort;
import br.com.estruturaDados.sort.QuickSort;
import br.com.estruturaDados.sort.SelectionSort;

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
		Scanner scanner = new Scanner(System.in);
		System.out
				.println("Qual estrutura de dados deseja ? 1-BubbleSort/2-SelectionSort/3-InsertSort/4-QuickSort");
		int input = scanner.nextInt();
		System.out
				.println("informe Qual arquivo deseja calcular? (orderly,disorderly,orderReverse,percentageLeft,percentageRigth)");
		String value = scanner.next();

		switch (input) {
		case 1:
			BubbleSort bubble = new BubbleSort();
			for (int i = 1; i <= 5; i++) {
				String teste = value + i + ".txt";
				String[] a = new ReadFactory().read(teste);
				int[] b = new ReadFactory().converts(a);
				bubble.structure(b);
			}
			bubble.write();
			break;
		case 2:
			SelectionSort selection = new SelectionSort();
			for (int i = 1; i <= 5; i++) {
				String teste = value + i + ".txt";
				String[] a = new ReadFactory().read(teste);
				int[] b = new ReadFactory().converts(a);
				selection.structure(b);
			}
			selection.write();
			break;
		case 3:
			InsertionSort insertion = new InsertionSort();
			for (int i = 1; i <= 5; i++) {
				String teste = value + i + ".txt";
				String[] a = new ReadFactory().read(teste);
				int[] b = new ReadFactory().converts(a);
				insertion.structure(b);
			}
			insertion.write();
			break;
		case 4:
			QuickSort quick = new QuickSort();
			for (int i = 1; i <= 6; i++) {
				String teste = value + i + ".txt";
				String[] a = new ReadFactory().read(teste);
				int[] b = new ReadFactory().converts(a);
				quick.structure(b);
			}
			quick.write();
			break;

		}
		// System.out.println(Arrays.toString(bubble.time));

		// String teste = "orderly1.txt";
		// new ReadFactory().read(teste);

	}
}
