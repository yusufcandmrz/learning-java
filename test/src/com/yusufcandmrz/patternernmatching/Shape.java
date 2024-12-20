package com.yusufcandmrz.patternernmatching;

public interface Shape {

    public static double getPerimeter(Shape shape) {
//        // before pattern matching
//        if (shape instanceof Rectangle) {
//            Rectangle rectangle = (Rectangle) shape;
//            return 2 * rectangle.length + 2 * rectangle.width;
//        } else if (shape instanceof Circle) {
//            Circle circle = (Circle) shape;
//            return 2 * circle.radius * Math.PI;
//        } else {
//            throw new IllegalArgumentException("Unrecognized shape");
//        }

//        // after pattern matching
//        if (shape instanceof Rectangle rectangle) {
//            return 2 * rectangle.length + 2 * rectangle.width;
//        } else if (shape instanceof Circle circle) {
//            return 2 * circle.radius * Math.PI;
//        } else {
//            throw new IllegalArgumentException("Unrecognized shape");
//        }

//        // switch statement with pattern matching
//        return switch (shape) {
//            case Rectangle rectangle -> 2 * rectangle.length + 2 * rectangle.width;
//            case Circle circle -> 2 * circle.radius * Math.PI;
//            default -> throw new IllegalArgumentException("Unrecognized shape");
//        };

        // switch expression with pattern matching
        return switch (shape) {
            case Rectangle rectangle -> 2 * rectangle.length + 2 * rectangle.width;
            case Circle circle -> 2 * circle.radius * Math.PI;
            default -> throw new IllegalArgumentException("Unrecognized shape");
        };
    }

    public static boolean bigEnoughRect(Shape shape) {
//        if(!(shape instanceof Rectangle rectangle)) {
//            return false;
//        }
//        return rectangle.length > 5;

        return shape instanceof Rectangle rectangle && rectangle.length > 5;

//        // compile error
//        if(shape instanceof Rectangle rectangle || rectangle.length > 5) {}
    }
}
