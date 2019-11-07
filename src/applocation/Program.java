package applocation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Contributors;
import entities.Individual;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Double totalTaxes = 0.0;
		
		List<Contributors> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or Company (i/c)?");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double annualIncome = sc.nextDouble();
			
			if(ch == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				
				list.add(new Individual(name, annualIncome, healthExpenditures));
				
			} else {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				
				list.add(new Company(name, annualIncome, numberOfEmployees));
				
			}
			
		}
		
		System.out.println();
		System.out.println("TAX PAID:");
		
		for(Contributors contributor : list) {
			totalTaxes += contributor.taxesPaid();
			System.out.println(contributor.getName() + ": $ " + String.format("%.2f", contributor.taxesPaid()));
			
		}
		
		System.out.println("TOTAL TAXES: $ " + totalTaxes);
		
		sc.close();

	}

}