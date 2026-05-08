package com.testAutomation.Java.OOps;

public class Samsung implements Mobile{

    @Override
    public void call() {
        System.out.println("Samsung calling feature");
    }

    @Override
    public void messages() {
        System.out.println("Samsung Messaging feature");
    }

    @Override
    public void internet() {
        System.out.println("Samsung internet feature");
    }

    @Override
    public void camera() {
        System.out.println("Samsung camera feature");
    }

    public void whatsApp(){
        System.out.println("Samsung whatsapp feature");
    }
}


