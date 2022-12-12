/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgclass;

public class circle {
     private double raduis;
    public void setraduis(double r)
    {
       raduis=r; 
    }
    public double getraduis()
    {
        return raduis;
    }
    public double getarea()
    {
        return 3.14*raduis*raduis;
    }
    public double getCircum()
    {
        return 2*3.14*raduis;
    }
    
}

