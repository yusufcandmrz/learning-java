package org.example;

public class Main {
    public static void main(String[] args) {
        Shape triangle = new Triangle(new RedColor());
        triangle.applyColor();

        System.out.println("************************");

        Shape pentagon = new Pentagon(new GreenColor());
        pentagon.applyColor();
    }
}