package com.example.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

  public static void main(String[] args) {
    Map<Integer, List<Employee>> map = new HashMap<>();

    List<Employee> lst1 = new ArrayList<>();
    lst1.add(new Employee("Mahfooz", 47));
    lst1.add(new Employee("Maaz", 10));

    List<Employee> lst2 = new ArrayList<>();
    lst2.add(new Employee("Aamra", 12));
    lst2.add(new Employee("Mawiya", 17));

    List<Employee> lst3 = new ArrayList<>();
    lst3.add(new Employee("Nazreen", 40));

    map.put(1, lst1);
    map.put(2, lst2);
    map.put(3, lst3);

    // List<Employee> emps=
    // map.values().stream().flatMap(Collection::stream).filter(y->y.getAge()>30).collect(Collectors.toList());
    // emps.stream().sorted((e1,e2)->e2.getName().compareTo(e1.getName())).forEach(x->System.out.println(x.getName()));

    map.values().stream().flatMap(x -> x.stream()).filter(y -> y.getAge() > 30)
        .collect(Collectors.toList()).stream()
        .sorted((e1, e2) -> e2.getName().compareTo(e1.getName()))
        .forEach(emp -> System.out.println(emp.getName()));


    int[] arr = {1, 25, 50, 71, 90, 1011111111, 102, 303, 111};

    int max = Integer.MIN_VALUE;
    for (int a : arr) {
      boolean flag = containsOne(a);
      if (flag) {
        max = max > a ? max : a;
      }
    }
    System.out.println(max);
    
    for (int a : arr) {
      boolean flag = containsOneUsingAnotherWay(a);
      if (flag) {
        max = max > a ? max : a;
      }
    }
    System.out.println(max);
  }


  private static boolean containsOne(int a) {
    boolean flag = false;
    while (a > 0) {
      int x = a % 10;
      if (x == 1) {
        flag = true;
        break;
      }
      a = a / 10;
    }
    return flag;
  }
  
  private static boolean containsOneUsingAnotherWay(int a) {
    String str = String.valueOf(a);
    return str.indexOf('1') != -1;
  }

}


class Employee {
  private String name;
  private int age;

  public Employee(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }



  @Override
  public String toString() {
    return "Employee [name=" + name + ", age=" + age + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + age;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Employee other = (Employee) obj;
    if (age != other.age)
      return false;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    return true;
  }



}
