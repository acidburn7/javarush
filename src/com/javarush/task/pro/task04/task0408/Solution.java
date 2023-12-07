package com.javarush.task.pro.task04.task0408;

import java.util.Scanner;

/* 
Максимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int max = 0;
        int number = 0;

        while(scanner.hasNextInt()) {
            number = scanner.nextInt();
            sum += number;
            max = number % 2 == 0 && number > max ? number : max;
        }
        if (max == 0 && ) {
            System.out.println(number);
        } else {
            System.out.println(max);
        }
    }
}