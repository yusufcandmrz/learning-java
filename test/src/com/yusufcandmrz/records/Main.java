package com.yusufcandmrz.records;

public class Main {

    public static void main(String[] args) {
        var rClass = new RectangleClass(1.2, 3.4);
        var rRecord = new RectangleRecord(1.2, 3.4);

        //calling getLength()
        System.out.println(rRecord.getLength());

        //calling createGoldenRectangle()
        System.out.println(RectangleRecord.createGoldenRectangle(3.4));

        //calling getRotatedRectangleBoundingBox()
        System.out.println(rRecord.getRotatedRectangleBoundingBox(3.4));
    }
}
