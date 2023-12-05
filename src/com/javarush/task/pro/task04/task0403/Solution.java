package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        int result = 0;

        while(true) {
            answer = scanner.nextLine();

            if (!answer.equals("ENTER")) {
                result += Integer.parseInt(answer);
            } else {
                break;
            }
        }
        System.out.println(result);

    }
}