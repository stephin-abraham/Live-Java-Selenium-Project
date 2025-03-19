package com.practice.test;

import com.practice.utils.Base;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC2 extends Base {
    @Test
    public void registerUser() throws InterruptedException {

        driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");

        driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Stephin");
        driver.findElement(By.id("input-lastname")).sendKeys("Abraham");
        driver.findElement(By.xpath("//*[@name='email']")).sendKeys("stephin123@gmail.com");
        driver.findElement(By.xpath("//*[@type='tel']")).sendKeys("1234567878");

        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Stephy@123");
        driver.findElement(By.id("input-confirm")).sendKeys("Stephy@123");

        driver.findElement(By.xpath("//*[@type='checkbox']")).click();
        driver.findElement(By.xpath("//*[@type='submit']")).click();

        String windowTitle =  driver.getTitle();
        System.out.println(windowTitle);
        String expectedText = "Warning: E-Mail Address is already registered!";
        Assert.assertEquals(driver.findElement(By.xpath("//*[@class='alert alert-danger alert-dismissible']")).getText(),expectedText);
        String text = driver.findElement(By.xpath("//*[@class='alert alert-danger alert-dismissible']")).getText();
        System.out.println(text);

        Thread.sleep(2000);
        driver.close();
    }
}
