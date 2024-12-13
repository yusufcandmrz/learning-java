package com.yusufcandmrz.jdk10.localvariabletypeinference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // https://www.baeldung.com/java-10-local-variable-type-inference

        // Before JDK 10
        // List<String> names = new ArrayList<>();

        // After JDK 10
        // var names = new ArrayList<String>();

        // Simple variable declaration
        var number = 10; // Inferred as int
        System.out.println("Number: " + number);

        // Using with collections
        var names = List.of("Alice", "Bob", "Charlie");
        System.out.println("Names: " + names);

        // Using with streams
        var filteredNames = names.stream()
                .filter(name -> name.startsWith("A"))
                .toList();
        System.out.println("Filtered Names: " + filteredNames);

        // Using in loops
        for (var name : names) {
            System.out.println("Name: " + name);
        }

        // Using with Map.Entry
        var map = Map.of("key1", "value1", "key2", "value2");
        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        /*
        Explicitness vs. Readability:
        Using var excessively can reduce code clarity for unfamiliar developers.
        Avoid using var when the type isn't obvious from the context.
        var data = process(); // What is 'data'? This can be unclear.

        Cannot Be Used Everywhere:
        Cannot declare method parameters, return types, or fields with var
        // Invalid Usage:
        // public var calculate() { ... } // Not allowed

        Initialization is Mandatory:
        // var uninitialized; // Error: Variable must be initialized.
        */


        // *********************************************************
        // *********************************************************
        // *********************************************************


        // "var" anahtar kelimesi ile kullanilir

        /* String message = "hello string";
        var messageTwo = "hello local variable type inference";
        System.out.println(messageTwo.getClass().getSimpleName()); */
        // Burada messageTwo degiskeninin tipini belirtmedik. Onun yerine, var olarak isaretledik. Compiler sag tarafta
        // degiskene atanan degere bakarak tipini belirler.

        // Bu ozellik sadece baslangic degeri belirtilen yerel degiskenlerde kullanilabilir.

        /* Map<Integer, String> map = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>();
        var map3 = new HashMap<Integer, String>();
        var map4 = new HashMap<>(); */

        // "var" bir anahtar kelime degildir

        // Calisma zamanina bir yuku yoktur ve java'yi dinamik tipli programlama dili yapmaz.

        // var variable;
        // Degiskene bir deger atanmali

        // var variableList = null;
        // Degiskene bir deger atanmali ve bu null olmamali

        // public var variable = "hello";
        // degiskene erisim olarak bir deger atanmamali, bu ornekteki public olmamali

        // var variable = (String string) -> string.length() > 10;
        // lambda expression kullanmak icin tipini belirmeliyiz

        // var arr = {1, 2, 3};
        // array kullanmak icin degisken tipini belirtmeliyiz.

        // Legal olarak kullanilabilecek yerler olmasina ragmen, bazen kodu daha az okunabilir yapmaktadir.
        // dolayisiyla "var" kullanacagimiz zaman dikkat etmek gerekir.

        // var variable = new Object(){};
        // variable = new Object();
        // anonim sinif objesine yeni bir obje atamaya calisirsak hata aliriz.
    }
}
