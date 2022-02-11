package com.company;

import java.util.Scanner;

public class GCDusingRecursion59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first num : ");
        int a = scanner.nextInt();
        System.out.print("Enter the Second num : ");
        int b = scanner.nextInt();


        int c = gcd(a,b);
        System.out.println(c);
    }


    public static int gcd(int a , int b) {
        if(a%b == 0){
            return b;
        }else {
            return gcd(b , a%b);
        }
    }
}
