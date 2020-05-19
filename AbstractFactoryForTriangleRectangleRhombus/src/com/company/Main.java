package com.company;

import java.util.ArrayList;
import java.util.List;

import static com.company.Shape.TRIANGLE;

public class Main {

    public static void main(String[] args) {
        /* write your code here */
    ICreate shape1 = AbstractFactory.create(3,2, TRIANGLE);
    ICreate shape2 = AbstractFactory.create(4,5,Shape.RECTANGLE);
    ICreate shape3 = AbstractFactory.create(3,5,Shape.RHOMBUS);

        List<ICreate> shapes = new ArrayList<>();

        shapes.add(shape1);
        shapes.add(shape2);
        shapes.add(shape3);
        for (ICreate item:shapes) {
            System.out.println(item.toString());
            System.out.println("his area: " + item.getArea()+"\n");
        }
    }
}
