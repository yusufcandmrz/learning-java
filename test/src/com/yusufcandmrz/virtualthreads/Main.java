package com.yusufcandmrz.virtualthreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Thread thread = Thread.ofVirtual().start(() -> {
            System.out.println("Hello thread");
        });
        thread.join();

        System.out.println("***************************************************");

        Thread.Builder builder = Thread.ofVirtual().name("threadTwo");
        Runnable runnable = () -> {
            System.out.println("hello threadTwo");
        };
        Thread threadTwo = builder.start(runnable);
        System.out.println(thread.getName());
        threadTwo.join();

        System.out.println("***************************************************");

        Thread.Builder builderTwo = Thread.ofVirtual().name("threadThree", 0);
        Runnable runnableTwo = () -> {
            System.out.println("Thread ID: " + Thread.currentThread().threadId());
        };
        Thread threadThree = builderTwo.start(runnableTwo);
        threadThree.join();
        System.out.println(threadThree.getName() + " terminated");

        Thread threadFour = builderTwo.start(runnableTwo);
        threadFour.join();
        System.out.println(threadFour.getName() + " terminated");

        System.out.println("***************************************************");

        try(ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()){
            executor.submit(() -> {
                System.out.println("Thread ID: " + Thread.currentThread().threadId());
            });
        }
    }
}