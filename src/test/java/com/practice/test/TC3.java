package com.practice.test;

import com.practice.utils.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC3 extends Base {
    @Test
    public void loginUser() throws InterruptedException {
        driver.get("https://tutorialsninja.com/demo/");

        driver.findElement(By.xpath("//*[@class='caret']")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.xpath("//*[@name='email']")).sendKeys("stephin123@gmail.com");
        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Stephy@123");
        driver.findElement(By.xpath("//*[@type='submit']")).click();
        Thread.sleep(3000);
        driver.quit();
    }
}


