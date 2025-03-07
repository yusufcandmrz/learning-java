package org.example;

import java.util.ArrayList;

public class Employees implements Cloneable {

    ArrayList<String> employeeList;

    public Employees() {
        employeeList = new ArrayList<>();
    }

    public Employees(ArrayList<String> employeeList) {
        this.employeeList = employeeList;
    }

    public ArrayList<String> getEmployeeList() {
        return employeeList;
    }

    public void loadData() {
        employeeList.add("Yusuf");
        employeeList.add("Taha Huseyin");
        employeeList.add("Muhammet");
        employeeList.add("Sait");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Employees(new ArrayList<>(this.getEmployeeList()));
    }
}
