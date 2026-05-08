package com.testAutomation.Java.streams;

import com.testAutomation.Java.PojoClass;

public class TestPojo {

    public static void main(String[] args) {
        PojoClass pj=new PojoClass();
        pj.setId(101);
        pj.setName("Tarun");
        pj.marks=99;

        PojoClass pj1=new PojoClass();
        pj1.setId(102);
        pj1.setName("Jhon");
        pj1.marks=100;

        PojoClass pj2=new PojoClass();
        pj2.setId(103);
        pj2.setName("Ram");
        pj2.marks=78;

        PojoClass[] pjc=new PojoClass[] {pj,pj1,pj2};


    }
}
