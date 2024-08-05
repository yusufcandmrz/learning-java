/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.yusufdmrz.javaoopsmisc;

/**
 *
 * @author Yusuf
 */

class Student implements Cloneable {

    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    public String toString() {
        return rollNo + " - " + name;
    }
}

public class JavaOOPsMisc {
    
    static public void p() {
        System.out.println("Hello p");
        p();
    }
    
    public static int count = 0;
    
    public static void p2() {
        count++;
        if (count <= 5) {
            System.out.println("Hello p2: " + count);
            p2();
        }
    }
    
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    
    static int n1 = 0;
    static int n2 = 1;
    static int n3;
    
    public static void fibonacci(int count) {
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(n3 + " ");
            fibonacci(count - 1);
        }
    }

    public static void main(String[] args) {
        //OBJECT CLONING
        /* try {
            Student student1 = new Student(12, "Yusuf");
            Student student2 = (Student) student1.clone();
            System.out.println(student1);
            System.out.println(student2);
        } catch (CloneNotSupportedException c) {
            System.out.println(c);
        } */
        
        
        
        // ********************************************************************;
        // ********************************************************************;
        // ********************************************************************;
        // MATH CLASS
        /* double x = 28;
        double y = 4;
        System.out.println("max number of x and y -> " + Math.max(x, y));
        System.out.println("sqaure root of x -> " + Math.sqrt(x));
        System.out.println("power of x and y -> " + Math.pow(x, y));
        System.out.println("log of x -> " + Math.log(x));
        System.out.println("log10 of x -> " + Math.log10(x));
        System.out.println("log1p of x -> " + Math.log1p(x));
        System.out.println("exp of x -> " + Math.exp(x));
        System.out.println("expm1 of x -> " + Math.expm1(x));
        
        System.out.println("*************************************************");
        
        double a = 30;
        double b = Math.toRadians(a);
        System.out.println("sin value of b -> " + Math.sin(b));
        System.out.println("cos value of b -> " + Math.cos(b));
        System.out.println("tan value of b -> " + Math.tan(b));
        System.out.println("asin value of b -> " + Math.asin(b));
        System.out.println("acos value of b -> " + Math.acos(b));
        System.out.println("atan value of b -> " + Math.atan(b));
        System.out.println("sinh value of b -> " + Math.sinh(b));
        System.out.println("cosh vlaue of b -> " + Math.cosh(b));
        System.out.println("tanh value of b -> " + Math.tanh(b)); */
        
        
        
        // ********************************************************************;
        // ********************************************************************;
        // ********************************************************************;
        // WRAPPER CLASS
        // Autoboxing
        /* // int a = 20;
        // Integer i = Integer.valueOf(a);
        // Integer j = a;
        
        // Unboxing
        // Integer a2 = Integer.valueOf(10);
        // int i2 = a2.intValue();
        // int j2 = a2;
        
        byte b = 10;
        short s = 20;
        int i = 30;
        long l = 40;
        float f = 50.0F;
        double d = 60.0D;
        char c = 'a';
        boolean b2 = true;
        
        Byte byteobj = b;
        Short shortobj = s;
        Integer intobj = i;
        Long longobj = l;
        Float floatobj = f;
        Double doubleobj = d;
        Character charobj = c;
        Boolean boolobj = b2;
        System.out.println("---Printing object values---");
        System.out.println("Byte object: " + byteobj);
        System.out.println("Short object: " + shortobj);
        System.out.println("Integer object: " + intobj);
        System.out.println("Long object: " + longobj);
        System.out.println("Float object: " + floatobj);
        System.out.println("Double object: " + doubleobj);
        System.out.println("Character object: " + charobj);
        System.out.println("Boolean object: " + boolobj);
        
        byte bytevalue = byteobj;
        short shortvalue = shortobj;
        int intvalue = intobj;
        long longvalue = longobj;
        float floatvalue = floatobj;
        double doublevalue = doubleobj;
        char charvalue = charobj;
        boolean boolvalue = boolobj;
        System.out.println("---Printing primitive values---");
        System.out.println("byte value: " + bytevalue);
        System.out.println("short value: " + shortvalue);
        System.out.println("int value: " + intvalue);
        System.out.println("long value: " + longvalue);
        System.out.println("float value: " + floatvalue);
        System.out.println("double value: " + doublevalue);
        System.out.println("char value: " + charvalue);
        System.out.println("boolean value: " + boolvalue); */
        
        
        
        // ********************************************************************;
        // ********************************************************************;
        // ********************************************************************;
        // JAVA RECURSION
        /* // p();
        
        p2();
        
        System.out.println(factorial(5));
        
        int count = 15;
        System.out.print(n1 + " " + n2 + " ");
        fibonacci(count - 2); */
    }
}
