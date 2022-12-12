/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nbr;

/**
 *
 * @author facebook
 */
import java.util.Scanner;

public class Nbr {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner input = new Scanner (System.in);
          int n , r, NCR,NBR;
          int f=1; // factorial n
          int f2=1; // factorial r
          int f3=1; //factorial (n-r)
          n=input.nextInt();
          r=input.nextInt();
          
          for (int i =n ; i>=2;i--)
          {
              f *=i;
          }
          for (int j=r; j>=2; j--)
          {
              f2 *=j;
          }
          for (int w =(n-r);w>=2;w--)
          {
              f3 *=w;
          }
          NCR=(f)/((f2)*(f3));
          NBR=(f)/(f3);
System.out.println (NBR);
System.out.println (NCR);




    }
    
}
