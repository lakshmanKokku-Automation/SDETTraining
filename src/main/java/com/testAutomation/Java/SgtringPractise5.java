package com.testAutomation.Java;

public class SgtringPractise5 {

    public static void main(String[] args) {
        String name="Tarun Teja";
        //
        String[] str1=name.split(" ");
        String str2="";
//        for(int i=0;i<str1[1].length();i++){
//
//            if(i==0){
//
//                str2 =str2+str1[1].toUpperCase().charAt(i);
//
//            }else {
//                str2 = str2 + str1[1].charAt(i);
//            }
//
//        }
       // System.out.println(str2+","+str1[0].charAt(0));
        System.out.println(str1[1]+" ,"+str1[0].charAt(0));
       // System.out.println(str1[1].toUpperCase().charAt(0)+","+str1[0].charAt(0));
    }

}
