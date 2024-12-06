package com.yusufcandmrz.virtualthreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void simulateNetworkRequest(int requestId) throws InterruptedException {
        System.out.println("Request " + requestId + " started.");
        Thread.sleep(1000);
        System.out.println("Request " + requestId + " completed.");
    }

    public static void main(String[] args) {
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
