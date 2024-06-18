/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.yusufdmrz.javatutorial;

/**
 *
 * @author Yusuf
 */
public class JavaTutorial {

    static String staticVariable = "staticVariable";

    public void method() {
        String locaVariable = "locaVariable";
    }

    public static void main(String[] args) {
        // System.out.println("Hello World!");

        /* Class c = JavaTutorial.class;
        System.out.println("result -> " + c.getClassLoader());
        System.out.println("result II -> " + String.class.getClassLoader()); */
        
        
        
        // *********************************************************************
        // JAVA VARIABLES
        String instanceVariable = "instanceVariable";
        
        // Add Two Numbers
        int a = 10;
        int b = 10;
        int c = a + b;
        // System.out.println("c = " + c);
        
        // Widening
        int intNumber = 10;
        float floatNumber = intNumber;
        // System.out.println("floatNumber = " + floatNumber);
        
        // Narrowing (Typecasting)
        float floatNumber2 = 10.5f;
        int intNumber2 = (int)floatNumber2;
        // System.out.println("intNumber2 = " + intNumber2);
        
        // Overflow
        int intNumber3 = 130;
        byte byteNumber = (byte)intNumber3;
        // System.out.println("byteNumber = " + byteNumber);
        
        // Adding Lower Type
        byte byteNumber2 = 10;
        byte byteNumber3 = 10;
        byte byteNumber4 = (byte)(byteNumber2 + byteNumber3);
        // System.out.println("byteNumber4 = " + byteNumber4);
        
        
        
        // *********************************************************************
        // OPERATORS
        
        // Java Unary Operator
        // ++ and --
        int x = 10;
        int y = 10;
        /* System.out.println(x++);
        System.out.println(++x);
        System.out.println(x--);
        System.out.println(--x);
        
        System.out.println(y++ + ++y);
        System.out.println(y++ + y++); */
        
        // ~ and !
        int positiveNumber = 10;
        int negativeNumber = -10;
        boolean booleanVariable = true;
        /* System.out.println(~positiveNumber);
        System.out.println(~negativeNumber);
        System.out.println(!booleanVariable); */
        
        // Java Arithmetic Operator
        int intVariable1 = 10;
        int intVariable2 = 5;
        /* System.out.println("+ => " + (intVariable1 + intVariable2));
        System.out.println("- => " + (intVariable1 - intVariable2));
        System.out.println("* => " + (intVariable1 * intVariable2));
        System.out.println("/ => " + (intVariable1 / intVariable2));
        System.out.println("% => " + (intVariable1 % intVariable2)); */
        
        // Java Shift Operator
        /* System.out.println(10<<2);
        System.out.println(10>>2);
        System.out.println(10>>>2);
        System.out.println(-10>>>2); */
        
        // Java AND Operator
        int intVariable3 = 10;
        int intVariable4 = 5;
        int intVariable5 = 20;
        /* System.out.println(intVariable3 < intVariable4 && intVariable3++ < intVariable5);
        System.out.println(intVariable3);
        System.out.println(intVariable3 < intVariable4 & intVariable3++ < intVariable5);
        System.out.println(intVariable3); */
        
        // Java OR Operator
        /* System.out.println(intVariable4 < intVariable3 || intVariable4++ < intVariable5);
        System.out.println(intVariable4);
        System.out.println(intVariable4 < intVariable3 | intVariable4++ < intVariable5);
        System.out.println(intVariable4); */
        
        // Java Ternary Operator
        // System.out.println((intVariable3 < intVariable4) ? intVariable4 : intVariable3);
        
        // Java Assignment Operator
        /* intVariable1 += 10;
        intVariable2 -= 10;
        intVariable3 *= 10;
        intVariable4 /= 10;
        intVariable5 %= 10;
        System.out.println(intVariable1);
        System.out.println(intVariable2);
        System.out.println(intVariable3);
        System.out.println(intVariable4);
        System.out.println(intVariable5); */
    }
}
