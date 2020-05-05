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




    }
}
