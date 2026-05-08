package com.testAutomation.Java.OOps;

public class Apple implements Mobile{


    @Override
    public void call() {
        System.out.println("Apple call feature");
    }

    @Override
    public void messages() {
        System.out.println("Apple messages feature");
    }

    @Override
    public void internet() {
        System.out.println("Apple internet feature");
    }

    @Override
    public void camera() {
        System.out.println("Apple camera feature");
    }

    public void appleMusic(){
        System.out.println("Apple music feature");
    }
}
