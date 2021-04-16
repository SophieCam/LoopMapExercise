package com.tts;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LoopExercise {

    public static void main(String[] args) {

        Scanner numberList = new Scanner(System.in);
        System.out.println("Input 5 numbers separated by spaces:");

        int numArray[] = new int[5]; //initialized array of size 5
        int sum = 0;
        int mult = 1;
        int max = 0;
        int min = 0;

        for (int i = 0; i < 5; i++) {
            numArray[i] = numberList.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Values are :" + numArray[i]);
        }
        System.out.println(Arrays.toString(numArray));

        //find the sum
        for (int num : numArray) {
            sum = sum + num;
        }
        System.out.println("Sum of array elements is:" + sum);

        //find the product
        for (int num : numArray) {
            mult = mult * num;
        }
        System.out.println("Product of array elements is:" + mult);

        //Find max num and min num

        max = numArray[0];
        for (int num : numArray) {
          if (num > max)
               max = num;
        }
        System.out.println("The max number of your entered numbers is " + max);

        min = numArray[0];
        for (int num : numArray) {
        if (num < min)
            min = num;

        }
         System.out.println("The min number of your entered numbers is " + min);

    }
}
