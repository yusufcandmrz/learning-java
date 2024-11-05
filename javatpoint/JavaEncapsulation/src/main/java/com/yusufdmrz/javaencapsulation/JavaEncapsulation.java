/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.yusufdmrz.javaencapsulation;

/**
 *
 * @author Yusuf
 */

// import com.yusufdmrz.pack.*;
// import com.yusufdmrz.pack.A;
// import com.yusufdmrz.pack.childpack.B;

class AA {

    private int date = 40;
    
    private AA() {}

    private void msg() {
        System.out.println("Hello private msg()");
    }
}

public class JavaEncapsulation{

    public static void main(String[] args) {
        // PACKAGE
        // A
        /* A a = new A();
        a.msg(); */
        
        /* com.yusufdmrz.pack.A a = new com.yusufdmrz.pack.A();
        a.msg();
        
        // B
        B b = new B();
        b.msg(); */
        
        
        
        // ********************************************************************;
        // ********************************************************************;
        // ********************************************************************;
        // ACCESS MODIFIERS
        // AA
        // AA a = new AA();
        
        // A
        // A a = new A();
        
        // JavaEncapsulation
        /* JavaEncapsulation object = new JavaEncapsulation();
        object.msg();
        
        A a = new A();
        a.msg(); */
        
        
        
        // ********************************************************************;
        // ********************************************************************;
        // ********************************************************************;
        // ENCAPSULATION
        // Student
        /* Student student = new Student();
        student.setName("vijay");
        System.out.println(student.getName());
        System.out.println(student.getCollege());
        
        System.out.println("*************************************************");
        
        // Account
        Account account = new Account();
        account.setAcc_no(7560504000L);
        account.setName("Sonoo Jaiswal");
        account.setEmail("sonoojaiswal@javatpoint.com");
        account.setAmount(5000000f);
        System.out.println(account.getAcc_no() + ", " + account.getName() + ", " + account.getEmail() + ", " + account.getAmount()); */
    }
}
