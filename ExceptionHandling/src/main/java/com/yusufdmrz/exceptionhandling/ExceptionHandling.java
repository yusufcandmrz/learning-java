/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.yusufdmrz.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Yusuf
 */

class InvalidAgeException extends Exception {

    public InvalidAgeException(String errorMessage) {
        super(errorMessage);
    }
}

class MyCustomException extends Exception {
}

class Parent {

    void msg() throws Exception {
        System.out.println("parent method");
    }
}

class Child extends Parent {

    void msg() /* throws IOException, Exception,  ArithmeticException */ {
        System.out.println("child method");
    }
}

class M {

    void method() throws IOException {
        throw new IOException("device error");
        // System.out.println("device operation performed");
    }
}

class UserDefinedException extends Exception {

    public UserDefinedException(String str) {
        super(str);
    }
}
public class ExceptionHandling {

    public static void validate(int age) {
        if(age < 18){
            throw new ArithmeticException("Person is not eligible to vote");
        } else {
            System.out.println("Person is eligible to vote");
        }
    }

    public static void method() throws FileNotFoundException, IOException, ArithmeticException {
        // throw new FileNotFoundException();
        // throw new IOException("device error");
        throw new ArithmeticException("throwing ArithmeticException");
    }

    void m() throws  IOException{
        // int data = 50 / 0;
        throw new IOException("device error");
    }

    void n() throws IOException{
        m();
    }

    void p() {
        try {
            n();
        } catch (Exception e) {
            System.out.println("exception handled");
        }
    }

    public static void squareNumber(int number) throws ArithmeticException {
        if (number < 1) {
            throw new ArithmeticException("Number is negative, cannot calculate square");
        } else {
            System.out.println("Square of " + number + " is " + (number * number));
        }
    }

    public static int divideNumber(int m, int n) throws ArithmeticException {
        return m / n;
    }
    
