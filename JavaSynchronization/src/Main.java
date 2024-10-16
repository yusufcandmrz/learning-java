class Table {

    /* synchronized static void printTable(int number) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(number * i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    } */

    static void printTable(int number) {
        synchronized (Table.class) {
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

    private class FirstResource {
        private int i = 10;

        public int getSource() {
            return this.i;
        }

        public void setSource(int i) {
            this.i = i;
        }
    }

    private class SecondResource {
        private int source = 10;

        public int getSource() {
            return this.source;
        }

        public void setSource(int source) {
            this.source = source;
        }
    }

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


        // ************************************************************
        // ************************************************************
        // ************************************************************
        // STATIC SYNCHRONIZATION
        /* Table table = new Table();
        MyThread th1 = new MyThread(table, 1);
        MyThread th2 = new MyThread(table, 10);
        th1.start();
        th2.start(); */


        // ************************************************************
        // ************************************************************
        // ************************************************************
        // DEADLOCK IN JAVA

        /* final String resource1 = "ratan jaiswal";
        final String resource2 = "viman jaiswal";

        Thread t1 = new Thread() {
            public void run() {
                synchronized (resource1) {
                    System.out.println("th1 locked resource1");
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
                synchronized (resource2) {
                    System.out.println("th1 locked resource2");
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                synchronized (resource2) {
                    System.out.println("th2 locked resource2");
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
                synchronized (resource1) {
                    System.out.println("th2 locked resource1");
                }
            }
        };
        t1.start();
        t2.start(); */

        /* Main main = new Main();
        final FirstResource firstResource = main.new FirstResource();
        final SecondResource secondResource = main.new SecondResource();

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                synchronized (firstResource) {
                    System.out.println("r1 locked firstResource");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (secondResource) {
                        System.out.println("r1 locked SecondSource");
                    }
                }
            }
        };
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                synchronized (secondResource) {
                    System.out.println("r2 locked secondSource");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (firstResource) {
                        System.out.println("r2 locked firstSource");
                    }
                }
            }
        };
        new Thread(r1).start();
        new Thread(r2).start(); */
    }
}