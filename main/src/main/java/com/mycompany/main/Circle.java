package com.mycompany.main;


public class Circle {
 protected double radis;
    protected String color;
    
    public Circle (){}
    public Circle (double radius ,String color ){
        this.radis=radius;
        this.color=color;
    }

    public double getRadis() {
        return radis;
    }

    public void setRadis(double radis) {
        this.radis = radis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public double getArea(){
        return this.radis*this.radis*Math.PI;
    }

    @Override
    public String toString() {
        return "{" + "radis=" + radis + ", color=" + color + ", The area = "+ getArea() + '}';
    }
    
}
