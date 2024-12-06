package com.yusufcandmrz.records;

public class Main {
    public static void main(String[] args) {

        /*

        java 14'de tanitildi. java 16'da tamamlandi
        immutable class nedir?
        immutable class neden kullanilir?
        bir class nasil immutable olur?
        record class nedir?
        record class bize ne gibi ozellikler sunuyor?
        record class nasil kullanilir?
        record ile record kullanilmayan class arasindaki fark nedir?
        record class icerisinde neler yapabiliriz?

        */

        StudentClass studentClass = new StudentClass("firstStudent", 20);
        StudentRecord studentRecord = new StudentRecord("secondStudent", 20);
        System.out.println(studentClass);
        System.out.println(studentRecord);
        StudentRecord.accessStringVariable();
    }
}