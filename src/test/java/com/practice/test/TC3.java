package com.practice.test;

import com.practice.pageobjects.LoginPage;
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
        LoginPage l = new LoginPage(driver);
        l.loginApp();
        driver.quit();
    }
}


