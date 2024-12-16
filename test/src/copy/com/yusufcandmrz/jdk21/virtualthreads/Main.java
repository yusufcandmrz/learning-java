package copy.com.yusufcandmrz.jdk21.virtualthreads;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // Creating a Virtual Thread with the Thread Class and the Thread.Builder Interface
        Thread thread = Thread.ofVirtual().start(() -> {
            System.out.println("Hello thread");
        });
        thread.join();

        System.out.print("***************************************************");

        Thread.Builder builder = Thread.ofVirtual().name("threadTwo");
        Runnable runnable = () -> {
            System.out.println("hello threadTwo");
        };
        Thread threadTwo = builder.start(runnable);
        System.out.println(thread.getName());
        threadTwo.join();

        System.out.print("***************************************************");

        Thread.Builder builderTwo = Thread.ofVirtual().name("threadThree", 0);
        Runnable runnableTwo = () -> {
            System.out.println("hello threadThree");
        };
        Thread threadThree = builderTwo.start(runnableTwo);
    }
}
