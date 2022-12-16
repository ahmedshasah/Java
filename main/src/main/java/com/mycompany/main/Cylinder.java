package com.mycompany.main;

public class Cylinder extends Circle {
 protected double height;
    public Cylinder (){}
    public Cylinder (double radius,String color , double height){
        super(radius,color);
        this.height=height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
       
        return Math.PI*this.radis*this.radis*this.height;
    }
     @Override
    public String toString() {
        return "{" + "height= " + height + ", radis=" + radis + ", color= " + color + ", The volume= " +getVolume() + '}';
    }
}

