package com.soltys;

public class HealthyBurger extends Hamburger {

    private String addition5Name;
    private double addition5Price;

    private String addition6Name;
    private double addition6Price;


    public HealthyBurger(double price, String customerName, String meat) {
        super(price, customerName, "Brown Rye Roll", meat);
    }

    @Override
    public boolean addAddition(String name, double price) {
        if (super.addAddition(name, price)) {
            return true;
        } else if (addition5Name == null) {
            addition5Name = name;
            addition5Price = price;
            return true;
        } else if (addition6Name == null) {
            addition6Name = name;
            addition6Price = price;
            return true;
        } else return false;
    }

    @Override
    public double calculatePrice() {
        return (super.calculatePrice() + addition6Price + addition5Price);
    }

    @Override
    public void printDetails() {
        System.out.println("Burger for " + super.getCustomerName() + " is made on " + super.getBreadRollType() + " with "
                + super.getMeat() + " and base price is " + super.getBasePrice() + ". Additions inside burger: \n" + super.getAddition1Name() + " for " + super.getAddition1Price() + "\n" + super.getAddition2Name() + " for " + super.getAddition2Price() +
                "\n" + super.getAddition3Name() + " for " + super.getAddition3Price() + "\n" + super.getAddition4Name() + " for " + super.getAddition4Price() + "\n" + addition5Name + " for " + addition5Price + "\n" + addition6Name + " for " + addition6Price +
                "\nTotal price is: " + calculatePrice());
    }
}
