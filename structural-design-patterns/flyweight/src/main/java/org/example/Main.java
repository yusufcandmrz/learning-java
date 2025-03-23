package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    private static int WIDTH;
    private static int HEIGHT;
    private static final ShapeType[] shapes = {ShapeType.OVAL_FILL, ShapeType.OVAL_NOFILL, ShapeType.LINE};
    private static final Color[] colors = {Color.RED, Color.GREEN, Color.BLUE};

    public Main(int width, int height) {
        Main.WIDTH = width;
        Main.HEIGHT = height;
        JFrame frame = new JFrame();
        Container contentPane = frame.getContentPane();

        JButton startButton = new JButton("Draw");
        final JPanel panel = new JPanel();

        contentPane.add(panel, BorderLayout.CENTER);
        contentPane.add(startButton, BorderLayout.SOUTH);
        frame.setSize(WIDTH, HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Graphics g = panel.getGraphics();
                for (int i = 0; i < 20; i++) {
                    Shape shape = ShapeFactory.getShape(getRandomShape());
                    shape.draw(g, getRandomX(), getRandomY(), getRandomWidth(), getRandomHeight(), getRandomColor());
                }
            }
        });
    }

    private static ShapeType getRandomShape() {
        return shapes[(int) (Math.random() * shapes.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * WIDTH);
    }

    private static int getRandomY() {
        return (int) (Math.random() * HEIGHT);
    }

    private static int getRandomWidth() {
        return (int) (Math.random() * (WIDTH / 10));
    }

    private static int getRandomHeight() {
        return (int) (Math.random() * (HEIGHT / 10));
    }

    private static Color getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Main(500, 600));
    }
}