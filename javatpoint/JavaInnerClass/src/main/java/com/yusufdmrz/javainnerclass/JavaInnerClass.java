/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.yusufdmrz.javainnerclass;

/**
 *
 * @author Yusuf
 */

abstract class Person {

    abstract void eat();
}

interface Eatable {

    void eat();
}

interface Showable {

    void show();

    interface Message {

        void msg();
    }
}

class LocalInner {

    private int data = 30;

    void display() {
        int value = 50;
        class Local {

            void msg() {
                System.out.println("data: " + data + "\nvalue: " + value);
            }
        }
        new Local().msg();
    }
}

class Outer {

    static int data = 30;

    static class Inner {

        void msg() {
            System.out.println("data is " + data);
        }
    }
}

class NestedInterface implements Showable.Message {

    public void msg() {
        System.out.println("Hello nested interface");
    }
}

public class JavaInnerClass {

    private int data = 30;
    
    class Inner {

        void msg() {
            System.out.println("data is: " + data);
        }
    }
    
    public static void main(String[] args) {
        // MEMBER INNER CLASS
        /* JavaInnerClass object = new JavaInnerClass();
        JavaInnerClass.Inner innerObject = object.new Inner();
        innerObject.msg(); */
        
        
        
        // ********************************************************************;
        // ********************************************************************;
        // ********************************************************************;
        // ANONYMOUS INNER CLASS
        /* Person person = new Person() {
            @Override
            void eat() {
                System.out.println("nice fruits");
            }
        };
        person.eat();
        
        System.out.println("*************************************************");
        
        Eatable eatable = new Eatable() {
            @Override
            public void eat() {
                System.out.println("nice fruits");
            }
        };
        eatable.eat(); */
        
        
        
        // ********************************************************************;
        // ********************************************************************;
        // ********************************************************************;
        // LOCAL INNER CLASS
        /* LocalInner localInner = new LocalInner();
        localInner.display(); */
        
        
        
        // ********************************************************************;
        // ********************************************************************;
        // ********************************************************************;
        // STATIC NESTED CLASS
        /* Outer.Inner object = new Outer.Inner();
        object.msg(); */
        
        
        
        // ********************************************************************;
        // ********************************************************************;
        // ********************************************************************;
        // NESTED INTERFACE
        /* Showable.Message message = new NestedInterface();
        message.msg(); */
    }
}
