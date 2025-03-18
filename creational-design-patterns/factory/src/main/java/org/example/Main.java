package org.example;

public class Main {
    public static void main(String[] args) {
        Computer computerOne = ComputerFactory.getComputer("PC", "RAM one", "HDD one", "CPU one");
        Computer computerTwo = ComputerFactory.getComputer("SERVER", "RAM two", "HDD two", "CPU two");
        System.out.println("PC -> " + computerOne);
        System.out.println("SERVER -> " + computerTwo);
    }
}