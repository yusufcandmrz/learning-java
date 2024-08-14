/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.yusufdmrz.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author Yusuf
 */
public class ExceptionHandling {

    public static void main(String[] args) {
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
    }
}
