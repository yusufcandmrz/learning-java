package org.example;

public class ComputerFactory {

    public static Computer getComputer(String type, String RAM, String HDD, String CPU) {
        if (type.equalsIgnoreCase("PC")) {
            return new PC(RAM, HDD, CPU);
        } else if (type.equalsIgnoreCase("SERVER")) {
            return new Server(RAM, HDD, CPU);
        } else {
            return null;
        }
    }
}
