/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.yusufdmrz.javainheritance;

/**
 *
 * @author Yusuf
 */
class Employee {
    
    float salary = 40000;
    
}

class Programmer extends Employee{

    int bonus = 10000;
}

class Emp {

    int id;
    String name;
    Address address;

    public Emp(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    
    void display() {
        System.out.println(id + " " + name);
        System.out.println(address.city + " " + address.state + " " + address.city);
    }
}

class Address {

    String city;
    String state;
    String country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }
}

class Animal {

    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("barking...");
    }
}

class BabyDog extends Dog {

    void weep() {
        System.out.println("weeping...");
    }
}

class Cat extends Animal {

    void meow() {
        System.out.println("meowing...");
    }
}

class Operation {

    int square(int n) {
        return n * n;
    }
}

class Circle {

    Operation operation;
    double pi = 3.14;

    double area(int radius) {
        operation = new Operation();
        int radiusSquare = operation.square(radius);
        return radiusSquare * pi;
    }
}

public class JavaInheritance {

    public static void main(String[] args) {
        // INHERITANCE
        // Programmer
        /* Programmer programmer = new Programmer();
        System.out.println("programmer info -> " + programmer.salary + " " + programmer.bonus);
        
        // Dog
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
        
        // BabyDog
        BabyDog babyDog = new BabyDog();
        babyDog.eat();
        babyDog.bark();
        babyDog.weep();
        
        // Cat
        Cat cat = new Cat();
        cat.eat();
        cat.meow(); */
        
        
        
        // ********************************************************************;
        // ********************************************************************;
        // ********************************************************************;
        // AGGREGATION
        // Circle
        Circle circle = new Circle();
        System.out.println("circle area -> " + circle.area(5));
        
        // Emp
        Address address = new Address("gzb", "UP", "india");
        Emp emp = new Emp(111, "varun", address);
        emp.display();
    }
}
