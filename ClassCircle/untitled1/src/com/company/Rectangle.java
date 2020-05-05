package com.company;


import java.util.Objects;

public class Rectangle {
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

    public Rectangle(int _length, int _widths){
        this.length=_length;
        this.widths=_widths;
    }

    public int getArea(){
        return this.getLength()*this.getWidths();
    }

    public int getPerimeter(){
        return 2*(this.getLength()+this.getWidths());
    }

    @Override
    public String toString(){
        return "Rectangle {"+length+","+widths+"}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) o;
        return getLength() == rectangle.getLength() &&
                getWidths() == rectangle.getWidths();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLength(), getWidths());
    }
}
