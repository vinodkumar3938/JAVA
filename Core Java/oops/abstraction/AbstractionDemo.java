package oops.abstraction;

public class AbstractionDemo{
	
	public static void main(String[] args) {
		Employee contractor = new Contractor("Vinod" , 10 , 10);
		Employee fullTimeEmployee = new FullTimeEmployee("Eren" , 8);
		System.out.println(contractor.calculateSalary());
		System.out.println(fullTimeEmployee.calculateSalary());
	}
}
