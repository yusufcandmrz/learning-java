public class Main {
    public static void main(String[] args) {

        Integer integerVariable = 25;
        Double doubleVariable = 25.00;
        String stringVariable = "Hello Java";

        /* PrinterInteger printerInteger = new PrinterInteger(integerVariable);
        printerInteger.printVariable();
        PrinterDouble printerDouble = new PrinterDouble(doubleVariable);
        printerDouble.printVariable();
        PrinterString printerString = new PrinterString(stringVariable);
        printerString.printVariable(); */

        Printer<Integer> integerPrinter = new Printer<>(integerVariable);
        integerPrinter.printVariable();
        Printer<Double> doublePrinter = new Printer<>(doubleVariable);
        doublePrinter.printVariable();
        Printer<String> stringPrinter = new Printer<>(stringVariable);
        stringPrinter.printVariable();
    }
}