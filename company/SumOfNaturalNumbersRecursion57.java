package com.company;

public class SumOfNaturalNumbersRecursion57 {
    public static void main(String[] args) {
        int a = 20;
        int sum = SumNatural(a);
        System.out.println("Sum of Natural Numbers  " + sum);
    }

     static int SumNatural(int num) {
        if (num != 0)
            return num + SumNatural(num - 1);
        else
            return num;
    }
}
