package edu.monmouth.lab2;

import java.util.ArrayList;

public class Lab2 {

    public static void main(String[] args) {
	final int ARRAY_SIZE=3;
	
	// create an instance of each class
	Person person = new Person("Joe", 1980);
	Student student = new Student("Sally", 2001, 123321, "CSSE");
	Professor professor = new Professor("Larry", 1970, 60000);
	
	// using the toString method, print values for each instance
	System.out.println("Here are the 3 objects created");
	System.out.println(person);
	System.out.println(student);
	System.out.println(professor);
	
	// create an array that houses 3 references to Person objects (use constant)
	Person [] personArray = new Person [ARRAY_SIZE];
	
	// fill the array with the 3 references to Person objects created above
	personArray[0] = person;
	personArray[1] = student;
	personArray[2] = professor;
	
	// using a looping construct, print each element of the array 
	System.out.println("Here are the elements of the array");
	for(int i=0; i<personArray.length; i++) {
		System.out.println(personArray[i]);
	}
	for(int j=0; j<personArray.length; j++) {
		System.out.println(personArray[j].getName() + " " + personArray[j].getYearOfBirth());
		
	}
	
	// declare an ArrayList that can store Person objects
	ArrayList<Person> personArrayList = new ArrayList<Person>();
	
	// add the objects above to this ArrayList
	personArrayList.add(person);
	personArrayList.add(student);
	personArrayList.add(professor);
	
	// using a looping construct, print each element of the ArrayList
	System.out.println("Here are the elements of the ArrayList");
	for (Object i : personArrayList) {
		System.out.println(i);
		
	}
	
	
    }

}
