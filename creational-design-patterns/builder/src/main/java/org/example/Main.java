package org.example;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("HDD", "RAM")
                .setIsBluetoothEnabled(true)
                .setIsGraphicsCardEnabled(true)
                .build();
        System.out.println(computer);
    }
}