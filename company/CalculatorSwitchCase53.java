package com.company;

import java.util.Scanner;

public class CalculatorSwitchCase53 {
    public static void main(String[] args) {


        int sum;
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter the value of num1: ");
       int  num1=scanner.nextInt();
        System.out.print("Enter the value of num2: ");
       int num2=scanner.nextInt();

        System.out.print("Enter the Character:  + , - , *, / , % ");
       char operator=scanner.next().charAt(0);


        switch (operator) {
            case '+':
                sum = num1 + num2;
                System.out.println(" num1 " + '+' + " num2 " + " = " + sum);
                break;

            case '-':
                sum = num1 - num2;
                System.out.println(" num1 " + '-' + " num2 " + " = " + sum);
                break;

            case '*':
                sum = num1 * num2;
                System.out.println(" num1 " + '*' + " num2 " + " = " + sum);
                break;

            case '/':
                sum = num1 / num2;
                System.out.println(" num1 " + '/' + " num2 " + " = " + sum);
                break;

            default:
                System.out.println("invalid operator! ");

        }
    }
}
