package com.testAutomation.Java;

public class CharacterSegregation {

    public static void main(String[] args) {


        int upper = 0;
        int lower = 0;
        int digit = 0;
        int special = 0;

        String s1="JavaSelenium@^&(123HELLO";

        s1.strip();

        char[] ch1=s1.toCharArray();

        for(char c: ch1){

            if(Character.isUpperCase(c)){
                upper++;

            }else if(Character.isLowerCase(c)){
                lower++;
            }else if(Character.isDigit(c)){
                digit++;
            } else {
                special++;
            }
        }
        System.out.println("Upper count "+upper);
        System.out.println("Lower count "+lower);
        System.out.println("Digit count "+digit);
        System.out.println("Special character count"+special);
    }
}
