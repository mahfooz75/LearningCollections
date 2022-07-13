package com.example.collections;

import java.util.*;

public class TreeMapTest {
    public static void main(String[] args) {
        //TreeMap<Employee, String> ts = new TreeMap<>(new MyNameComparator());
        // Lambda expression
        TreeMap<Employee, String> ts = new TreeMap<>((emp,t1)->emp.getName().compareTo(t1.getName()));
        Employee emp1 = new Employee("Mahfooz");
        Employee emp2 = new Employee("Nazreen");
        Employee emp3 = new Employee("Mawiya");
        Employee emp4 = new Employee("Aamra");
        Employee emp5 = new Employee("Maaz");
        ts.put(emp1, "Mahfooz");
        ts.put(emp2, "Nazreen");
        ts.put(emp3, "Mawiya");
        ts.put(emp4, "Aamra");
        ts.put(emp5, "Maaz");

        for (Map.Entry<Employee, String> entry : ts.entrySet()) {
            System.out.println(entry.getKey().getName()+">>"+entry.getValue());
        }

    }
}

class MyNameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee employee, Employee t1) {
        return employee.getName().compareTo(t1.getName());
    }
}