/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.yusufdmrz.javaobjectclass;

import java.util.Scanner;

/**
 *
 * @author Yusuf
 */

// Abstract class
abstract class Demo {

    // Abstract method
    abstract void displayInformation();
}

class Student extends Demo{

    int id;
    String name;

    void insertRecord(int i, String n) {
        id = i;
        name = n;
    }

    void displayInformation() {
        System.out.println(id + " - " + name);
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Employee {

    int id;
    String name;
    float salary;

    void insert(int i, String n, float s) {
        id = i;
        name = n;
        salary = s;
    }

    void display() {
        System.out.println("employee's info -> " + id + " " + name + " " + salary);
    }
}

class Rectangle {

    int length;
    int width;

    void insert(int l, int w) {
        length = l;
        width = w;
    }

    void calculateArea() {
        System.out.println("rectangle's area -> " + length * width);
    }
}

class Calculation {

    void fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("factorial -> " + fact);
    }
}

class Account {

    int acc_no;
    String name;
    float amount;

    void insert(int a, String n, float amt) {
        acc_no = a;
        name = n;
        amount = amt;
    }

    void deposit(float amt) {
        amount += amt;
        System.out.println(amt + " deposited");
    }

    void withdraw(float amt) {
        if (amt > amount) {
            System.out.println("Insufficient Balance");
        } else {
            amount -= amt;
            System.out.println(amt + " withdrawn");
        }
    }

    void checkBalance() {
        System.out.println("Balance is " + amount);
    }

    void display() {
        System.out.println("Account's info -> " + acc_no + " " + name + " " + amount);
    }
}

public class JavaObjectClass {
    
    int id;
    String name;
    
    // User defined method
    public static void findEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }
    
    public static int add(int n1, int n2) {
        return n1 + n2;
    }
    
    static void show(){
        System.out.println("It is an example of static method");
    }
    
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        // OBJECT AND CLASS
        // main within the class
        /* JavaObjectClass object = new JavaObjectClass();
        System.out.println("object's id -> " + object.id + ", object's name -> " + object.name);
        
        // main outside the class
        Student student = new Student();
        System.out.println("student's id -> " + student.id + ", student,s name -> " + student.name);

        // Initialization through reference
        Student student1 = new Student();
        Student student2 = new Student();
        student1.id = 101;
        student1.name = "Sonoo";
        student2.id = 102;
        student2.name = "Amit";
        System.out.println("student1's id -> " + student1.id + ", student1's name -> " + student1.name);
        System.out.println("student2's id -> " + student2.id + ", student2's name -> " + student2.name);

        // Initialization through method
        Student student3 = new Student();
        Student student4 = new Student();
        student3.insertRecord(111, "Karan");
        student4.insertRecord(222, "Aryan");
        student3.displayInformation();
        student4.displayInformation();

        // Employee
        Employee employee = new Employee();
        employee.insert(101, "ajeet", 45000);
        employee.display();

        // Rectangle
        Rectangle rectangle = new Rectangle();
        rectangle.insert(11, 5);
        rectangle.calculateArea();
        
        // Calculation
        new Calculation().fact(5);
        
        // Account
        Account account = new Account();
        account.insert(832345, "Ankit", 1000);
        account.display();
        account.checkBalance();
        account.deposit(4000);
        account.checkBalance();
        account.withdraw(1500);
        account.checkBalance(); */
        
        
        
        // ********************************************************************;
        // ********************************************************************;
        // ********************************************************************;
        // METHOD
        // Predefined method
        /* System.out.println("The maximum number is " + Math.max(9, 7));
        
        // findEvenOdd
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter the number: ");
        // int num = scanner.nextInt();
        // findEvenOdd(num);
        
        // add
        int a = 19, b = 5;
        System.out.println("The sum of a and b is -> " + add(a, b));
        
        // show
        show();
        
        // add
        JavaObjectClass object = new JavaObjectClass();
        System.out.println("The sum of a, b and c is -> " + object.add(12, 13, 14)); */
        
        
        
        // ********************************************************************;
        // ********************************************************************;
        // ********************************************************************;
    }
}
