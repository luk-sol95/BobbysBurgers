package com.soltys;

public class DeluxeBurger extends Hamburger{

    public DeluxeBurger(double price, String customerName, String breadRollType, String meat) {
        super(price, customerName, breadRollType, meat);
        super.addAddition("Drink", 3.50);
        super.addAddition("French Fries", 3);
    }

    @Override
    public boolean addAddition(String name, double price) {
        System.out.println("Cannot add more to Deluxe Burger");
        return false;
    }
}
