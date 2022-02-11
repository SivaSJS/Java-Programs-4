package com.company;

public class FactorialRecursion58 {

    public static void main(String args[]){
        int a=1;
        int number=4;//It is the number to calculate factorial
        a = factorialRecursion(number);
        System.out.println("Factorial of "+number+" is: "+a);
    }

    static int factorialRecursion(int n){
        if (n == 0)
            return 1;
        else
            return(n * factorialRecursion(n-1));
    }
}
