/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inherit;

/**
 *
 * @author Micro Soft
 */
public class Cylinder extends Circle {
    private int height;

    public Cylinder(double radius, int height) {
        super(radius);
        this.height = height;
    }

    public double areaCylinder() {
        return 2 * areaCircle() + (2 * Math.PI * getRadius() * height);
    }
}