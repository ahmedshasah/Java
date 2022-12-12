/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.inherit;


public class Inherit {

    public static void main(String[] args) {
        Circle obj = new Circle(4);
        System.out.println("The area of Circle " + obj.areaCircle());

        Cylinder obj2 = new Cylinder(4, 5);
        System.out.println("The area of Cylinder " + obj2.areaCylinder());
    }
}   

