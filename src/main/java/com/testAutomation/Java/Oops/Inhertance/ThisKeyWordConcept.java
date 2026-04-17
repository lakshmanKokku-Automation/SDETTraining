package com.testAutomation.Java.Oops.Inhertance;

public class ThisKeyWordConcept {

    String name; //class level
    int age; //class level /Instance level

    public ThisKeyWordConcept(String name ,int age){
         this.name=name;
         this.age=age;
        System.out.println(name);
        System.out.println(age);

    }

    public static void main(String[] args) {
        ThisKeyWordConcept tw=new ThisKeyWordConcept("Lakshman",31);
        ThisKeyWordConcept tw1=new ThisKeyWordConcept("Praveen",35);
    }

}


