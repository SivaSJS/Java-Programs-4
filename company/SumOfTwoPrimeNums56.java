package com.company;

import java.util.*;

public class SumOfTwoPrimeNums56 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        boolean check = false;
        for (int i = 2; i <= number / 2; ++i) {
            if (sumOfPrimes(i)) {
                if (sumOfPrimes(number - i)) {
                    System.out.printf("%d can be expressed as the sum of %d and %d\n", number, i, number - i);
                    check = true;
                }
            }
        }
        if (!check)
                    System.out.println(number + " cannot be expressed as the sum of two prime numbers.");
            }

            static boolean sumOfPrimes(int num) {
                boolean isPrime = true;

                for (int i = 2; i <= num / 2; ++i) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                return isPrime;
            }
        }