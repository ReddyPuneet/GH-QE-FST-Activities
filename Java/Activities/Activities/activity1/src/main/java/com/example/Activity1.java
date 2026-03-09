package com.example;

public class Activity1 {
    public static void main(String[] args){
        Car car1 = new Car();
        car1.color="red";
        car1.transmission="Automatic";
        car1.make=2023;
        car1.tyres=4;
        car1.doors=6;
        


        car1.displayCharacterstics();
        car1.accelerate();
        car1.brake();
    }
    
    
}
