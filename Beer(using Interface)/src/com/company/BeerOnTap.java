package com.company;

public class BeerOnTap implements IBeer{
    private double amount;
    private double price;
    private double taraPrice=0;

    public BeerOnTap() {
    }

    public BeerOnTap(double amount, double price) {
        this.amount = amount;
        this.price = price;
    }

    public BeerOnTap(double amount, double price, double taraPrice) {
        this.amount = amount;
        this.price = price;
        this.taraPrice=taraPrice;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTaraPrice() {
        return taraPrice;
    }

    public void setTaraPrice(double taraPrice) {
        this.taraPrice = taraPrice;
    }

    @Override
    public double toPay() {
        return getAmount()*getPrice()+taraPrice;
    }
}


