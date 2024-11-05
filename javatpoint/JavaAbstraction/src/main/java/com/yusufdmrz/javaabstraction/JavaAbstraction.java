/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.yusufdmrz.javaabstraction;

/**
 *
 * @author Yusuf
 */

interface Printable {

    void print();
}

interface ChildPrintable {

    void childPrint();
}

class ChildPrint implements ChildPrintable {

    public void print() {
        System.out.println("printed");
    }

    public void childPrint() {
        System.out.println("child printed");
    }
}

interface PrintableII {

    void print();
}

class Print implements Printable, PrintableII {

    public void print() {
        System.out.println("printed");
    }
}

interface Showable {

    void show();
}

class AA implements Printable {

    public void print() {
        System.out.println("Hello");
    }
    
    interface MessagePrintable {

        void msg();
    }
}

class AAA implements Printable, Showable {

    public void print() {
        System.out.println("Hello");
    }

    public void show() {
        System.out.println("World");
    }
}

interface Drawable {

    default void msg() {
        System.out.println("default method");
    }
    
    void draw();
    
    static int cube(int x) {
        return x * x * x;
    }
}

class Square implements Drawable {

    public void draw() {
        System.out.println("drawing square");
    }
}

interface A {

    void a();

    void b();

    void c();

    void d();
}

abstract class B implements A {

    public void c() {
        System.out.println("I am C");
    }
}

class C extends B {

    public void a() {
        System.out.println("I am A");
    }

    public void b() {
        System.out.println("I am B");
    }

    public void d() {
        System.out.println("I am D");
    }
}

abstract class Bike {
    
    Bike() {
        System.out.println("bike is created");
    }

    abstract void run();
    
    void changeGear() {
        System.out.println("gear change");
    }
}

class Honda extends Bike {

    void run() {
        System.out.println("running safely");
    }
}

abstract class Shape {

    abstract void draw();
}

/* class Rectangle extends Shape {

    void draw() {
        System.out.println("drawing rectangle");
    }
}

class Circle extends Shape {

    void draw() {
        System.out.println("drawing circle");
    }
} */

class Rectangle implements Drawable {

    public void draw() {
        System.out.println("drawing rectangle");
    }
}

/* abstract class Bank {

    abstract int getRateOfInterest();
}

class SBI extends Bank {

    int getRateOfInterest() {
        return 7;
    }
}

class PNB extends Bank {

    int getRateOfInterest() {
        return 8;
    }
} */

interface Bank {

    float rateOfInterest();
}

class SBI implements Bank {

    public float rateOfInterest() {
        return 9.15f;
    }
}

class PNB implements Bank {

    public float rateOfInterest() {
        return 9.7f;
    }
}

public class JavaAbstraction {

    public static void main(String[] args) {
        // ABSTRACT CLASS
        // Bike
        /* Bike bike = new Honda();
        bike.run();
        bike.changeGear();
        
        System.out.println("*************************************************");
        
        // Shape
        Shape shape = new Circle();
        shape.draw();
        
        System.out.println("*************************************************");
        
        // Bank
        Bank bank;
        bank = new SBI();
        System.out.println("SBI's rate of interest is " + bank.getRateOfInterest() + "%");
        bank = new PNB();
        System.out.println("PNB's rate of interest is " + bank.getRateOfInterest() + "%");
        
        System.out.println("*************************************************");
        
        // A
        A a = new C();
        a.a();
        a.b();
        a.c();
        a.d(); */
        
        
        
        // ********************************************************************;
        // ********************************************************************;
        // ********************************************************************;
        // INTERFACE
        // AA
        /* AA aa = new AA();
        aa.print();
        
        System.out.println("*************************************************");
        
        // AAA
        AAA aaa = new AAA();
        aaa.print();
        aaa.show();

        System.out.println("*************************************************");
        
        // Square
        Square square = new Square();
        square.draw();
        
        System.out.println("*************************************************");
        
        // Bank
        Bank bank;
        bank = new SBI();
        System.out.println("SBI's rate of interest is " + bank.rateOfInterest() + "%");
        bank = new PNB();
        System.out.println("PNB's rate of interest is " + bank.rateOfInterest() + "%");
        
        System.out.println("*************************************************");
        
        // Print
        Print print = new Print();
        print.print();
        
        System.out.println("*************************************************");
        
        // ChildPrint
        ChildPrint childPrint = new ChildPrint();
        childPrint.print();
        childPrint.childPrint();
        
        System.out.println("*************************************************");
        
        // Rectangle
        Drawable drawable = new Rectangle();
        drawable.draw();
        drawable.msg();
        System.out.println(Drawable.cube(3)); */
    }
}
