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
    }
}
