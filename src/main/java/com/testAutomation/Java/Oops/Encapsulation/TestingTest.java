package com.testAutomation.Java.Oops.Encapsulation;

import com.testAutomation.Java.Oops.Inhertance.Employee;
import com.testAutomation.Java.Oops.Inhertance.Encapsulation;

public class TestingTest {

    public static void main(String[] args) {

        Encapsulation enc1=new Encapsulation();
        enc1.setAge(20);
        System.out.println(enc1.getAge());

//        Employee emp=new Employee();
//        emp.empTask();
//        System.out.println(emp.empID);
    }

    //when difined with public , we can access in same class,package , other packages also
}
