package com.company;

import java.util.Scanner;

public class ReverseaSentence63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();
       //java
        String val = reverse(str);

        System.out.println(val);

    }
// recursion
    public static String reverse(String str) {
        if(str.isEmpty()){
            return str;
        }else{
            return reverse(str.substring(1)) + str.charAt(0);
            // java =>   avaj
        }
    }
}
