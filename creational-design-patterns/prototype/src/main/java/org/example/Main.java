package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employees employees = new Employees();
        employees.loadData();

        Employees employees1 = (Employees) employees.clone();
        Employees employees2 = (Employees) employees.clone();
        List<String> firstEmployeeList = employees1.getEmployeeList();
        List<String> secondEmployeeList = employees2.getEmployeeList();
        firstEmployeeList.add("Employee X");
        secondEmployeeList.remove("Yusuf");
        System.out.println(employees.getEmployeeList());
        System.out.println(firstEmployeeList);
        System.out.println(secondEmployeeList);
    }
}