package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n > 0) {
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }

            if (n % 2 == 0) {
                for (int i = nums.length-1; i >= 0 ; i--) {
                    System.out.println(nums[i]);
                }
            } else {
                for (int i = 0; i < nums.length; i++) {
                    System.out.println(nums[i]);
                }
            }

        }
    }
}
