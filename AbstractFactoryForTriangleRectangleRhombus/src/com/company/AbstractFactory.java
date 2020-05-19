package com.company;

public class AbstractFactory {
    private int width;
    private int length;

    public AbstractFactory() {
    }

    public static ICreate create(double length, double width, Shape type){

        switch(type)
        {
            case TRIANGLE: return new Triangle(length, width);

            case RECTANGLE: return new Rectangle((int)length, (int)width);

            case RHOMBUS: return new Rhombus((int)length, (int)width);

            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }
    }
}
