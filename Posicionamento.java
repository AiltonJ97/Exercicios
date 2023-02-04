package Classes;

import java.util.Scanner;

public class Posicionamento {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas linhas terá a matriz? ");
		int m = sc.nextInt();
		System.out.print("Quantas colunas terá a matriz? ");
		int n = sc.nextInt();
		
		int[][] pos = new int[m][n];
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				pos[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++ ) {
				System.out.print(pos[i][j]+" ");
			}
			System.out.println();
		}
		System.out.print("Qual numero deseja analisar? ");
		int num = sc.nextInt();
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (pos[i][j] == num) {
					System.out.println("Posição " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Esquerda: " + pos[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Em Cima: " + pos[i-1][j]);
					}
					if (j < pos[i].length-1) {
						System.out.println("Direita: " + pos[i][j+1]);
					}
					if (i < pos.length-1) {
						System.out.println("Em Baixo: " + pos[i+1][j]);
					}
				}
			}
		}
		sc.close();
	}
}
