package com.practice.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver driver;

    public LoginPage(WebDriver driver){
        super();
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void loginApp() throws InterruptedException {
        driver.findElement(By.xpath("//*[@name='email']")).sendKeys("stephin123@gmail.com");
        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Stephy@123");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@type='submit']")).click();
        Thread.sleep(3000);
    }
}
