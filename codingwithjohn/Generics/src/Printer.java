import java.util.List;

public class Printer<T extends Object> {

    T variable;
    List<T> variables;

    public Printer(T variable) {
        this.variable = variable;
    }

    public Printer(List<T> variables) {
        this.variables = variables;
    }

    public void printVariable() {
        System.out.println("variable: " + variable);
    }

    public void printVariables() {
        System.out.println("variables: " + variables);
    }
}
