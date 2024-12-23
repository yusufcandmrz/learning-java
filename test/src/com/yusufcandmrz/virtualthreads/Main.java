package com.yusufcandmrz.virtualthreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {

//        Runnable runnableZero = () -> {
//            System.out.println("hello threadZero");
//        };
//        Thread threadZero = new Thread(runnableZero);
//        threadZero.start();
//        threadZero.join();

//        try (ExecutorService executor = Executors.newFixedThreadPool(3)) {
//            executor.submit(() -> {
//                System.out.println("Thread ID: " + Thread.currentThread().threadId());
//            });
//        }

        // *************************************************************************************************************

//        Thread thread = Thread.ofVirtual().start(() -> {
//            System.out.println("Hello thread");
//        });
//        thread.join();

        // *************************************************************************************************************

//        Thread.Builder builder = Thread.ofVirtual().name("threadTwo");
//        Runnable runnable = () -> {
//            System.out.println("hello threadTwo");
//        };
//        Thread threadTwo = builder.start(runnable);
//        System.out.println(threadTwo.getName());
//        threadTwo.join();

        // *************************************************************************************************************

//        Thread.Builder builderTwo = Thread.ofVirtual().name("threadThree", 0);
//        Runnable runnableTwo = () -> {
//            System.out.println("Thread ID: " + Thread.currentThread().threadId());
//        };
//        Thread threadThree = builderTwo.start(runnableTwo);
//        threadThree.join();
//        System.out.println(threadThree.getName() + " terminated");
//
//        Thread threadFour = builderTwo.start(runnableTwo);
//        threadFour.join();
//        System.out.println(threadFour.getName() + " terminated");

        // *************************************************************************************************************

//        ExecutorService executorZero = Executors.newVirtualThreadPerTaskExecutor();
//        executorZero.submit(() -> {
//            System.out.println("Thread ID: " + Thread.currentThread().threadId());
//        });
//        executorZero.awaitTermination(60, TimeUnit.SECONDS);

//        try(ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()){
//            executor.submit(() -> {
//                System.out.println("Thread ID: " + Thread.currentThread().threadId());
//            });
//        }
    }
}