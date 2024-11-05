public class Printer<T> {

    T variable;

    public Printer(T variable) {
        this.variable = variable;
    }

    public void printVariable() {
        System.out.println("variable: " + variable);
    }
}
