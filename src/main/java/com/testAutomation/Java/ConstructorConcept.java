package com.testAutomation.Java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConstructorConcept {

    //Constructor is block of code ,which is called when we instantiate a class
    //default constructor
    //constructor doesnot have any return type
    //Constrcutor name is alike className

    public static void main(String[] args) {

        ConstructorConcept c1=new ConstructorConcept(100,200);
       // ConstructorConcept c=new ConstructorConcept(100);
        ConstructorConcept c3=new ConstructorConcept(100,200);

        System.out.println("Hello World");
    }

    public  ConstructorConcept(){
        WebDriver driver=new ChromeDriver();
        System.out.println("I am default Constructor");
    }

    public  ConstructorConcept(int a){
        System.out.println("I one parameter  default Constructor " +a);
    }

    public  ConstructorConcept(int a,int b){
        System.out.println("I one parameter  default Constructor " +a+" " +b);
    }
}
