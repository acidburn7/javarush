package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int weight = 20;
        int height = 10;
        int i = 0, j = 0;

        while (i < height) {
            while (j < weight) {
                if (i == 0 || i == height-1 || j == 0 || j == weight-1) {
                    System.out.print("Б");
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            i++;
            j = 0;
        }
    }
}