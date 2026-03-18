package com.testAutomation.Java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SwitchCase {

    public static void main(String[] args) {

        String browser = "chrome";

       switch (browser) {

           case "chrome":
               WebDriver driver=new ChromeDriver();
               break;

           case "edge":
              WebDriver driver1=new EdgeDriver();
               break;

           default:
               throw new RuntimeException("Undefined browser");
               //System.out.println("I am undefined");
       }


    }

}
