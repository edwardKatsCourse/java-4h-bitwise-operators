package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 2;
        int b = 1;

        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));

        System.out.println("0" + Integer.toBinaryString(72));
        System.out.println("0000" + Integer.toBinaryString(72 >> 3));

        System.out.println(222 >>> 1); //0000 1000
        System.out.println(Integer.toBinaryString(222 >>> 1));

    }
}
