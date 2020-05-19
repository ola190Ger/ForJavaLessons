package com.company;

public class BeerInBotle implements IBeer{
    private int amount;
    private double price;

    public BeerInBotle() {
    }

    public BeerInBotle(int amount, double price) {
        this.amount = amount;
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double toPay() {
        return getAmount()*getPrice();
    }
}
