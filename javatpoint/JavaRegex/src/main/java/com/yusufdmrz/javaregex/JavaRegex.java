/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.yusufdmrz.javaregex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Yusuf
 */
public class JavaRegex {

    public static void main(String[] args) {
        // JAVA REGEX
        /* Pattern pattern = Pattern.compile(".s");
        Matcher matcher = pattern.matcher("as");
        System.out.println(matcher.matches());
        
        System.out.println(Pattern.compile(".s").matcher("as").matches());
        
        System.out.println(Pattern.matches(".s", "as"));
        
        System.out.println("*************************************************");
        
        System.out.println(Pattern.matches(".s", "as"));
        System.out.println(Pattern.matches(".s", "mk"));
        System.out.println(Pattern.matches(".s", "mst"));
        System.out.println(Pattern.matches(".s", "amms"));
        System.out.println(Pattern.matches("..s", "mas"));
        
        System.out.println("*************************************************");
        
        System.out.println(Pattern.matches("[amn]", "abcd"));
        System.out.println(Pattern.matches("[amn]", "a"));
        System.out.println(Pattern.matches("[amn]", "ammmna"));
        
        System.out.println("*************************************************");
        
        System.out.println(Pattern.matches("[amn]?", "a"));
        System.out.println(Pattern.matches("[amn]?", "aaa"));
        System.out.println(Pattern.matches("[amn]?", "aammmnn"));
        System.out.println(Pattern.matches("[amn]?", "aazzta"));
        System.out.println(Pattern.matches("[amn]?", "am"));
        
        System.out.println(Pattern.matches("[amn]+", "a"));
        System.out.println(Pattern.matches("[amn]+", "aaa"));
        System.out.println(Pattern.matches("[amn]+", "aammmnn"));
        System.out.println(Pattern.matches("[amn]", "aazzta"));
        
        System.out.println(Pattern.matches("[amn]*", "ammmna"));
        
        System.out.println("*************************************************");
        
        System.out.println(Pattern.matches("\\d", "abc"));
        System.out.println(Pattern.matches("\\d", "1"));
        System.out.println(Pattern.matches("\\d", "4443"));
        System.out.println(Pattern.matches("\\d", "323abc"));
        
        System.out.println(Pattern.matches("\\D", "abc"));
        System.out.println(Pattern.matches("\\D", "1"));
        System.out.println(Pattern.matches("\\D", "4443"));
        System.out.println(Pattern.matches("\\D", "323abc"));
        System.out.println(Pattern.matches("\\D", "m"));
        
        System.out.println(Pattern.matches("\\D*", "mak"));
        
        System.out.println("*************************************************");
        
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));
        System.out.println(Pattern.matches("[a-zA-Z-0-9]{6}", "kkvarun32"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2"));
        
        System.out.println("*************************************************");
        
        System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9953038949"));
        System.out.println(Pattern.matches("[789][0-9]{9}", "9953038949"));
        
        System.out.println(Pattern.matches("[789][0-9]{9}", "99530389490"));
        System.out.println(Pattern.matches("[789][0-9]{9}", "6953038949"));
        System.out.println(Pattern.matches("[789][0-9]{9}", "8853038949"));
        
        System.out.println(Pattern.matches("[789]{1}\\d{9}", "8853038949"));
        System.out.println(Pattern.matches("[789]{1}\\d{9}", "3853038949"));
        
        System.out.println("*************************************************");
        
        Scanner scanner = new Scanner(System.in);
        Pattern pattern2;
        Matcher matcher2;
        boolean found = false;
        while (true) {
            System.out.println("Enter regex pattern:");
            pattern2 = Pattern.compile(scanner.nextLine());
            System.out.println("Enter text:");
            matcher2 = pattern2.matcher(scanner.nextLine());
            while (matcher2.find()) {
                System.out.println("I found the text " + matcher2.group()
                        + " starting at index " + matcher2.start()
                        + " and ending at index " + matcher2.end());
                found = true;
            }
            if (!found) {
                System.out.println("No match found.");
            }
        } */
    }
}
