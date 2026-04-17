package com.testAutomation.Java.Oops;

public class ConstructorConept2 {

    public ConstructorConept2(){
        System.out.println("default constructor");
    }
    public ConstructorConept2(int a){
        this(20,30);
        System.out.println("default constructor with one input ");
    }
    public ConstructorConept2(int a,int b){
        System.out.println("default constructor with two inputs");
    }


    public static void main(String[] args) {

        ConstructorConept2 cc=new ConstructorConept2();
        ConstructorConept2 cc2=new ConstructorConept2(10);
        ConstructorConept2 cc3=new ConstructorConept2(10,20);


    }
}
