/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgclass;

/**
 *
 * @author facebook
 */
import java.util.Scanner;
public class Class {

    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        circle c = new circle();
        System.out.println("enter the radius");
        double r = in.nextDouble();
        c.setraduis(r);
        System.out.println("The area of circle is : " + c.getarea());
        System.out.println("The circumference of circle is : " + c.getCircum());
        
        triangle t = new triangle();
        System.out.println("enter the first rib");
        double rib1=in.nextDouble();
        t.seta(rib1);
        System.out.println("enter the second rib");
        double rib2=in.nextDouble();
        t.setb(rib2);
        System.out.println("enter the third rib");
        double rib3=in.nextDouble();
        t.setc(rib3);
        System.out.println( "The circumference of triangle is : " + t.getCircum());
        System.out.println("The area of triangle is : " + t.getarea());
    }
    
}
