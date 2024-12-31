package com.yusufcandmrz.records;

import java.util.Objects;

public final class RectangleClass {
    private final double length;
    private final double width;

    public RectangleClass(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "RectangleClass{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RectangleClass that = (RectangleClass) o;
        return Double.compare(length, that.length) == 0 && Double.compare(width, that.width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, width);
    }
}
