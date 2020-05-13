package com.company;

public class AbstractFactory{
    private int width;
    private int length;

    public AbstractFactory() {
    }

    public static IGeometry create(double length, double width, ShapeType type){

        switch(type)
        {
            case Triangle: return new TriangleRectangular((float)length, (float)width);

            case Rectangle: return new Rectangle((int)length, (int)width);

            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }

/*        if(type.equals("triangle"))
        {
            return new TriangleRectangular((float)length, (float)width);
        }
        if(type.equals("rectangle"))
        {
            return new Rectangle((int)length, (int)width);
        }*/
        //return null;
    }
}
