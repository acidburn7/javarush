package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        multiArray = new int[n][];

        for (int i = 0; i < n; i++) {
            int dimension = scanner.nextInt();
            multiArray[i] = new int[dimension];
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print(multiArray[i][j]);
            }
            System.out.println();
        }
    }
}
