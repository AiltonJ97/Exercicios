package SalarioWs;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import FuncionariosWs.Dados;

public class Sistema {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas pessoas deseja registrar? ");
		int n = sc.nextInt();

		/* Dados[] ds = new Dados[n]; */
		List<Dados> dd = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.println("Emplyoee #" + (i + 1));
			sc.nextLine();
			System.out.print("ID: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String nome = sc.nextLine();
			System.out.print("Salary: ");
			double salario = sc.nextDouble();
			dd.add(new Dados(id, nome, salario));
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int idsalary = sc.nextInt();

		Integer pos = position(dd, idsalary);

		if (pos == null) {
			System.out.println("This id does not exist!");
		}

		else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			dd.get(pos).newSalary(percent);
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		for (Dados x : dd) {
			System.out.println(x);
		}

		sc.close();
	}

	public static Integer position(List<Dados> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

}
