public class Main {
    public static void main(String[] args) {

        /* Cat cat = new Cat();
        cat.print(); */

        // printPrintable(new Cat());

        /* printPrintable((string) -> {
            System.out.println("Meow" + string);
        }); */

        /* Printable printable = (string) -> {
            System.out.println("Meow" + string);
        }; */

        /* Printable printable = (string) -> "Meow" + string;
        System.out.println(printPrintable(printable)); */
    }

    public static String printPrintable(Printable printable) {
        return printable.print("!");
    }
}