/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.quick;

/**
 *
 * @author Micro        Soft
 */
public class Quick {
    public static void main(String[] args) {
    int a[] = { 13, 18, 27, 2, 19, 25 };
        int n = a.length;
        System.out.println("Befoer sorting ");
        NewClass s1 = new NewClass();
        s1.printArr(a, n);
        s1.quick(a, 0, n - 1);
        System.out.println("After sorting ");
        s1.printArr(a, n);
        System.out.println();
    }
}
