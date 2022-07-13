package com.example.collections.general;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
  public static void main(String[] args) {
    Set<Employee> uniqueName = new HashSet<>();

    Employee e1 = new Employee(1, "Mahfooz");
    Employee e2 = new Employee(1, "Mahfooz");
    Employee e3 = new Employee(1, "Mahfooz");
    Employee e4 = new Employee(4, "Mahfooz");
    Employee e5 = new Employee(5, "Mahfooz");
    uniqueName.add(e1);
    uniqueName.add(e2);
    uniqueName.add(e3);
    uniqueName.add(e4);
    uniqueName.add(e5);
    uniqueName.stream().forEach(x -> System.out.println(x.getId() + " " + x.getName()));
  }
}
