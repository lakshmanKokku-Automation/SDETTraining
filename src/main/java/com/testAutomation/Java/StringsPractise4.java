package com.testAutomation.Java;

public class StringsPractise4 {

    public static void main(String[] args) {
        String name1="Lakshman";
        String name2="Kokku";
        String output="";
        output=name2+","+name1.toUpperCase().charAt(0);
        System.out.println(output);

        String resume="resume.pdf";

        String[] rs=resume.split("\\.");
        System.out.println(rs[1]);


        String program ="Java is super keka easy and awesome";

        String str1[]=program.split(" ");

        var a=10;

        var b="Banswdada";
        System.out.println(b);
        System.out.println(a);

        for(int i=1;i<str1.length;i++){

             if(i%2==0){

                 System.out.println(str1[i]);

             }


        }

    }
}
