/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgclass;
public class triangle {
    private double a;
    private double b;
    private double c;
    public void seta(double x)
    {
        a = x;
    }
    public void setb(double y)
    {
        b = y;
    }
    public void setc(double z)
    {
        c = z;
    }
    public double getCircum()
    {
        
        return a+b+c ;
    }
    public double getarea()
    {
        double r=((getCircum())/2);
        double aa=Math.sqrt(r*(Math.abs(r-a))*(Math.abs(r-b))*(Math.abs(r-c)));
        return aa ;
    }
     
}
