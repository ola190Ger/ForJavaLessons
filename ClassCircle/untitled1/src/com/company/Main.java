package com.company;

public class Main {

    public static void main(String[] args) {

        Circle myCircle= new Circle(10);

        System.out.println("диаметр D= "+myCircle.getDiameter());
        System.out.println("длина окружности C= "+myCircle.getCircumference());
        System.out.println("длина хорды Lch= "+myCircle.getChordLength(1));
        System.out.println("длина дуги La= "+myCircle.getArcLength(1));
        System.out.println("площадь сегмента Sseg= "+myCircle.getSegmentArea(1));
        System.out.println("высота сегмента Hseg= "+myCircle.getSegmentHeight(1));

        System.out.println(myCircle.toXML());
        System.out.println(myCircle.toJSON());
        System.out.println(myCircle.toConsole());

        Round myRound = new Round(12);
        System.out.println(myRound.getSquare());
        System.out.println(myRound.toXML());

        //05.05.2020
//
//        int length = 7;
//        int widths = 8;
//        int area = length * widths;
//        System.out.println(area);
//
//        //-  oop   ------
//
//        Rectangle myGarden = new Rectangle(7, 8);
//        myGarden.setLength(10);
//
//        System.out.println(myGarden.toString());
//        System.out.println(myGarden.getArea());
//
//        Rectangle hisGarden = new Rectangle();
//        hisGarden.setLength(8);
//        hisGarden.setWidths(10);
//
//        System.out.println(hisGarden.equals(myGarden));
//        System.out.println(myGarden.hashCode());

//            Triangle first = new Triangle(2,2,4);
//            Triangle second = TriangleFactory.create(10,2,16);

        // 12.05.2020

        IGeometry triangle1= AbstractFactory.create(2,3,ShapeType.Triangle);


    }
}
