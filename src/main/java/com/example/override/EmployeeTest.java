package com.example.override;


class Employee{
	public static void show() {
		System.out.println("Employee");
	}
	
	public Number sum(int a, int b) {
		System.out.print("Employee Class ");
		return a+b;
	}
}

class Manager extends Employee {
	public static void show() {
		System.out.println("Manager");
	}
	
	public Integer sum(int a, int b) {
		System.out.print("Manager Class ");
		return a+b;
	}
}

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.show();
		
		System.out.println(emp.sum(4, 5));
	}
}
