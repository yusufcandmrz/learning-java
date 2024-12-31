package com.yusufcandmrz.records;

import java.util.function.BiFunction;

public record RectangleRecord(double length, double width) {

    // Nested record class
    record RotationAngle(double angle) {
        public RotationAngle {
            angle = Math.toRadians(angle);
        }
    }

    static double goldenRatio;

//    // Field declarations must be static
//    BiFunction<Double, Double, Double> dioganal;

    static {
        goldenRatio = (1 + Math.sqrt(5)) / 2;
    }

    // The Canonical Constructor of a Record Class
    public RectangleRecord {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException(
                    String.format("Invalid dimensions: %f, %f", length, width)
            );
        }
    }

    // Explicit Declaration of Record Class Members
    public double getLength() {
        return length;
    }

    public static RectangleRecord createGoldenRectangle(double width) {
        return new RectangleRecord(width, width * goldenRatio);
    }

    public RectangleRecord getRotatedRectangleBoundingBox(double angle) {
        RotationAngle ra = new RotationAngle(angle);
        double x = Math.abs(length * Math.cos(ra.angle())) +
                Math.abs(width * Math.sin(ra.angle()));
        double y = Math.abs(length * Math.sin(ra.angle())) +
                Math.abs(width * Math.cos(ra.angle()));
        return new RectangleRecord(x, y);
    }
}
