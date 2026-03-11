package com.testAutomation.Java;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CalendarHandlingScenario {

    static WebDriver driver;
    static String actMonth;
    static String actYear;

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
        driver.findElement(By.id("datepicker")).click();
        String expectedMonth = "March";
        String expectedYear = "2026";
        String expectedDate = "29";
        actMonth = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']//span[@class='ui-datepicker-month']")).getText();
        actYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']//span[@class='ui-datepicker-year']")).getText();

        if (actMonth.equals(expectedMonth) && actYear.equals(expectedYear)) {
            driver.findElement(By.xpath("//a[text()='" + expectedDate + "']")).click();

        } else {

            if (Integer.parseInt(actYear) > Integer.parseInt(expectedYear)) {
                while (!(actMonth.equals(expectedMonth) && actYear.equals(expectedYear))) {
                    driver.findElement(By.xpath("//a[@title='Prev']")).click();
                    actMonth = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']//span[@class='ui-datepicker-month']")).getText();
                    actYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']//span[@class='ui-datepicker-year']")).getText();

                }
                driver.findElement(By.xpath("//a[text()='" + expectedDate + "']")).click();
            } else {

                while (!(actMonth.equals(expectedMonth) && actYear.equals(expectedYear))) {
                    driver.findElement(By.xpath("//a[@title='Next']")).click();
                    actMonth = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']//span[@class='ui-datepicker-month']")).getText();
                    actYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']//span[@class='ui-datepicker-year']")).getText();

                }
                driver.findElement(By.xpath("//a[text()='" + expectedDate + "']")).click();

            }
        }

        //button[@data-testid='depart-btn']//span[text()='Add date']

        // (//div[@data-testid='CustomCalendarContainer']//div//div//h2)[1]

    }

}


