package com.mycompany.vehicle;

public class Bus extends Vehicle {
    protected String body;
    
    public Bus(){};

    public Bus(String make, String color, int year, String model,String body) {
        super(make,color,year,model);
        this.body = body;
    }
    public void busDetails(){
        printDetails();
        System.out.println("Body Style : "+body);
    }
    
}
   
