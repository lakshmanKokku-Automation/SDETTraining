package com.testAutomation.Java;

public class TernaryOperator {

    public static void main(String[] args) {

        //Ternary operator
        int a=15;
        int b=12;
        int max=(a>b)?a:b;

        int c=20;
        int d=25;

        int max2=(c>d)?c:d;

        int finalMax=(max>max2)?max:max2;

        System.out.println(finalMax);
    }
}
