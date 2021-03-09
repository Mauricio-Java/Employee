package entities;

public class Employee {
	
	public String name;
	public double salary;
	public double tax;
	
	
	public double netSalary(){
	return salary-=tax;
	
	}
	public void increaseSalary(double percentage) {
		salary+= percentage * salary/100;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", tax=" + tax + "]";
	}
	
	
	
}
