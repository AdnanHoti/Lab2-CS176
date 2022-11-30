package edu.monmouth.lab2;

public class Student extends Person{

	private int id;
	private String major;
	
	public Student(String name, int yearOfBirth, int id, String major) {
		super(name, yearOfBirth);
		this.major = major;
		this.id = id;
		// TODO Auto-generated constructor stub	
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public String getMajor() {
		return major;
	}

	@Override
	public String toString() {
		return  "Student name= " + this.getName() + ", Student birth date= "+ this.getYearOfBirth() + 
				", Student id= " + this.getId() + ", Student major= " + this.getMajor();
	}
	
	
}
