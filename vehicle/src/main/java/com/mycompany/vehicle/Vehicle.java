package com.mycompany.vehicle;

public class Vehicle {
  protected String make;
    protected String color;
    protected int year;
    protected String model;

    public Vehicle() {
    }
    

    public Vehicle(String make, String color, int year, String model) {
        this.make = make;
        this.color = color;
        this.year = year;
        this.model = model;
    }
    public void printDetails (){
        System.out.println("Manufacture : "+make);
        System.out.println("Color : "+color);
        System.out.println("Year : "+year);
        System.out.println("Model : "+model);
    }
    
}