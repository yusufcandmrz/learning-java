package org.example;

import java.awt.*;

public class Line implements Shape {

    public Line() {
        System.out.println("Creating Line object");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void draw(Graphics g, int x, int y, int width, int height, Color color) {
        g.setColor(color);
        g.drawLine(x, y, width, height);
    }
}
