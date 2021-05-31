package com.tcs.test;

public class CustomersDTO {
	
	private static String username;
	
	private static String password;
	
	private static String firstName;
	
	private static String lastName;
	
	
	
	private static int age;
	
	private static String activity;


	public static String getActivity() {
		return activity;
	}

	public static void setUsername(String username) {
		CustomersDTO.username = username;
	}

	public static void setPassword(String password) {
		CustomersDTO.password = password;
	}

	public static void setFirstName(String firstName) {
		CustomersDTO.firstName = firstName;
	}

	public static void setLastName(String lastName) {
		CustomersDTO.lastName = lastName;
	}

	public static void setAge(int age) {
		CustomersDTO.age = age;
	}

	public static void setActivity(String activity) {
		CustomersDTO.activity = activity;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
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
	

}
