package com.example;

public class Car {
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;
    public Car(){
        tyres=4;
        doors=4;
        
    }
    public void displayCharacterstics(){
        System.out.println("Car color:" + color);
        System.out.println("Transmission:" + transmission);
        System.out.println("Make:" + make);
        System.out.println("Number of tyres:" + tyres);
        System.out.println("Number of doors:" + doors);

    }
    public void accelerate(){
        System.out.println("Car is moving");
    }
    public void brake(){
        System.out.println("car has stopped");
    }
    
}

