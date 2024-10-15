class Table {

    /* synchronized void printTable(int number) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(number * i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    } */

    void printTable(int number) {
        synchronized (this) {
            for (int i = 1; i <= 5; i++) {
                System.out.println(number * i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

class Sender {
    public void sendMessage(String message) {
        System.out.println("Sending a message: " + message);
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Thread interrupted");
        }
        System.out.println(message);
    }
}

class MyThread extends Thread {

    Table table;
    int number;

    MyThread(Table table, int number) {
        this.table = table;
        this.number = number;
    }

    public void run() {
        table.printTable(number);
    }
}

class SenderThread extends Thread {
    Sender sender;
    private String message;

    SenderThread(Sender sender, String message) {
        this.sender = sender;
        this.message = message;
    }

    public void run() {
        synchronized (sender) {
            sender.sendMessage(message);
        }
    }
}


public class Main {

    public static void main(String[] args) {
        // SYNCHRONIZATION IN JAVA
        // Table table = new Table();

        /* MyThread th1 = new MyThread(table, 5);
        MyThread th2 = new MyThread(table, 100);
        th1.start();
        th2.start(); */

        /* Thread th1 = new Thread() {
            public void run() {
                table.printTable(5);
            }
        };
        Thread th2 = new Thread() {
            public void run() {
                table.printTable(100);
            }
        };
        th1.start();
        th2.start(); */



        // ************************************************************
        // ************************************************************
        // ************************************************************
        // SYNCHRONIZED BLOCK IN JAVA
        /* Table table = new Table();

        MyThread th1 = new MyThread(table, 5);
        MyThread th2 = new MyThread(table, 100);
        th1.start();
        th2.start(); */

        /* Sender sender = new Sender();
        SenderThread st1 = new SenderThread(sender, "Hola");
        SenderThread st2 = new SenderThread(sender, "Welcome to Javatpoint website");
        st1.start();
        st2.start(); */
    }
}