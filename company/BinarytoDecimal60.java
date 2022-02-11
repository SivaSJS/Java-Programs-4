package com.company;

public class BinarytoDecimal60 {
    public static void main(String[] args) {
        //binary to decimal

        String binary="1001";
        int decimal= Integer.parseInt(binary,2);
        System.out.println(decimal);

        //decimal to binary
        System.out.println(Integer.toBinaryString(763));
    }
}
