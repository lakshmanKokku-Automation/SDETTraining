package com.testAutomation.Java;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalendarTest1 {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.findElement(By.id("dateOfBirthInput")).click();
        selectDOB("December","1970","25");


    }

    public static void selectDOB(String month,String year,String date) throws InterruptedException {

        Select sc1=new Select(driver.findElement(By.className("react-datepicker__month-select")));
        sc1.selectByVisibleText(month);
        Select sc2 =new Select(driver.findElement(By.className("react-datepicker__year-select")));
        sc2.selectByVisibleText(year);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='react-datepicker__month']//div[@class='react-datepicker__week']//div[not(contains(@class,'react-datepicker__day--outside-month')) and text()='"+date+"']")).click();
        Thread.sleep(1000);


    }

}
