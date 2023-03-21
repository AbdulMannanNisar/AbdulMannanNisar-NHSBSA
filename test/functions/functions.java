package stepdefs.functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class functions {
    public static void Options(WebDriver driver){
        driver.findElement(By.xpath("//button[@id='nhsuk-cookie-banner__link_accept_analytics']")).click();
        driver.findElement(By.xpath("//input[@id='next-button']")).click();

        driver.findElement(By.xpath("//label[@id='label-england']")).click();

        driver.findElement(By.xpath("//input[@id='next-button']")).click();

    }
    public static void Know_the_treatment(WebDriver driver){
        driver.findElement(By.xpath("//input[@id='radio-yes']")).click();

        driver.findElement(By.xpath("//input[@id='next-button']")).click();

        driver.findElement(By.xpath("//label[@id='label-england']")).click();
        driver.findElement(By.xpath("//input[@id='next-button']")).click();

        driver.findElement(By.xpath("//input[@id='dob-day']")).sendKeys("01");
        driver.findElement(By.xpath("//input[@id='dob-month']")).sendKeys("01");

        driver.findElement(By.xpath("//input[@id='dob-year']")).sendKeys("1995");
        driver.findElement(By.xpath("//input[@id='next-button']")).click();
        driver.findElement(By.xpath("//input[@id='radio-yes']")).click();
        driver.findElement(By.xpath("//input[@id='next-button']")).click();

        driver.findElement(By.xpath("//input[@id='radio-yes']")).click();
        driver.findElement(By.xpath("//input[@id='next-button']")).click();
        driver.findElement(By.xpath("//label[normalize-space()='Yes, we receive Universal Credit payments']")).click();
        driver.findElement(By.xpath("//input[@id='next-button']")).click();
        driver.findElement(By.xpath("//input[@id='radio-yes']")).click();
        driver.findElement(By.xpath("//input[@id='next-button']")).click();

        driver.findElement(By.xpath("//label[@id='label-yes']")).click();
        driver.findElement(By.xpath("//input[@id='next-button']")).click();

        String Result = driver.findElement(By.xpath("//h2[@class='heading-large']")).getText();
        System.out.println(Result);
        driver.close();

    }


}
