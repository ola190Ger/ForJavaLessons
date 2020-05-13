package com.company;


import java.util.Objects;

public class Rectangle implements IGeometry,IInfo {
    private int length;
    private int widths;

    public Rectangle(){

    }
    public int getLength() {
        return length;
    }

    public int getWidths() {
        return widths;
    }

    public void setWidths(int widths) {
        this.widths = widths;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Rectangle(int length, int widths){
        this.length=length;
        this.widths=widths;
    }


/*
    @Override
    public float getArea() {
        return this.getLength()*this.getWidths();
    }

    @Override
    public int getPerimeter() {
        return 2*(this.getLength()+this.getWidths());
    }
*/

    @Override
    public double getAllLengths() {
        return 2*(this.getLength()+this.getWidths());
    }

    @Override
    public double getSquare() {
        return this.getLength()*this.getWidths();
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
