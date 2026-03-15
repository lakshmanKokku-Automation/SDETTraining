package com.testAutomation.Java;

public class PrimeFinder {
    public static void main(String[] args) {

        int limit = 50;

        for (int num = 2; num <= limit; num++) {
            boolean isPrime = true;

            // Check divisors from 2 up to num-1
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