    public static void isValidate(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("age is not valid to vote");
        } else {
            System.out.println("welcome to vote");
        }
    }

    public static void main(String[] args) throws IOException{
        // JAVA EXCEPTION
        /* try {
            int data = 50 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("rest of the code");
        
        String s = "abc"; */
        
        
        
        // ********************************************************************;
        // ********************************************************************;
        // ********************************************************************;
        // JAVA TRY-CATCH BLOCK
        /* try {
            int data = 50 / 0;
            System.out.println("rest of the code");
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        
        System.out.println("*************************************************");
        
        try {
            int data2 = 50 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("rest of the code");
        
        System.out.println("*************************************************");
        
        try {
            int data3 = 50 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Can's divided by zero");
        }
        
        System.out.println("*************************************************");
        
        int i = 50;
        int j = 0;
        int data4;

        try {
            data4 = i / j;
        } catch (ArithmeticException e) {
            System.out.println(i / (j + 2));
        }
        
        System.out.println("*************************************************");
        
        try {
            int data5 = 50 / 0;
        } catch (ArithmeticException e) {
            // int data6 = 50 / 0;
        }
        System.out.println("rest of the code");
        
        System.out.println("*************************************************");
        
        try {
            // int data7 = 50 / 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("rest of the code");
        
        System.out.println("*************************************************");
        
        try {
            int[] arr = {1, 3, 5, 7, 9};
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("rest of the code");
        
        System.out.println("*************************************************");
        
        PrintWriter pw;
        try {
            pw = new PrintWriter("jtp.txt");
            pw.println("saved");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        System.out.println("File saved successfully"); */
        
        
        
        // ********************************************************************;
        // ********************************************************************;
        // ********************************************************************;
        // JAVA MULTIPLE CATCH BLOCK
        /* try {
            int[] a = new int[5];
            a[5] = 30 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        } catch (Exception e) {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("rest of the code");
        
        System.out.println("*************************************************");
        
        try {
            int[] a2 = new int[5];
            System.out.println(a2[10]);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        } catch (Exception e) {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("rest of the code");
        
        System.out.println("*************************************************");
        
        try {
            int a[] = new int[5];
            a[5] = 30 / 0;
            System.out.println(a[10]);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        } catch (Exception e) {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("rest of the code");
        
        System.out.println("*************************************************");
        
        try {
            String s = null;
            System.out.println(s.length());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        } catch (Exception e) {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("rest of the code"); */



        // ********************************************************************;
        // ********************************************************************;
        // ********************************************************************;
        // JAVA NESTED TRY
        /* try {
            try {
                int b = 39 / 0;
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
            try {
                int a[] = new int[5];
                a[5] = 4;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
            System.out.println("other statement");
        } catch (Exception e) {
            System.out.println("handled the exception (outer catch)");
        }
        System.out.println("normal flow..");

        System.out.println("*************************************************");

        try {
            try {
                try {
                    int arr[] = { 1, 2, 3, 4 };
                    System.out.println(arr[10]);
                }
                catch (ArithmeticException e) {
                    System.out.println("Arithmetic exception");
                    System.out.println(" inner try block 2");
                }
            }
            catch (ArithmeticException e) {
                System.out.println("Arithmetic exception");
                System.out.println("inner try block 1");
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println(" outer (main) try block");
        }
        catch (Exception e) {
            System.out.println("Exception");
            System.out.println(" handled in main try-block");
        } */



        // ********************************************************************;
        // ********************************************************************;
        // ********************************************************************;
        // JAVA FINALLY BLOCK
        /* try {
            int data = 25 / 5;
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("finally block is always executed");
        }
        System.out.println("rest of the code");

        System.out.println("*************************************************");

        try {
            // int data = 25 / 0;
        } catch (NullPointerException e) {
            System.out.println(e);
        } finally {
            System.out.println("finally block is always executed");
        }
        System.out.println("rest of the code");

        System.out.println("*************************************************");

        try {
            System.out.println("Inside try block");
            int data = 25 / 0;
            System.out.println(data);
        } catch (ArithmeticException e) {
            System.out.println("Exception handled");
            System.out.println(e);
        } finally {
            System.out.println("finally block is always executed");
        }
        System.out.println("rest of the code..."); */



        // ********************************************************************;
        // ********************************************************************;
        // ********************************************************************;
        // JAVA THROW KEYWORD
        /* // validate(13);
        System.out.println("rest of the code");

        System.out.println("*************************************************");

        try {
            method();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("rest of the code...");

        System.out.println("*************************************************");

        try {
            throw new UserDefinedException("This is user-defined exception");
        } catch (UserDefinedException e) {
            System.out.println("Caught the exception");
            System.out.println(e.getMessage());
        } */



        // ********************************************************************;
        // ********************************************************************;
        // ********************************************************************;
        // JAVA EXCEPTION PROPAGATION
        /* ExceptionHandling object = new ExceptionHandling();
        object.p();
        System.out.println("normal flow..."); */



        // ********************************************************************;
        // ********************************************************************;
        // ********************************************************************;
        // JAVA THROWS KEYWORD
        /* ExceptionHandling object = new ExceptionHandling();
        object.p();
        System.out.println("normal flow...");

        System.out.println("*************************************************");

        M m = new M();
        try {
            m.method();
        } catch (Exception e) {
            System.out.println("exception handled");
        }
        System.out.println("normal flow...");

        System.out.println("*************************************************");

        M m2 = new M();
        m2.method();
        System.out.println("normal flow"); */



        // ********************************************************************;
        // ********************************************************************;
        // ********************************************************************;
        // JAVA THROW VS THROWS
        /* // squareNumber(-3);
        System.out.println("Rest of the code...");

        System.out.println("*************************************************");

        try {
            divideNumber(50, 0);
        } catch (ArithmeticException e) {
            System.out.println("Number cannot to be divided by 0");
        }
        System.out.println("Rest of the code...");

        System.out.println("*************************************************");

        try {
            method();
        } catch (ArithmeticException e) {
            System.out.println("caught in main() method");
        } */



        // ********************************************************************;
        // ********************************************************************;
        // ********************************************************************;
        // EXCEPTION HANDLING WITH METHOD OVERRIDING IN JAVA
        /* Parent parent = new Child();
        try {
            parent.msg();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        System.out.println("*************************************************");

        try {
            new M().method();
        } catch (Exception e) {
            System.out.println(e);
        } */
        


        // ********************************************************************;
        // ********************************************************************;
        // ********************************************************************;
        // JAVA CUSTOM EXCEPTION
        /* try {
            isValidate(13);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("rest of the code");
        
        System.out.println("*************************************************");
        
        try {
            throw new MyCustomException();
        } catch (MyCustomException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("rest of the code"); */
    }
}
