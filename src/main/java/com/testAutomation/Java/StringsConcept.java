package com.testAutomation.Java;

import org.openqa.selenium.json.JsonOutput;

public class StringsConcept {

    //String is a class in Java
    //String is a non primitive data type
    //String means sequence of characters


    public static void main(String[] args) {

//        String s1="Hello"; //String constant pool
//
//        String s3="Hello";
//
//        String s2=new String("Hello"); //Java heap memory
//
//        String s4=new String("World");
//
//        System.out.println(s1==s2);//false
//        System.out.println(s1==s3);//true
//
//        int len=s1.length();
//
//        System.out.println(len);
//
//        int[] array={10,20,30};
//
//        int len2=array.length;
//
//        System.out.println(len2);

        String name ="Tharun Praveen";

        String name1="Praveen";

        System.out.println(name.equals(name1));

        System.out.println(name.contains(name1));

        String name3=" Lakshman ";
        char ch[]={'L','a','k'};
        System.out.println(name3);
        System.out.println(name3.trim());
        System.out.println(name3.equalsIgnoreCase(name1));
        System.out.println(name3);
        System.out.println(name.startsWith("Tharun"));
        System.out.println(name.endsWith("Praveen"));

        String expression ="tharun,Praveen,Nikhil,Lakshman,Ram,varun";

        String amount = "$100";

        String users[]=expression.split("\\,");

        System.out.println(users[0]);
        System.out.println(users[1]);

        System.out.println(users[2]);
        System.out.println(users[3]);

        String amount2 =amount.replace("$","");
        System.out.println(amount2);

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.toCharArray());

        String person ="Varun Tej";

        System.out.println("************");
        System.out.println(person.indexOf('s'));

        System.out.println("************");
        System.out.println(person.charAt(4));

        String statement = "I love my India ";

        System.out.println(statement.substring(5));

        System.out.println(statement.substring(5 ,9));

    }
}
