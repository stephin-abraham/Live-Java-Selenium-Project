package com.practice.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public WebDriver driver;

    public HomePage(WebDriver driver){
        super();
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void homePageApp(){
        driver.findElement(By.xpath("//*[text()='Qafox.com']")).click();
    }
}
