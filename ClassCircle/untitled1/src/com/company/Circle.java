package com.company;

import java.util.Objects;

public class Circle implements IGeometry, IInfo{
    private double R;

    public Circle(){    }
    public Circle(int r) {
        R = r;
    }


    public double getR() {
        return R;
    }
    public void setR(int r) {
        R = r;
    }


    public double getDiameter(){//вернуть диаметр
        return 2*getR();
    }

    public double getCircumference(){//вернуть длину окружности
        return 2*Math.PI*getR();
    }

    public double getChordLength(double a){//вернуть длину хорды
        return 2*Math.sin(getArcLength(a)/2/getR())*getR();
    }

    public double getArcLength(double a){//вернуть длину дуги
        return a*getR();
    }

    public double getSegmentArea(double a){//вернуть площадь сегмента
        return (a-Math.sin(a))*getR()*getR()/2;
    }
    public double getSegmentHeight(double a){//вернуть высота сегмента
        return getR()*(1-Math.cos(a/2));
    }

    @Override
    public String toString() {
        return "Circle{" +
                "R=" + R +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.getR(), getR()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getR());
    }


    public String toXML(){
        return "<Circle>"+
                "<radius>" + getR()+  "</radius>"+
                "</Circle>";
    }


    public String toJSON(){
        return  "{"+
                "\"R:\" " + "\""+getR()+"\""+",\n"+
                "}";
    }


    public String toConsole()
    {
        return "Round (R: "+getR()+");";
    }

    @Override
    public double getAllLengths() {
        return getCircumference();
    }

    @Override
    public double getSquare() {
        return 0;
    }
}
