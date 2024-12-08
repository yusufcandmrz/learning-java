package com.yusufcandmrz.jdk14.switchexpressions;

enum Days {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class Main {

    // Makes switch usable

    public static void main(String[] args) {

        /*


        *switch expression // java12 de tanitildi. java14'de standartlastirildi
- switch statements'i goster
- bu statements uzerinden switch expression haline getir
- yield nedir? yield'i nasil kullanabiliriz?





*sealed classes // java 15'de tanitildi. java17'de tamamlandi
- alt siniflar sealed, non-sealed veya final olmali

*virtual threads // java 19 - 22
-- virtual thread kullanacagimiz zaman, sayi belirtmemize gerek yok. arka planda jvm bunu yonetiyor. calisacak olan virtual threads gonderilen gorev sayisina, guncel olarak aktif olan gorevlere ve kac tanesinin bekliyor olmasina bagli olarak degiskenlik gostermektedir.
-- virtual threads, platform thread ustunde caliyor. jvm virtual threads kullanabilmek icin platform threads kullanmaktadir. tabii her bir virtual thread icin platform thread olusturmamaktadir. Kucuk sayida platform threads tekrar kullanarak virtual threads calistirabilmektedir.
-- platform threads isletim sistemindeki threads ile eslesmektedir. her bir platform thread icin isletim sistemindeki bir thread ayarlanmaktadir
-- bir virtual thread beklemeye alindiginda parked durumuna geciyor. parked oldugunda ise virtual thread'in bagli oldugu platform thread'i baska isleri yapabilmesi icin serbest birakiyor.
-- bir virtual thread calismadiginda heap memory'de yer alir. buna 'stack chunk object' denir.

- thread'ler artik platform thread olarak isimlendirilmektedir
- platform threads isletim sistemi tarafindan yonetilipm dogrudan sistemdeki is parcaciklariyla eslesir. virtual threads ise jvm tarafindan yonetilip kucuk sayidaki platform threads ile calistirilabilir.
- platform threads context-switching ve kaynak yonetimi isletim sistemi tarafindan yapilir. \

*collection factory methods //java 9
*http client // java 11
*jshell // java 9
- jpms // java 9





jdk15
+ text blocks

jdk22
+ unnamed variable
+ multifile programs



        java 12'de tanitildi. java 14'de tamamlandi

         */

        String day = Days.FRIDAY.toString();
        int dayNumber = switch (day) {
            case "SUNDAY" -> 7;
            case "MONDAY" -> 1;
            case "TUESDAY" -> 2;
            case "WEDNESDAY" -> 3;
            case "THURSDAY" -> 4;
            case "FRIDAY" -> 5;
            case "SATURDAY" -> 6;
            default -> 0;
        };
        System.out.println("Day number -> " + dayNumber);

        /* switch (day) {
            case "SUNDAY":
                dayNumber = 7;
                break;
            case "MONDAY":
                dayNumber = 1;
                break;
            case "TUESDAY":
                dayNumber = 2;
                break;
            case "WEDNESDAY":
                dayNumber = 3;
                break;
            case "THURSDAY":
                dayNumber = 4;
                break;
            case "FRIDAY":
                dayNumber = 5;
                break;
            case "SATURDAY":
                dayNumber = 6;
                break;
            default:
                dayNumber = 0;
        }
        System.out.println(dayNumber); */
    }
}