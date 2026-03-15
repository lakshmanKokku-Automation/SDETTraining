package com.testAutomation.Java;

public class PrimeNumbersVerification {

    static boolean flag = true;

    public static void main(String[] args) {


        for (int i = 2; i <= 100; i++) {

            if (isPrime(i)) {

                System.out.println(i);

            }

        }
    }


    public static boolean isPrime(int num) {


        for (int i = 2; i < num; i++) {

            if (num % i == 0) {

                flag = false;

            }


        }

        return flag;
    }


}

