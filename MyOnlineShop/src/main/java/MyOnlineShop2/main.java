package MyOnlineShop2;

import java.util.Scanner;


public class main {
    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //books
        product b1[]=new book[2];
        b1[0]=new book(15.50,"book1");
        b1[1]=new book(25.25,"book2");
        //childrenbook
        product b2[]=new childrenbook[2];
        b2[0]=new childrenbook(25,"i am kind");
        b2[1]=new childrenbook(30.50,"read and play",.10);
        //cartoon
        product b3[]=new cartoon[2];
        b3[0]=new cartoon(15,"Spider man");
        b3[1]=new cartoon(45,"Batman",.20);
        
        
        System.out.println("how many book do you need");
        int x =in.nextInt();
        System.out.println("what is name of book,childrenbook or cartoon do you need");      
        String name = in.next();
        if(null == name){
            System.out.println("It doesn't exist");
        }
        else //books
        switch (name) {
            case "book1" -> {
                System.out.println("the name of the book is : "+(b1[0].getName()));
                System.out.println("the total price is : "+(b1[0].BPrice()*x));
                System.out.println(b1[0].toString());
            }
            case "book2" -> {
                System.out.println("the name of the book is : "+(b1[1].getName()));
                System.out.println("the total price is : "+(b1[1].BPrice()*x));
                System.out.println(b1[1].toString());
            }
            case "Iamkind" -> {
                System.out.println("the name of the book is : "+(b2[0].getName()));
                System.out.println("the total price is : "+(b2[0].BPrice()*x));
                System.out.println(b2[0].toString());
            }
            case "readandplay" -> {
                System.out.println("the name of the book is : "+(b2[1].getName()));
                System.out.println("the total price is : "+(b2[1].BPrice()*x));
                System.out.println(b2[1].toString());
            }
            case "spiderman" -> {
                System.out.println("the name of the book is : "+(b3[0].getName()));
                System.out.println("the total price is : "+(b3[0].BPrice()));
                System.out.println(b3[0].toString());
            }
            case "batman" -> {
                System.out.println("the name of the book is : "+(b3[1].getName()));
                System.out.println("the total price is : "+(b3[1].BPrice()*x));
                System.out.println(b3[1].toString());
            }
            default -> System.out.println("It doesn't exist");
        }
    }
    
}
