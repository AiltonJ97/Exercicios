package Classes;
/*Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha.*/

import java.util.Locale;
import java.util.Scanner;

import Util.Velho;

public class Mais_Velho {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		
		Velho[] vel = new Velho[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Dados da "+(i+1)+"a pessoa:");
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			vel[i] = new Velho(nome, idade);
		}
		int mVelho = vel[0].getIdade();
		String nomeV = null;
		for(int i = 0; i < n; i++) {
			if (mVelho < vel[i].getIdade()) {
				mVelho = vel[i].getIdade();
				nomeV = vel[i].getNome();
			}
		}
		
		System.out.print("PESSOA MAIS VELHA: "+ nomeV);
		
		sc.close();
	}
}
