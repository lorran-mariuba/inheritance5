package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Person;
import entities.PhysicalPerson;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Person> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt(); 
		
		for(int i=1; i<=n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char p = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual Income: ");
			Double annualIncome = sc.nextDouble();
			if(p == 'i') {
				System.out.print("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				list.add(new PhysicalPerson(name, annualIncome, healthExpenditures));
			} else {
				System.out.print("Number of employees: ");
				int nEmployee = sc.nextInt();
				list.add(new Company(name, annualIncome, nEmployee));
			}
		}
		System.out.println();
		System.out.println("TAXES PAID:");
		double sum = 0.0;
		for(Person person : list) {
			System.out.printf("%s: $ %.2f%n", person.getName(), person.tax());	
			sum += person.tax();
		}
		System.out.println();
		System.out.print("TOTAL TAXES: $ " + sum);
		
		sc.close();

	}

}
