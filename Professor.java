package edu.monmouth.lab2;

public class Professor extends Person {

	private int salary; 
	
	public Professor(String name, int yearOfBirth, int salary) {
		super(name, yearOfBirth);
		this.salary = salary;
		// TODO Auto-generated constructor stub
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Professor name= " + this.getName() + ", Professor date of birth= "+ 
				this.getYearOfBirth() + ", Professor salary= " + this.getSalary();
	}
	
	

}
