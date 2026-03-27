package com.testAutomation.Java;

public class ReverseSentence {

    public static void main(String[] args) {

        String s1="India is my country";

        String[] s2= s1.split(" ");

        String reverse="";

        //for(datatype variable:collection)
        for(String s3:s2){

            //System.out.println("****"+s3.length());

            for(int i=s3.length()-1;i>=0;i--){

                reverse +=s3.charAt(i);

            }

            reverse+=" ";

        }
        System.out.println(reverse);

    }
}
