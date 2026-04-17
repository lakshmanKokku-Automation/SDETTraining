package com.testAutomation.Java;

public class TypeInference {

    int a=10;
    String name="Lakshman";
    double d=5.8;

    //After Java 10 psvm
    //Type ineference works only local scope
    //It cannot be at class level or instance level

    //var has to be declared and intailized at the same time

    //var cannot be used as a method paarameter

    public static void main(String[] args) {

        var b=100;
        var name2="Praveen";
        var height=10.12;
        System.out.println(b);
        System.out.println(name2);
        System.out.println(height);

        var array1=new int[5];



    }

//    public void sum(var a, var b){
//
//
//    }



}
