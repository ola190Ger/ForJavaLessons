//HW6_Hereliuk Olha
// class Circle for tests

public class Circle {
    private double R;

    public Circle() {
    }

    public Circle(double r) {
        R = r;
    }

    public double getR() {
        return R;
    }

    public void setR(double r) {
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
                "R= " + R +
                '}';
    }
}
