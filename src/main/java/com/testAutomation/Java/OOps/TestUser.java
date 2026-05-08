package com.testAutomation.Java.OOps;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestUser {

    public static void main(String[] args) {
        Mobile sam=new Samsung();
        WebDriver driver= new ChromeDriver();
        sam.call();
        sam.clocks();
        Mobile.Recording();
       // Mobile mo=new Mobile();
        //sam.whatsApp();
    }

}
