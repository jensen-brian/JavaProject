package com.practice.code;

import java.util.Random;

public class MyTestObject {
	private String firstName;
	private String lastName;
	private int age;
	
	public MyTestObject(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getAge() {
		return age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		if (!(obj instanceof MyTestObject)) return false;
		MyTestObject test = (MyTestObject)obj; 
		
		if (this.age != test.age) return false;
		if (!this.firstName.equals(test.firstName)) return false;
		if (!this.lastName.equals(test.lastName)) return false;
		
		return true;
	}
	
	@Override
	public int hashCode() {
		// random so we can see this fail
		// return (new Random()).nextInt();
		
		final int prime = 31;
		
		int result = 1;
		result = prime * result + ((this.firstName != null) ? this.firstName.hashCode() : 0);
		result = prime * result + ((this.lastName != null) ? this.lastName.hashCode() : 0);
		result = prime * result + this.age;
		return result;
	}
}