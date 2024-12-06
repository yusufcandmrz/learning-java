package com.yusufcandmrz.localvariabletypeinference;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // java 10 ve sonrasi icin kullanilabilir

        // "var" anahtar kelimesi ile kullanilir

        String message = "hello string";
        var messageTwo = "hello local variable type inference";
        System.out.println(messageTwo.getClass().getSimpleName());
        // Burada messageTwo degiskeninin tipini belirtmedik. Onun yerine, var olarak isaretledik. Compiler sag tarafta
        // degiskene atanan degere bakarak tipini belirler.

        // Bu ozellik sadece baslangic degeri belirtilen yerel degiskenlerde kullanilabilir.

        Map<Integer, String> map = new HashMap<Integer, String>();
        Map<Integer, String> map2 = new HashMap<>();
        var map3 = new HashMap<Integer, String>();
        var map4 = new HashMap<>();

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
