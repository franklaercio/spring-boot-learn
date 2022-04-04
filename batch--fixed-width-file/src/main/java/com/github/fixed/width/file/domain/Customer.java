package com.github.fixed.width.file.domain;

public class Customer {
	private String name;
	private String lastName;
	private String age;
	private String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer{" +
				"name='" + name + '\'' +
				", lastName='" + lastName + '\'' +
				", age='" + age + '\'' +
				", email='" + email + '\'' +
				'}';
	}
}