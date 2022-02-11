package com.company;

import java.util.Scanner;

public class PrimeNumbersbetweenIntervals54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first Number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the Second Number: ");
        int b = scanner.nextInt();


        for (int i = a; i <= b; i++){
             //  i = 12; 11 < 20;

            int count = 0;
            for (int j = 1; j <= i; j++){
                // j = 11;  11 <= 11
                if(i % j == 0){
                    // 11 % 11 == 0
                    count = count + 1;
                    // count = 1;
                }
            }  if( count == 2){
                System.out.println("i =  " + i);
            }

        }




    }
}
