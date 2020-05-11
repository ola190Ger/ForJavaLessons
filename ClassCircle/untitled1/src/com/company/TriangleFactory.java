package com.company;

public class TriangleFactory {

    private float sideA;
    private float sideB;
    private float sideC;

    private TriangleFactory(float sideA, float sideB, float sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public static Triangle create(float a, float b, float c){
        if(a+b>c || a+c>b || c+b>a) return null;

        return new Triangle(a,b,c);
    }

}
