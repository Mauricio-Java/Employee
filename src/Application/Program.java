package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		// Employee information

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee employee = new Employee();

		System.out.println(" Enter Employees name");
		employee.name = sc.nextLine();
		System.out.println(" Enter gross salary");
		employee.salary = sc.nextDouble();
		System.out.println(" Enter tax");
		employee.tax = sc.nextDouble();

		System.out.println(employee);

		
		System.out.println("Which percentage to increase salary ?");
		
		double percentage= sc.nextDouble();
		
		employee.increaseSalary(percentage);
		
		System.out.println(employee);
	}

}
