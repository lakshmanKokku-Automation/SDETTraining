package com.testAutomation.Java;

public class CharacterCounter {

    public static void main(String[] args) {

        //give the count of each categroy of characters
        //uper =5;
        //lower=7;
        //specual=8;

        int upper=0;
        int lower=0;
        int digit=0;
        int special=0;

        String text="JavaSelenium&123@#$HELLO";

        char[] charArray=text.toCharArray();

        for(char c:charArray){

            if(Character.isUpperCase(c)){

                upper++;
            }else if
                (Character.isLowerCase(c)) {

                lower++;

            }else if (Character.isDigit(c)){

                digit++;

        }else{
                special++;
            }

        }

        System.out.println("upper" +upper);
        System.out.println("lowrer" +lower);
        System.out.println("upper" +digit);
        System.out.println("upper" +upper);
    }
}
