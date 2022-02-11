package com.company;

import java.util.Scanner;

public class AmstBetweenTwoIntervals51 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the Second number: ");
        int b = scanner.nextInt();

        for (int i = a; i <= b; i++){
           int num = i;
             int sum = 0;

            while ( num > 0 ){
               int remainder = num % 10;
                sum = sum + (remainder * remainder * remainder);
                num =  num /10;
            }
            if(sum == i){
                System.out.println(sum);
            }

        }




    }
}
