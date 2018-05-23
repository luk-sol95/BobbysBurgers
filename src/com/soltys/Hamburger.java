package com.soltys;

public class Hamburger {
    private double basePrice;
    private String customerName;
    private String breadRollType;
    private String meat;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;


    public Hamburger(double price, String customerName, String breadRollType, String meat) {
        this.basePrice = price;
        this.customerName = customerName;
        this.breadRollType = breadRollType;
        this.meat = meat;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public String getAddition1Name() {
        return addition1Name;
    }

    public String getAddition2Name() {
        return addition2Name;
    }

    public String getAddition3Name() {
        return addition3Name;
    }

    public String getAddition4Name() {
        return addition4Name;
    }

    public double getAddition1Price() {
        return addition1Price;
    }

    public double getAddition2Price() {
        return addition2Price;
    }

    public double getAddition3Price() {
        return addition3Price;
    }

    public double getAddition4Price() {
        return addition4Price;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public boolean addAddition (String name, double price) {
        if(addition1Name == null) {
            addition1Name = name;
            addition1Price = price;
            System.out.println("Addition 1 added: " + name + " " + price);
            return true;
        } else if (addition2Name == null) {
            addition2Name = name;
            addition2Price = price;
            System.out.println("Addition 2 added: " + name + " " + price);
            return true;
        } else if (addition3Name == null) {
            addition3Name = name;
            addition3Price = price;
            System.out.println("Addition 3 added: " + name + " " + price);
            return true;
        } else if (addition4Name == null) {
            addition4Name = name;
            addition4Price = price;
            System.out.println("Addition 4 added: " + name + " " + price);
            return true;
        } else {
            return false;
        }
    }

    public double calculatePrice () {
        return addition4Price + addition3Price + addition2Price + addition1Price + basePrice;
    }

    public void printDetails () {
        System.out.println("Burger for " + customerName + " is made on " + breadRollType + " with " + meat + " and base price is " + basePrice + ". Additions inside burger: \n" +
         addition1Name + " for " + addition1Price +  "\n" + addition2Name + " for " + addition2Price + "\n" + addition3Name + " for " + addition3Price + "\n" + addition4Name + " for " + addition4Price + "\nTotal price is: " + calculatePrice());
    }
}
