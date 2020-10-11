package com;

public class Main {

    public static void main(String[] args) {

        Truck truck = new Truck();
        truck.setNumWheels(8);
        truck.setSpeed(60.5f);
        truck.drive();

        System.out.println(truck.getNumWheels());
        System.out.println(truck.getSpeed());

        Suitcase suitcase = new Suitcase(7);
        suitcase.addItem();
        suitcase.addItem();
        suitcase.addItem();
        suitcase.removeItem();
        suitcase.removeItem();

    }




}
