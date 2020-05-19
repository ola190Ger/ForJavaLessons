package com.company;

public class Rectangle implements ICreate{
    private int length;
    private int widths;

    public Rectangle() {
    }

    public Rectangle(int length, int widths) {
        this.length = length;
        this.widths = widths;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidths() {
        return widths;
    }

    public void setWidths(int widths) {
        this.widths = widths;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", widths=" + widths +
                '}';
    }

    @Override
    public double getArea() {
        return getLength()*getWidths();
    }
}
