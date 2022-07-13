package com.example.collections;

import java.util.List;

public class CustomArrayListTest {

  public static void main(String[] args) {
    List<Employee> lst = new CustomArrayList<>();
    Employee emp1=new Employee("Mahfooz");
    Employee emp2=new Employee("Mahfooz");
    Employee emp3=new Employee("Mahfooz");
    Employee emp4=new Employee("Maaz");
    lst.add(emp1);
    lst.add(emp2);
    lst.add(emp3);
    lst.add(emp4);
    System.out.println(lst);
    lst.stream().forEach(e->System.out.println(e.getName()));
  }
  
}
