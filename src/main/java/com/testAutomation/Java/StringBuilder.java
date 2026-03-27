package com.testAutomation.Java;

public class StringBuilder {

    public static void main(String[] args) {
        String s1="Hello";
         String s2=s1+" World";
       // System.out.println(s1==s2);

        //String Buffer and String Builder mutable whereas string are Immutable

        //String buffer are used in multi threading

        //String builder are used for single thread

        String s3= "I am Java";

        String s4= " developer";

       StringBuffer sb=new StringBuffer(s3);
       System.out.println(sb.append(s4));
       System.out.println(sb.reverse());



    }


}
