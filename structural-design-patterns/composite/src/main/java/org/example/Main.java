package org.example;

public class Main {
    public static void main(String[] args) {
        Drawing drawing = new Drawing();
        drawing.add(new Circle());
        drawing.add(new Triangle());
        drawing.draw("Black");
        drawing.clear();
    }
}