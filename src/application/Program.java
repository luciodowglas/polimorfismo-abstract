package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entites.Person;
import entites.PersonLegal;
import entites.PersonPhysical;

/*Fazer um programa para ler os dados de N contribuintes (N fornecido pelo usuário), os quais
podem ser pessoa física ou pessoa jurídica, e depois mostrar o valor do imposto pago por cada um,
bem como o total de imposto arrecadado.*/

/*
 * Autor
 * Dowglas Maia
 * 
 */
public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Person> list = new ArrayList<>();

		System.out.println("Enter the number of tax payers: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print("Tax payer #" + i + " data: ");
			System.out.print("Waht kind of Person:(i/c)? ");
			char ch = sc.next().charAt(0);

			System.out.print("Name: ");
			sc.next();
			String name = sc.nextLine();

			System.out.print("Annual Income: ");
			double incomeAnnul = sc.nextDouble();

			if (ch == 'i') {
				System.out.print("Heatel Expenditures: ");
				double hExpendientures = sc.nextDouble();

				list.add(new PersonPhysical(name, incomeAnnul, hExpendientures));
			} else if (ch == 'c') {
				System.out.print("Number of Employees: ");
				int nEmployees = sc.nextInt();

				list.add(new PersonLegal(name, incomeAnnul, nEmployees));
			}
		}

		System.out.println("Taxes Paid per Person:");
		double sum = 0.0;
		for (Person p : list) {
			double tax = p.taxRade();
			System.out.println("name" + p.getName() + " - " + String.format("%.2f", tax));
			sum += tax;
		}
		System.out.println("Total Taxes: " + sum);

	}

}
