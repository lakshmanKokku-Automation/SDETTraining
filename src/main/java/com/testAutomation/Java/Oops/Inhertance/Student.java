package com.testAutomation.Java.Oops.Inhertance;

public class Student extends Teacher{

    public Student(){
        super(20);
        System.out.println("I am child class constructor ");

    }

    public Student(int salary){
        super(20);
        System.out.println("I am child class constructor ");

    }

    public static void main(String[] args) {
        Student st1=new Student();
    }
}
