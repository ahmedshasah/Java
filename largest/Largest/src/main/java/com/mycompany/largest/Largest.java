/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.largest;

import java.util.Arrays;
import java.util.Scanner;


public class Largest {
       static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the size of array ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        takeInput(array);
        findLargestNum(array);
    }

    private static void takeInput(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the array's numbers");
            array[i] = scanner.nextInt();
        }
    }

    private static void findLargestNum(int[] array) {
        Arrays.sort(array);
        System.out.println("the largest number is : "+ array[array.length - 1]);
    }
}
