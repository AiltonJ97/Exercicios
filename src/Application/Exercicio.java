package Application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Products;

public class Exercicio {

	public static void main(String[] args) {

		File file = new File("C:\\Arquivos\\file.txt");
		Scanner sc = null;
		
		List<Products> list = new ArrayList<>();
		
		try {
			sc = new Scanner(file);
			for (int i = 1; i <= 4; i++) {
				sc.hasNextLine();
				String p = sc.nextLine();
				String[] products  = p.split(",");
				String name = products[0];
				double price = Double.parseDouble(products[1]);
				int quantity = Integer.parseInt(products[2]);
				list.add(new Products(name, price, quantity));
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
		
		for(Products pr : list) {
			System.out.println(pr.toString());
		}
		
		System.out.println("Inicio da crianção do CSV");
		String path = "C:\\Arquivos\\summary.csv";
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for (Products line : list) {
				bw.write(line.toString());
				bw.newLine();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("Fim da criação");
	}
}
