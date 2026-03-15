package com.testAutomation.Java;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ModulusPractise {

    static boolean flag = true;

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  number");
        int num1= sc.nextInt();
        if(isPrime(num1)){

            System.out.println("This is prime number");
        }else{

            System.out.println("This is not a prime number");
        }

    }

    public static boolean isPrime(int num) {

            for (int i = 2; i < num; i++) {

                if (num % i == 0) {

                    flag = false;

                    break;

                }


            }

        return flag;
    }
}
