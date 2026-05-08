package com.testAutomation.Java.OOps;

public interface Mobile {

    //Interface is blue print of class
    //Interface is a kind of business document
    //It bothers about what needs to be there
    // Interface holds what to do but not how to do .

    public void call();

    public void messages();

    public void internet();

    public void camera();

    default void clocks(){

        System.out.println("I am mobile clocks");

    }

    static void Recording(){

        System.out.println("I am mobile Recording ");

    }

    private void telegram(){
        System.out.println("I am mobile telegram Private method");
    }


}
