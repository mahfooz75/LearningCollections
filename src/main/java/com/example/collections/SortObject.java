package com.example.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortObject {

	public static void main(String[] args) {
		Employee emp1 = new Employee("Mahfooz", 45);
		Employee emp2 = new Employee("Nazreen", 37);
		Employee emp3 = new Employee("Mawiya", 15);
		Employee emp4 = new Employee("Aamra", 10);
		Employee emp5 = new Employee("Maaz", 8);

		List<Employee> employees = new ArrayList<>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);

		// Sorted by name ascending order
		System.out.println("***** Sorted by name ascending order *****");
		employees.stream().sorted((e1, e2) -> e1.getName().compareTo(e2.getName())).forEach(e -> {
			System.out.print(e.getName() + "\t\t");
			System.out.println(e.getAge());
		});
		// Sorted by name descending order
		System.out.println("***** Sorted by name descending order *****");
		employees.stream().sorted((e1, e2) -> e2.getName().compareTo(e1.getName())).forEach(e -> {
			System.out.print(e.getName() + "\t\t");
			System.out.println(e.getAge());
		});

		// Sorted by age ascending order
		System.out.println("***** Sorted by age ascending order *****");
		employees.stream().sorted((e1, e2) -> e1.getAge() - e2.getAge()).forEach(e -> {
			System.out.print(e.getName() + "\t\t");
			System.out.println(e.getAge());
		});

		// Sorted by age ascending order
		System.out.println("***** Sorted by age descending order *****");
		employees.stream().sorted((e1, e2) -> e2.getAge() - e1.getAge()).forEach(e -> {
			System.out.print(e.getName() + "\t\t");
			System.out.println(e.getAge());
		});
	}
}
