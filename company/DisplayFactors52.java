package com.company;

import java.util.Scanner;

public class DisplayFactors52 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int a = scanner.nextInt();
        if (a > 0) {
            for (int i = 1; i <= a; i++) {
                if (a % i == 0) {
                    System.out.print(i + " ");
                }
            }

        } else {
            System.out.println("You've Entered the Negative Number, Enter again ");
        }

    }
}
