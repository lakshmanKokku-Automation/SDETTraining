package com.testAutomation.Java;

public class PatternPrograms {

    /*

    00
    01
    0203
    10
    11
    12
    13

    *
    **
    ***
    *****
     */

    /*
    *******
    *****
    ***
    *

    *
    *
    *
    *
    *

     */


    public static void main(String[] args) {

        String tag="India is my country";

        String[] tag1=tag.split(" ");

        String rev;

//        for(String val:tag1){
//
//            for(int i=val.length();i>=0;i--){
//
//              rev =rev+val.charAt(i);
//            }
//
//
//        }

        for(int i=1;i<=5;i++) {

            for (int j = 0; j <=i; j++) {

                System.out.print("*");

            }
            System.out.println();
        }
    }
}
