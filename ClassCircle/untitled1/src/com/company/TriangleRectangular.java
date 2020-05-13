package com.company;

public class TriangleRectangular implements IGeometry, IInfo{
    private float sideA;
    private float sideB;

    public TriangleRectangular() {
    }

    public TriangleRectangular(float sideA, float sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public float getSideA() {
        return sideA;
    }

    public void setSideA(float sideA) {
        this.sideA = sideA;
    }

    public float getSideB() {
        return sideB;
    }

    public void setSideB(float sideB) {
        this.sideB = sideB;
    }

/*    @Override
    public float getArea() {
        return this.getSideA()*this.getSideB()/2;
    }

    @Override
    public int getPerimeter() {
        return 0;
    }*/

    @Override
    public double getAllLengths() {
        return 0;
    }

    @Override
    public double getSquare() {
        return this.getSideA()*this.getSideB()/2;
    }

    @Override
    public String toXML() {
        return null;
    }

    @Override
    public String toJSON() {
        return null;
    }

    @Override
    public String toConsole() {
        return null;
    }
}
