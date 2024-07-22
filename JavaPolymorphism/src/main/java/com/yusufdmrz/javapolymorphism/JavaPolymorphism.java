/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.yusufdmrz.javapolymorphism;

/**
 *
 * @author Yusuf
 */
class Adder {

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }
    
    static double add(double a, double b) {
        return a + b;
    }
}

class OverloadingCalculation {

    void sum(int a, long b) {
        System.out.println(a + b);
    }

    void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }
    
    void sum(int a, int b) {
        System.out.println(a + b);
    }
}

class Vehicle {

    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {

    void run() {
        System.out.println("Bike is running safely");
    }
}

class Bank {

    int getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {

    int getRateOfInterest() {
        return 8;
    }
}

class ICICI extends Bank {

    int getRateOfInterest() {
        return 7;
    }
}

class AXIS extends Bank {

    int getRateOfInterest() {
        return 9;
    }
}

class A {

    A get() {
        return this;
    }
}

class B extends A {

    B get() {
        return this;
    }
    
    void message() {
        System.out.println("welcome to covariant return type");
    }
}

class A1 {

    A1 foo() {
        return this;
    }

    void print() {
        System.out.println("Inside the class A1");
    }
}

class A2 extends A1 {

    A1 foo() {
        return this;
    }

    void print() {
        System.out.println("Inside the class A2");
    }
}

class Animal {

    String color = "white";

    Animal() {
        System.out.println("animal is created");
    }
    
    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Animal {

    String color = "black";
    
    Dog() {
        // super();
        System.out.println("dog is created");
    }

    void printColor() {
        System.out.println(color);
        System.out.println(super.color);
    }
    
    void eat() {
        System.out.println("eating bread...");
    }

    void bark() {
        System.out.println("barking...");
    }

    void work() {
        super.eat();
        bark();
    }
}

class Person {

    int id;
    String name;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Emp extends Person {

    float salary;

    Emp(int id, String name, float salary) {
        super(id, name);
        this.salary = salary;
    }
    
    void display() {
        System.out.println(id + " - " + name + " - " + salary);
    }
}

public class JavaPolymorphism {
    
    /* public static void main(String arg) {
        System.out.println("main with String");
    } */

    public static void main(String[] args) {
        // METHOD OVERLOADING
        // Adder
        /* System.out.println(Adder.add(11, 11));
        System.out.println(Adder.add(11, 11, 11));
        
        System.out.println(Adder.add(11.1, 11.1));
        
        System.out.println("main with String[]");
        
        // Overloading Calculation
        OverloadingCalculation obj = new OverloadingCalculation();
        obj.sum(20, 20);
        obj.sum(20, 20, 20);
        
        obj.sum(20, 20); */
        
        
        
        // ********************************************************************;
        // ********************************************************************;
        // ********************************************************************;
        // METHOD OVERRIDING
        // Bike
        /* Bike bike = new Bike();
        bike.run();
        
        // Bank
        SBI s = new SBI();
        System.out.println("SBI's rate of interest -> " + s.getRateOfInterest());
        ICICI i = new ICICI();
        System.out.println("ICICI's rate of interest -> " + i.getRateOfInterest());
        AXIS a = new AXIS();
        System.out.println("AXIS's rate of interest -> " + a.getRateOfInterest());*/
        
        
        
        // ********************************************************************;
        // ********************************************************************;
        // ********************************************************************;
        // CONANIANT RETURN TYPE
        // B
        /* new B().get().message();
        
        // A1
        A1 a1 = new A1();
        a1.foo().print();
        A2 a2 = new A2();
        a2.foo().print(); */
        
        
        
        // ********************************************************************;
        // ********************************************************************;
        // ********************************************************************;
        // SUPER KEYWORD
        /* Dog dog = new Dog();
        dog.printColor();
        dog.work();
        
        // Emp
        Emp emp = new Emp(1, "ankit", 45000f);
        emp.display(); */
    }
}
