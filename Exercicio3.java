package Classes;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros você vai Digitar? ");
		int n = sc.nextInt();
		double[] num = new double[n];
		double soma = 0.0;
		
		for (int i = 0; i < n;i++ ) {
			sc.nextLine();
			System.out.print("Digite um numero: ");
			num[i] = sc.nextDouble();
			soma += num[i];
		}
		System.out.println();
		System.out.print("VALORES = ");
		for(int i = 0; i < n; i++) {
			System.out.print(num[i]+" ");
		}
		System.out.printf("%nSOMA = %.2f%n",soma);
		
		double media = soma / n;
		System.out.printf("MEDIA = %.2f",media);
		sc.close();
	}
}
