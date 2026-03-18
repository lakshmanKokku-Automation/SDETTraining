package com.testAutomation.Java;

public class PrimeNumbersVerification {

    static boolean flag = true;

    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {

            isPrime(i);
        }
    }


    public static void isPrime(int num) {

        int count = 0;

        for (int i = 2; i < num; i++) {

            if (num == 2) {

                flag = false;
                System.out.println(num);

            } else {

                if (num % i == 0) {
                    count++;

                }

            }

        }
        if (count == 0) {

            System.out.print(num +" ");

        }
    }
}

