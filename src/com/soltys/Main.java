package com.soltys;

public class Main {

    public static void main(String[] args) {
//        Hamburger tomBurger = new Hamburger(5.35, "Tom", "White Roll", "Turkey");
//        tomBurger.addAddition("Lettuce", 0.55);
//        tomBurger.addAddition("Bacon", 1.25);
//        tomBurger.addAddition("Pickle", 0.84);
//        tomBurger.addAddition("Human Flesh", 9.99);
//        tomBurger.addAddition("Avocado", 0.48);
//        tomBurger.addAddition("asder", 2);
//        tomBurger.printDetails();

//        HealthyBurger jerryBurger = new HealthyBurger(6, "Jerry", "Falafel");
//        jerryBurger.addAddition("Lettuce", 0.75);
//        jerryBurger.addAddition("Bacon", 1.30);
//        jerryBurger.addAddition("Pickle", 0.84);
//        jerryBurger.addAddition("Human Flesh", 9.99);
//        jerryBurger.addAddition("Avocado", 0.48);
//        jerryBurger.addAddition("Carrot", 0.44);
//        jerryBurger.addAddition("Chocolate", 0.68);
//        jerryBurger.printDetails();

        DeluxeBurger soltysBurger = new DeluxeBurger(7.0, "Soltys", "WhiteSupreme", "Human Flesh");
        soltysBurger.addAddition("Bacon", 0.41);
        soltysBurger.printDetails();
    }
}
