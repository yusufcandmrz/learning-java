import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    static <T extends String, K> void printVariable(T variable, K variableTwo) {
        System.out.println(variable + " - " + variableTwo);
    }

    public static void main(String[] args) {

        /* Integer integerVariable = 25;
        Double doubleVariable = 25.00;
        String stringVariable = "Hello Java";
        List<String> stringVariables = new ArrayList<>(Arrays.asList("Yusuf", "Can")); */

        /* PrinterInteger printerInteger = new PrinterInteger(integerVariable);
        printerInteger.printVariable();
        PrinterDouble printerDouble = new PrinterDouble(doubleVariable);
        printerDouble.printVariable();
        PrinterString printerString = new PrinterString(stringVariable);
        printerString.printVariable(); */

        /* Printer<Integer> integerPrinter = new Printer<>(integerVariable);
        integerPrinter.printVariable();
        Printer<Double> doublePrinter = new Printer<>(doubleVariable);
        doublePrinter.printVariable();
        Printer<String> stringPrinter = new Printer<>(stringVariable);
        stringPrinter.printVariable(); */

        /* ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Yusuf");

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(25);

        ArrayList<Object> objectArrayList = new ArrayList<>();
        objectArrayList.add("Yusuf");
        objectArrayList.add(25);
        System.out.println(objectArrayList); */

        /* Printer<Cat> catPrinter = new Printer(new Cat("Golge"));
        catPrinter.printVariable();

        Printer<Dog> dogPrinter = new Printer<>(new Dog("Kara"));
        dogPrinter.printVariable(); */

        /* printVariable(25, 25.0);
        printVariable(25.0, "Hello Java");
        printVariable("Hello Java", 25); */

        /* Printer<String> stringPrinter = new Printer<>(stringVariables);
        stringPrinter.printVariables(); */
    }
}