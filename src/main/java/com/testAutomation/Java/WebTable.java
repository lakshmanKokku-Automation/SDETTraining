package com.testAutomation.Java;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {


            driver.get("https://demoqa.com/webtables");

            int rowCount = driver.findElements(By.xpath("//table//tbody//tr")).size();
            int colCount = driver.findElements(By.xpath("//table//tbody//tr[1]//td")).size();

            //table//tbody//tr[1]//td[1]
            //table//tbody//tr[1]//td[2]
            //table//tbody//tr[1]//td[3]
            //table//tbody//tr[1]//td[4]
            //table//tbody//tr[2]//td[1]
            //table//tbody//tr[2]//td[2]
            //table//tbody//tr[2]//td[1]

            for (int i = 1; i <= rowCount; i++) {

                for (int j = 0; j < colCount; j++) {

                    System.out.println(driver.findElement(By.xpath("//table//tbody//tr[" + i + "]//td[" + j + "]")).getText());

                }
                System.out.println("******--------------------********");
            }

        }
            catch(Exception e){

                System.out.println(e.getLocalizedMessage());
            }finally{

            driver.quit();

        }

    }
}