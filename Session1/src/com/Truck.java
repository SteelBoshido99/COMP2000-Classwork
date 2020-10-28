package com;

public class Truck {

    private int numWheels;
    private float speed;

    void drive(){
        System.out.println("Driving car with " + numWheels + " wheels");
        calculateSpeed();
    }

    private void calculateSpeed(){
        System.out.println("Moving at " + speed + " speed");
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public int getNumWheels(){
        return numWheels;
    }

    public void setSpeed(float speedPram){
        this.speed = speedPram;
    }

    public float getSpeed(){
        return  speed;
    }



}
