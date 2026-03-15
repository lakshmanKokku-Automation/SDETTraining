package com.testAutomation.Java;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CalendarTest2 {
    static WebDriver driver;
    static String actMonth;
    static String actYear;

    public static void main(String[] args) {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriverManager.chromedriver().setup();
        CalendarTest2 test1=new CalendarTest2();
        CalendarTest2 test2=new CalendarTest2();
        test1.driver = new ChromeDriver(options);
        test1.driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
        test1.driver.findElement(By.id("datepicker")).click();
        //june 10 2030
        actMonth = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']//span[@class='ui-datepicker-month']")).getText();
        actYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']//span[@class='ui-datepicker-year']")).getText();
        dateSelection("June", "2027", "40");
        driver.quit();
    }

    public static void dateSelection(String month, String year, String date) {


        if(Integer.parseInt(date)>31){

            throw new RuntimeException("Invalid date input");

        }


            if (Integer.parseInt(actYear) > Integer.parseInt(year)) {
                while (!(actMonth.equals(month) && actYear.equals(year))) {
                    driver.findElement(By.xpath("//a[@title='Prev']")).click();
                    actMonth = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']//span[@class='ui-datepicker-month']")).getText();
                    actYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']//span[@class='ui-datepicker-year']")).getText();

                }
                driver.findElement(By.xpath("//a[text()='" + date + "']")).click();

            } else {

                while (!(actMonth.equals(month) && actYear.equals(year))) {
                    driver.findElement(By.xpath("//a[@title='Next']")).click();
                    actMonth = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']//span[@class='ui-datepicker-month']")).getText();
                    actYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']//span[@class='ui-datepicker-year']")).getText();

                }
                driver.findElement(By.xpath("//a[text()='" + date + "']")).click();

            }
        }

    }


