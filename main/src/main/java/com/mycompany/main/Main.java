package com.mycompany.main;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
      Circle circle=new Circle();
      Cylinder cyl=new Cylinder();
      
      //circle
      System.out.println("enter radius of circle");
      double r=in.nextDouble();
      circle.setRadis(r);
      System.out.println("enter color of circle");
      String color=in.next();
      circle.setColor(color);
      System.out.println("the color of circle is :" + circle.getColor());
      System.out.println("the area of circle is :" + circle.getArea());
      
      
      
      //Cylinder
      System.out.println("enter radius of Cylinder");
      double x=in.nextDouble();
      cyl.setRadis(x);
      System.out.println("enter the height of Cylinder");
      double h=in.nextDouble();
      cyl.setHeight(h);
      System.out.println("enter color of Cylinder");
      String Ccolor=in.next();
      cyl.setColor(Ccolor);
      System.out.println("the color of circle is :" + cyl.getColor());
      System.out.println("the volume of circle is :" + cyl.getVolume());
        System.out.println("--------------------------------------------------");
      System.out.println("the Circle is " + circle.toString() );
      System.out.println("the cylinder is " +cyl.toString());

    }
}
