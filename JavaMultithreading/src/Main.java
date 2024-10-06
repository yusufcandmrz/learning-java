
/* class ABC implements Runnable {
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        System.out.println("state of thread1 while it invoked the method join() on thread2 - " + Main.thread1.getState());
        try {
            Thread.sleep(200);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
} */

class Multi extends Thread {

    public void run() {
        System.out.println("thread running...");
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500);
                System.out.println("The current thread name is: " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }

    public Multi(String threadName) {
        super(threadName);
    }
}

class MyThread implements Runnable {
    public void run() {
        System.out.println("thread running...");
    }
}

public class Main /* implements Runnable */ {

    /* public static Thread thread1;
    public static Main object;

    @Override
    public void run() {
        ABC abc = new ABC();
        Thread thread2 = new Thread(abc);
        System.out.println("state of thread2 after spawning it - " + thread2.getState());
        thread2.start();
        System.out.println("state of thread2 after starting it - " + thread2.getState());
        try {
            Thread.sleep(200);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        System.out.println("state of thread2 after sleeping it - " + thread2.getState());
        try {
            thread2.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        System.out.println("state of thread2 when it has completed its execution - " + thread2.getState());
    } */

    public static void main(String[] args) {
        // LIFE CYCLE OF A THREAD
        /* object = new Main();
        thread1 = new Thread(object);
        System.out.println("state of thread1 after spawning it - " + thread1.getState());
        thread1.start();
        System.out.println("state of thread1 after starting it - " + thread1.getState()); */


        // *******************************************
        // *******************************************
        // *******************************************
        // HOW TO CREATE THREAD
        /* Multi multi = new Multi();
        multi.start();

        Thread thread = new Thread(multi);
        thread.start();

        Thread thread2 = new Thread("thread2");
        System.out.println("thread2 name: " + thread2.getName());

        Runnable runnable = new MyThread();
        Thread thread3 = new Thread(runnable, "thread3");
        System.out.println("thread3 name: " + thread3.getName()); */


        // *******************************************
        // *******************************************
        // *******************************************
        // SLEEPING A THREAD
        /* Multi thread1 = new Multi();
        Multi thread2 = new Multi();
        thread1.start();
        thread2.start(); */

        /* for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        } */


        // *******************************************
        // *******************************************
        // *******************************************
        // START A THREAD TWICE
        /* Multi thread1 = new Multi();
        thread1.start();
        thread1.start(); */


        // *******************************************
        // *******************************************
        // *******************************************
        // CALLING run() METHOD
        /* Multi thread1 = new Multi();
        Multi thread2 = new Multi();
        thread1.run();
        thread2.run(); */


        // *******************************************
        // *******************************************
        // *******************************************
        // JOINING A THREAD
        /* Multi thread1 = new Multi();
        Multi thread2 = new Multi();
        Multi thread3 = new Multi(); */

        /* thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread3.start();
        try {
            thread3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } */

        /* thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread2.start();
        thread3.start(); */

        /* thread1.start();
        try {
            thread1.join(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread2.start();
        thread3.start(); */


        // *******************************************
        // *******************************************
        // *******************************************
        // NAMING A THREAD
        /* Multi thread1 = new Multi();
        System.out.println("thread1's name is: " + thread1.getName());
        thread1.setName("Sonoo Jaiswal");
        System.out.println("thread1's name is: " + thread1.getName()); */

        /* Multi thread1 = new Multi("Javatpoint1");
        System.out.println(thread1.getName()); */
    }
}