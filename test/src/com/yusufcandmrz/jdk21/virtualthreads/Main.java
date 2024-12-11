package com.yusufcandmrz.jdk21.virtualthreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    // Executors.newVirtualThreadPerTaskExecutor()

    public static void simulateNetworkRequest(int requestId) throws InterruptedException {
        System.out.println("Request " + requestId + " started.");
        Thread.sleep(1000);
        System.out.println("Request " + requestId + " completed.");
    }

    public static void main(String[] args) {

        /*
        virtual threads java 19 - 22
        -- virtual thread kullanacagimiz zaman, sayi belirtmemize gerek yok. arka planda jvm bunu yonetiyor. calisacak olan virtual threads gonderilen gorev sayisina, guncel olarak aktif olan gorevlere ve kac tanesinin bekliyor olmasina bagli olarak degiskenlik gostermektedir.
        -- virtual threads, platform thread ustunde caliyor. jvm virtual threads kullanabilmek icin platform threads kullanmaktadir. tabii her bir virtual thread icin platform thread olusturmamaktadir. Kucuk sayida platform threads tekrar kullanarak virtual threads calistirabilmektedir.
        -- platform threads isletim sistemindeki threads ile eslesmektedir. her bir platform thread icin isletim sistemindeki bir thread ayarlanmaktadir
        -- bir virtual thread beklemeye alindiginda parked durumuna geciyor. parked oldugunda ise virtual thread'in bagli oldugu platform thread'i baska isleri yapabilmesi icin serbest birakiyor.
        -- bir virtual thread calismadiginda heap memory'de yer alir. buna 'stack chunk object' denir.

        - thread'ler artik platform thread olarak isimlendirilmektedir
        - platform threads isletim sistemi tarafindan yonetilipm dogrudan sistemdeki is parcaciklariyla eslesir. virtual threads ise jvm tarafindan yonetilip kucuk sayidaki platform threads ile calistirilabilir.
        - platform threads context-switching ve kaynak yonetimi isletim sistemi tarafindan yapilir. \
        */


        /* Thread virtualThread = Thread.ofVirtual().start(() -> {
            System.out.println("This is running on a virtual thread");
        });

        try {
            virtualThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {
            Future<String> firstTask = executor.submit(() -> {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                return "First task completed";
            });
            Future<String> secondTask = executor.submit(() -> {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                return "Second task completed";
            });
            System.out.println(firstTask.get());
            System.out.println(secondTask.get());
        } catch (Exception e) {
            e.printStackTrace();
        } */

        /* try (ExecutorService executorService = Executors.newSingleThreadExecutor()) {
            for (int i = 0; i < 10; i++) {
                int requestId = i;
                executorService.submit(() -> {
                    try {
                        simulateNetworkRequest(requestId);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                });
            }
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        } */

        int taskCount = 1000000;
        try (ExecutorService executorService = Executors.newVirtualThreadPerTaskExecutor()) {
            for (int i = 0; i < taskCount; i++) {
                int taskId = i;
                executorService.submit(() -> {
                    System.out.println("Task " + taskId + " is being processed.");
                });
            }
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
