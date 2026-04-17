package com.testAutomation.Java.Oops.Inhertance;

public class SubClass extends Employee{

    public void test(){

        empTask();
        System.out.println(empID);

    }

    //public - every where
    //protected every where except other package
    //default - everywhere but in same package
    //Private only at class level

}
