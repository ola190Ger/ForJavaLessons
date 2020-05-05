package com.company;

import java.util.Objects;

public class Circle {
    private double R;

    public Circle(){

    }
    public double getR() {
        return R;
    }

    public void setR(int r) {
        R = r;
    }

    public Circle(int r) {
        R = r;
    }

    public double getDiameter(){//вернуть диаметр
        return 2*R;
    }

    public double getCircumference(){//вернуть длину окружности
        return 2*3.14*R;
    }

    public double getChordLength(double a){//вернуть длину хорды
        return 2*Math.sin(getArcLength(a)/2/R)*R;
    }
     public double getArcLength(double a){//вернуть длину дуги
        return a*R;
     }
     public double getSegmentArea(double a){//вернуть площадь сегмента
        return (a-Math.sin(a))*R*R/2;
     }
    public double getSegmentHeight(double a){//вернуть высота сегмента
        return R*(1-Math.cos(a/2));
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
}
