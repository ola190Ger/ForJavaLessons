package com.company;

public class Round extends Circle {

    public Round() {
    }

    public Round(int r) {
        super(r);
    }

    public double getArea(){
        return Math.PI*getR()*getR();
    }

    public  double getSectorArea(double alpha){
        return alpha*getR()*getR()/2;
    }

    @Override
    public double getSquare() {
        return getArea();
    }

    @Override
    public String toConsole() {
        return super.toConsole();
    }

    @Override
    public String toJSON() {
        return super.toJSON();
    }

    @Override
    public String toXML() {
        return "<Round>"+
                "<radius>" + getR()+  "</radius>"+
                "</Round>";
    }
}
