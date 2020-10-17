package com;

import Polymorphism.MoveableClass;
import Polymorphism.OverrideClass;

public class Main {

    public static void main(String[] args) {

    MoveableClass Thing = new MoveableClass();
    Thing.move();
    Thing.move(6,9);


    OverrideClass Thing2 = new OverrideClass();
    Thing2.move();


    }
}
