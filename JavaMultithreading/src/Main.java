
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

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Multi extends Thread {

    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("daemon thread running...");
        } else {
            System.out.println("thread running...");
        }
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

class ShutdownHook extends Thread {
    public void run() {
        System.out.println("shutdown hook task completed");
    }
}

class FirstThread extends Thread {
    public void run() {
        System.out.println("first task");
    }
}

class SecondThread extends Thread {
    public void run() {
        System.out.println("second task");
    }
}

class MyThread implements Runnable {

    /* private String message;

    public MyThread(String message) {
        this.message = message;
    }

    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("daemon thread running...");
        } else {
            System.out.println("thread running...");
        }
        System.out.println(Thread.currentThread().getName() + " (START) message -> " + message);
        processMessage();
        System.out.println(Thread.currentThread().getName() + " (END)");
    }

    private void processMessage() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    } */

    private String taskName;

    public MyThread(String taskName) {
        this.taskName = taskName;
    }

    public void run() {

        Date dt;
        SimpleDateFormat sdf;

        for (int i = 0; i < 5; i++) {
            dt = new Date();
            sdf = new SimpleDateFormat("hh:mm:ss");
            if (i == 0) {
                System.out.println("Initialization time for the task name: " + taskName + " = " + sdf.format(dt));
            } else {
                System.out.println("Time of execution for the task name: " + taskName + " = " + sdf.format(dt));
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(taskName + " is complete");
    }
}

class MyThreadGroup implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " thread has finished");
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

    /* int contr = 1;
    static int NUM;

    public void displayOddNumber() {
        synchronized (this) {
            while (contr < NUM) {
                while (contr % 2 == 0) {
                    try {
                        wait();
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
                System.out.print(contr + " ");
                contr += 1;
                notify();
            }
        }
    }

    public void displayEvenNumber() {
        synchronized (this) {
            while (contr < NUM) {
                while (contr % 2 == 1) {
                    try {
                        wait();
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
                System.out.print(contr + " ");
                contr += 1;
                notify();
            }
        }
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



        // *******************************************
        // *******************************************
        // *******************************************
        // THREAD PRIORITY
        /* Multi thread1 = new Multi("thread1");
        System.out.println("priority of thread1: " + thread1.getPriority());
        thread1.setPriority(7);
        System.out.println("priority of thread1 after setting: " + thread1.getPriority());
        System.out.println("current thread: " + Thread.currentThread().getName()
                + ", priority: " + Thread.currentThread().getPriority()); */

        /* Thread.currentThread().setPriority(7);
        Multi thread1 = new Multi("thread1");
        System.out.println("priority of thread1: " + thread1.getPriority()); */



        // *******************************************
        // *******************************************
        // *******************************************
        // DAEMON THREAD
        /* Multi thread1 = new Multi("thread1");
        Multi thread2 = new Multi("thread2");
        thread1.setDaemon(true);
        thread1.start();
        thread2.start(); */



        // *******************************************
        // *******************************************
        // *******************************************
        // THREAD POOL
        /* ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            Runnable runnable = new MyThread(" " + i);
            executor.execute(runnable);
        }
        executor.shutdown();
        while (!executor.isTerminated()) {
            // System.out.println("executor not terminated...");
        }
        System.out.println("Finished all threads"); */

        /* final int MAX_TH = 3;
        Runnable runnable1 = new MyThread("task1");
        Runnable runnable2 = new MyThread("task2");
        Runnable runnable3 = new MyThread("task3");
        Runnable runnable4 = new MyThread("task4");
        Runnable runnable5 = new MyThread("task5");
        ExecutorService executorService = Executors.newFixedThreadPool(MAX_TH);
        executorService.execute(runnable1);
        executorService.execute(runnable2);
        executorService.execute(runnable3);
        executorService.execute(runnable4);
        executorService.execute(runnable5);
        executorService.shutdown(); */



        // *******************************************
        // *******************************************
        // *******************************************
        // THREAD GROUP
        /* MyThreadGroup myThreadGroup = new MyThreadGroup();
        ThreadGroup threadGroup = new ThreadGroup("ThreadGroupName");
        ThreadGroup threadGroup2 = new ThreadGroup(threadGroup,"ThreadGroupName2");

        Thread thread1 = new Thread(threadGroup, myThreadGroup, "one");
        thread1.start();
        Thread thread2 = new Thread(threadGroup, myThreadGroup, "two");
        thread2.start();
        Thread thread3 = new Thread(threadGroup, myThreadGroup, "three");
        thread3.start(); */

        /* System.out.println("Thread Group Name: " + threadGroup.getName());
        threadGroup.list(); */

        // System.out.println("Active Threads: " + threadGroup.activeCount());

        // System.out.println("Active Thread Grops: " + threadGroup.activeGroupCount());

        /* Thread[] threads = new Thread[threadGroup.activeCount()];
        int count = threadGroup.enumerate(threads);
        for(int i = 0; i < count; i++) {
            System.out.println("Thread " + threads[i].getName() + " is found");
        } */

        // System.out.println("Thread Group Max Priority: " + threadGroup.getMaxPriority());

        /* System.out.println("ThreadGroup Parent Name: " + threadGroup.getParent().getName());
        System.out.println("ThreadGroup2 Parent Name: " + threadGroup2.getParent().getName()); */

        // threadGroup.interrupt();



        // *******************************************
        // *******************************************
        // *******************************************
        // SHUTDOWN HOOK
        /* Runtime runtime = Runtime.getRuntime();

        ShutdownHook shutdownHook = new ShutdownHook();

        // runtime.addShutdownHook(shutdownHook);

        runtime.addShutdownHook(new Thread() {
            public void run() {
                System.out.println("shutdown hook task completed");
            }
        });

        System.out.println("main thread sleeping...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // runtime.removeShutdownHook(shutdownHook); */



        // *******************************************
        // *******************************************
        // *******************************************
        // PERFORMING MULTIPLE TASK
        /* FirstThread ft = new FirstThread();
        FirstThread ft2 = new FirstThread();
        ft.start();
        ft2.start(); */

        /* Thread thread = new Thread() {
            public void run() {
                System.out.println("thread task");
            }
        };
        Thread thread2 = new Thread() {
            public void run() {
                System.out.println("thread2 task");
            }
        };
        thread.start();
        thread2.start(); */

        /* FirstThread ft = new FirstThread();
        SecondThread st = new SecondThread();
        ft.start();
        st.start(); */

        /* Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable task");
            }
        };
        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable2 task");
            }
        };
        Thread thread = new Thread(runnable);
        Thread thread2 = new Thread(runnable2);
        thread.start();
        thread2.start(); */

        /* NUM = 20;
        Main main = new Main();
        Thread th1 = new Thread(new Runnable() {
            @Override
            public void run() {
                main.displayEvenNumber();
            }
        });
        Thread th2 = new Thread(new Runnable() {
            @Override
            public void run() {
                main.displayOddNumber();
            }
        });
        th1.start();
        th2.start(); */



        // *******************************************
        // *******************************************
        // *******************************************
        // RUNTIME CLASS
        // Runtime runtime = Runtime.getRuntime();

        /* try {
            runtime.exec("notepad");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } */

        /* try {
            runtime.exec("C:\\Windows\\System32\\shutdown -s -t 0");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } */

        /* System.out.println("runtime available processors: " + runtime.availableProcessors());
        System.out.println("runtime free memory: " + runtime.freeMemory());
        System.out.println("runtime total memory: " + runtime.totalMemory()); */
    }
}