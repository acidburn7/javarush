package com.javarush.task.pro.task04.task0404;

/* 
Заполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int height = 5;
        int wide = 10;
        int i = 0, j = 0;

        while(i < height) {
            while(j < wide) {
                System.out.print("Q");
                j++;
            }
            System.out.println();
            i++;
            j = 0;
        }
    }
}