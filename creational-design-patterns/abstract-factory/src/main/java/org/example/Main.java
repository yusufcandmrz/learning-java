package org.example;

public class Main {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer(new PCFactory("PC RAM", "PC HDD", "PC CPU"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("SERVER RAM", "SERVER HDD", "SERVER CPU"));
        System.out.println(pc);
        System.out.println(server);
    }
}