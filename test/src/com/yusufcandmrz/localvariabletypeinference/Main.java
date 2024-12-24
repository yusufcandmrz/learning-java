package com.yusufcandmrz.localvariabletypeinference;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static int returnZero() {
        return 0;
    }

    public static void main(String[] args) throws IOException {

        // https://docs.oracle.com/en/java/javase/17/language/local-variable-type-inference.html

//        URL url = new URL("http://www.oracle.com/");
//        URLConnection conn = url.openConnection();
//        Reader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));

//        var newUrl = new URL("http://www.oracle.com/");
//        var newConn = url.openConnection();
//        var newReader = new BufferedReader(new InputStreamReader(conn.getInputStream()));

//        // Local Variables with Initializers
//        var list = new ArrayList<String>();
//        var stream = list.stream();

//        // Enhanced for-loop indexes
//        for (var element : list) { }

//        // Traditional for-loop indexes
//        for (var counter = 0; counter < 10; counter++) { }

//        // Try-with-resources variables
//        try (var input = new FileInputStream("file.txt")) {  }


        // *************************************************************************************************************
        // *************************************************************************************************************
        // *************************************************************************************************************


        // https://www.baeldung.com/java-10-local-variable-type-inference

//        // Defining a variable without using var
//        String message = "Hello String";
//
//        // Defining a variable with using var
//        var messageTwo = "Hello var";
//
//        // Using var with Map
//        Map<Integer, String> map = new HashMap<>();
//        var mapTwo = new HashMap<Integer, String>();
//
//        // Won't work without initializer
//        // var n;
//
//        // Won't work if initialized with null
//        // var nTwo = null;
//
//        // Won't work for non-local variable
//        // public n nThree = "hello";
//
//        // Needs explicit target type in array
//        // var nFour = {1, 2, 3};
//
//        // Legal use of var but difficult to understand
//        var nFive = returnZero();
//
//        // Using with diamond operator
//        var nSix = new ArrayList<>();
//        var nSeven = new ArrayList<String>();
    }
}
