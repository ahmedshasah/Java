/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strinng;

/**
 *
 * @author facebook
 */
import java.util.Scanner;
public class Strinng {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        String str;
        System.out.println ("Enter the line");
        str = input.nextLine();
        for (int i=0 ; i<= str.length();i++)
        {
            char co = str.charAt(i);
            if (co == ',')
                System.out.println (str.replaceAll(","," "));
        }
                        System.out.println (str);

        
    }
    
}
