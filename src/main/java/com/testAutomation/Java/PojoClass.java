package com.testAutomation.Java;

import org.apache.hc.core5.http.io.SessionOutputBuffer;

public class PojoClass {

    //Page old java object
    // It is a simple java object which is not bounded by any special restrictions
    // Rules of a PoJo class
       // - * It should be public
       // - It recommended to make instance variables as private for security
       //  - variables should be accessed using getters and setters
       // * It should not implement any interfaces
       // * It should not extends any class
       // * It should not have any annotations
    private String name;
    private int id;
    public String getName() {
        return name;
    }

    public PojoClass(){
        System.out.println("I am default constructor");
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


      public double marks;



}
