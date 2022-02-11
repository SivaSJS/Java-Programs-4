package com.company;

import java.util.Scanner;

public class CalculatePowerRecursion64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Base Number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the exponent number: ");
        int b = scanner.nextInt();
         // 2 * 3 =    2  * 2* 2 => 8
        int c = power(a, b);
        System.out.println(c);

    }

    public static int power(int base , int exponent) {
        if (exponent == 0){
            return 1;
        }else {
            return base * power(base , exponent - 1);

        }
    }
}
