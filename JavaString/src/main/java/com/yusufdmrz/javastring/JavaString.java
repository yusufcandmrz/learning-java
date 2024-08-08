/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.yusufdmrz.javastring;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

/**
 *
 * @author Yusuf
 */
public class JavaString {

    public static void main(String[] args) {
        // WHAT IS STRING
        /* String s1 = "java";
        char[] ch = {'s', 't', 'r', 'i', 'n', 'g', 's'};
        String s2 = new String(ch);
        String s3 = new String("example");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3); */
        
        
        
        // ********************************************************************;
        // ********************************************************************;
        // ********************************************************************;
        // IMMUTABLE STRING
        /* String s = "Sachin";
        // s.concat(" Tendulkar");
        s = s.concat(" Tendulkar");
        System.out.println(s); */
        
        
        
        // ********************************************************************;
        // ********************************************************************;
        // ********************************************************************;
        // STRING COMPARISON
        /* String s1 = "Sachin";
        String s2 = "Sachin";
        String s3 = new String("Sachin");
        String s4 = "Saurav";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        
        System.out.println("*************************************************");
        
        String s5 = "SACHIN";
        System.out.println(s1.equals(s4));
        System.out.println(s1.equalsIgnoreCase(s5));
        
        System.out.println("*************************************************");
        
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        
        System.out.println("*************************************************");
        
        String s6 = "Ratan";
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s6));
        System.out.println(s6.compareTo(s1)); */
        
        
        
        // ********************************************************************;
        // ********************************************************************;
        // ********************************************************************;
        // STRING CONCATENATION
        /* String s1 = "Sachin" + " Tendulkar";
        System.out.println(s1);
        
        System.out.println("*************************************************");
        
        String s2 = 50 + 30 + "Sachin" + 40 + 40;
        System.out.println(s2);
        
        System.out.println("*************************************************");
        
        String s3 = "Sachin ";
        String s4 = "Tendulkar";
        String s5 = s3.concat(s4);
        System.out.println(s5);
        
        System.out.println("*************************************************");
        
        StringBuilder s6 = new StringBuilder("Hello");
        StringBuilder s7 = new StringBuilder(" World");
        StringBuilder s8 = s6.append(s7);
        System.out.println(s8);
        
        System.out.println("*************************************************");
        
        String s9 = "Hello ";
        String s10 = "World";
        String s11 = String.format("%s%s", s9, s10);
        System.out.println(s11);
        
        System.out.println("*************************************************");
        
        String s12 = new String("Hello ");
        String s13 = new String("World");
        String s14 = String.join("", s12, s13);
        System.out.println(s14);
        
        System.out.println("*************************************************");
        
        StringJoiner s15 = new StringJoiner(" ");
        s15.add("Hello");
        s15.add("World");
        System.out.println(s15);
        
        System.out.println("*************************************************");
        
        List<String> stringList = Arrays.asList("abc", "pqr", "xyz");
        String s16 = stringList.stream().collect(Collectors.joining(" "));
        System.out.println(s16); */
        
        
        
        // ********************************************************************;
        // ********************************************************************;
        // ********************************************************************;
        // SUBSTRING
        /* String s1 = "Hello";
        System.out.println(s1.substring(0, 2));
        
        System.out.println("*************************************************");
        
        String s2 = "SachinTendulkar";
        System.out.println("Original String: " + s2);
        System.out.println("Substring starting from index 6: " + s2.substring(6));
        System.out.println("Substring starting from index 0 to 6: " + s2.substring(0, 6));
        
        System.out.println("*************************************************");
        
        String s3 = new String("Hello, My name is Sachin.");
        String[] sentences = s3.split("\\.");
        System.out.println(Arrays.toString(sentences)); */
        
        
        
        // ********************************************************************;
        // ********************************************************************;
        // ********************************************************************;
        // METHODS OF STRING CLASS
        /* String s1 = "Sachin";
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        
        System.out.println("*************************************************");
        
        String s2 = "   Sachin   ";
        System.out.println(s2);
        System.out.println(s2.trim());
        
        System.out.println("*************************************************");
        
        System.out.println(s1.startsWith("S"));
        System.out.println(s1.endsWith("in"));
        
        System.out.println("*************************************************");
        
        System.out.println(s1.charAt(0));
        System.out.println(s1.charAt(3));
        
        System.out.println("*************************************************");
        
        System.out.println(s1.length());
        
        System.out.println("*************************************************");
        
        String s3 = s1.intern();
        System.out.println(s3);
        
        System.out.println("*************************************************");
        
        int a = 10;
        String s4 = String.valueOf(a);
        System.out.println(s4 + 10);
        
        System.out.println("*************************************************");
        
        String s5 = "Java is a programming language. Java is a platform. Java is an Island.";
        String replaceString = s5.replace("Java", "Kava");
        System.out.println(replaceString); */
    }
}
