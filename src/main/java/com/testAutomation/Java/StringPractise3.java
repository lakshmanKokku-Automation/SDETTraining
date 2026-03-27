package com.testAutomation.Java;

public class StringPractise3 {

    public static void main(String[] args) {

        String s1="tarunn";

        char[] c1=s1.toCharArray();

        for(int i=0;i<c1.length;i++){
            int count =0;

            for(int j=0;j<c1.length;j++){

                if(c1[i]==c1[j]){

                    count ++;

                }

            }
            System.out.println(c1[i]+" "+count);
        }

    }



}
