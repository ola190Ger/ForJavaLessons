package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	//buying beer
        BeerInBotle stella = new BeerInBotle(2,32.3);
        BeerInBotle krushovitce = new BeerInBotle(3, 25.20);
        BeerOnTap twoChernigov = new BeerOnTap(3,14.8);
        BeerOnTap oneChernigov  = new BeerOnTap(1.5,14.8,1.5);
        BeerOnTap halfChernigov = new BeerOnTap(0.5, 14.8, 0.5);

        List<IBeer> basket = new ArrayList<>();
        basket.add(stella);
        basket.add(krushovitce);
        basket.add(twoChernigov);
        basket.add(oneChernigov);
        basket.add(halfChernigov);

        System.out.println(basket.stream().mapToDouble(IBeer::toPay).sum());


        System.out.println("Payment for BeerOnTap: " + basket.stream()
                .filter(beer -> beer instanceof BeerOnTap)
                .mapToDouble(IBeer::toPay).sum());
        System.out.println("Payment for BeerInBottle: " + basket.stream()
                .filter(beer -> beer instanceof BeerInBotle)
                .mapToDouble(IBeer::toPay).sum());

        System.out.println(basket.stream()
                .filter(beer -> beer instanceof BeerOnTap)
                .mapToDouble(IBeer::toPay).sum() > basket.stream()
                .filter(beer -> beer instanceof BeerInBotle)
                .mapToDouble(IBeer::toPay).sum() ? "BeerOnTap is more expensive" : "BeerInBottle is more expensive");




    }
}
