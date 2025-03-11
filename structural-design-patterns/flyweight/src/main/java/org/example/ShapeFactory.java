package org.example;

import java.util.HashMap;

enum ShapeType {
    OVAL_FILL,
    OVAL_NOFILL,
    LINE
}

public class ShapeFactory {

    private static final HashMap<ShapeType, Shape> shapeList = new HashMap<>();

    public static Shape getShape(ShapeType type) {
        Shape shape = shapeList.get(type);
        if (shape == null) {
            if (type.equals(ShapeType.OVAL_FILL)) {
                shape = new Oval(true);
            } else if (type.equals(ShapeType.OVAL_NOFILL)) {
                shape = new Oval(false);
            } else if (type.equals(ShapeType.LINE)) {
                shape = new Line();
            }
            shapeList.put(type, shape);
        }
        return shape;
    }
}
