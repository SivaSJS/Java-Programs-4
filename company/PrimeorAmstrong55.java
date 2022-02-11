package com.company;



import java.util.*;

public class PrimeorAmstrong55 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number check whether it is Prime or Armstrong number : ");

        int input = scanner.nextInt();
        if (prime(input) && isAmstrong(input))
            System.out.println( " Entered numbers are both Prime and Armstrong Number");
        else if (prime(input))
            System.out.println( " Entered number is Prime Number");
        else if (isAmstrong(input))
            System.out.println( " Entered number is Armstrong Number");
        else
            System.out.println(" Entered numbers are not Prime or Armstrong Number");
    }
    static boolean prime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    static boolean isAmstrong(int n) {
        int a = n, r, sum = 0;
        while (n > 0) {
            r = n % 10;
            sum = sum + (r * r * r);
            n = n / 10;
        }
        if (a == sum) return true;
        return false;
    }

}
