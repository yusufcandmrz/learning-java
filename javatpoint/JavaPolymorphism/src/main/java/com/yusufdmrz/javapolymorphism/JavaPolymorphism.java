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

class Bike /* extends Vehicle */ {

    int speed;
    int speedlimit = 90;

    Bike() {
        /* System.out.println("constructor is invoked");
        System.out.println("speed -> " + speed); */
    }

    /* {
        System.out.println("instance initializer block invoked");
        speed = 100;
    } */
    void run() {
        System.out.println("Bike is running safely");
    }
}

class Honda extends Bike {

    int speedlimit = 150;
}

class Splendor extends Bike {

    void run() {
        System.out.println("running safely with 60km");
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

    A() {
        System.out.println("parent class costructor invoked");
    }

    A get() {
        return this;
    }
}

class B extends A {

    B() {
        System.out.println("child class constructor invoked");
    }

    {
        System.out.println("instance initializer block is invoked");
    }

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
    
    static void method(Animal animal) {
        /* if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            System.out.println("downcasting performed");
        } */
        Dog dog = (Dog) animal;
        System.out.println("downcasting performed");
    }
}

class BabyDog extends Dog {

    /* void eat() {
        System.out.println("dringking milk...");
    } */
}

class Cat extends Animal {

    void eat() {
        System.out.println("eating rat...");
    }
}

class Lion extends Animal {

    void eat() {
        System.out.println("eating meat...");
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

class Student {

    int id;
    String name;
    final String PAN_CARD_NUMBER;

    public Student(int id, String name, String PAN_CARD_NUMBER) {
        this.id = id;
        this.name = name;
        this.PAN_CARD_NUMBER = PAN_CARD_NUMBER;
    }
}

class Shape {

    void draw() {
        System.out.println("drawing");
    }
}

class Rectangle extends Shape {

    void draw() {
        System.out.println("drawing rectangle");
    }
}

class Circle extends Shape {

    void draw() {
        System.out.println("drawing circle");
    }
}

class Triangle extends Shape {

    void draw() {
        System.out.println("drawing triangle");
    }
}

interface Printable {}

class AA implements Printable {

    public void AA() {
        System.out.println("aa method");
    }
}

class BB implements Printable {

    public void BB() {
        System.out.println("bb method");
    }
}

class Call {

    void invoke(Printable printable) {
        if (printable instanceof AA) {
            AA aa = (AA) printable;
            aa.AA();
        } else if (printable instanceof BB) {
            BB bb = (BB) printable;
            bb.BB();
        }
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
        
        
        
        // ********************************************************************;
        // ********************************************************************;
        // ********************************************************************;
        // INSTANCE INITIALIZER BLOCK
        // Bike
        /* Bike bike = new Bike();
        
        // B
        B b = new B(); */
        
        
        
        // ********************************************************************;
        // ********************************************************************;
        // ********************************************************************;
        // FINAL KEYWORD
        // Bike
        /* Bike bike = new Bike();
        bike.run(); */
        


        // ********************************************************************;
        // ********************************************************************;
        // ********************************************************************;
        // RUNTIME POLYMORPHISM
        // Bike
        /* Bike bike = new Splendor();
        bike.run();

        // Bank
        Bank bank;
        bank = new SBI();
        System.out.println("SBI's rate of interest: " + bank.getRateOfInterest());
        bank = new ICICI();
        System.out.println("ICICI's rate of interest: " + bank.getRateOfInterest());
        bank = new AXIS();
        System.out.println("AXIS's rate of interest: " + bank.getRateOfInterest());

        // Shape
        Shape shape;
        shape = new Rectangle();
        shape.draw();
        shape = new Circle();
        shape.draw();
        shape = new Triangle();
        shape.draw();

        // Animal
        Animal animal;
        animal = new Dog();
        animal.eat();
        animal = new Cat();
        animal.eat();
        animal = new Lion();
        animal.eat();
        
        // Bike
        Bike bike2 = new Honda();
        System.out.println(bike2.speedlimit);
        
        // Animal
        Animal animal2, animal3, animal4;
        animal2 = new Animal();
        animal3 = new Dog();
        animal4 = new BabyDog();
        
        Animal animal5 = new BabyDog();
        animal5.eat(); */
        
        
        
        // ********************************************************************;
        // ********************************************************************;
        // ********************************************************************;
        // INSTANCEPF OPERATOR
        /* JavaPolymorphism object = new JavaPolymorphism();
        System.out.println(object instanceof JavaPolymorphism);
        
        // Dog
        Dog dog = new Dog();
        System.out.println("dog instanceof Animal -> " + (dog instanceof Animal));
        
        Dog dog2 = null;
        System.out.println("dog2 instanceof Dog -> " + (dog2 instanceof Dog));
        
        Animal animal = new Dog();
        Dog.method(animal);
        
        // Printable
        Printable printable = new BB();
        Call call = new Call();
        call.invoke(printable); */
    }
}
