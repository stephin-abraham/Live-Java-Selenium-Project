package com.practice.test;

import com.practice.pageobjects.LoginPage;
import com.practice.utils.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TC4 extends Base {
    @Test
    public void scrollDown () throws InterruptedException {
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        LoginPage l = new LoginPage(driver);
        l.loginApp();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //scroll to bottom of page
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(2000);
        //scroll to particular element
        WebElement logo= driver.findElement(By.xpath("//*[text()='Qafox.com']"));
        js.executeScript("arguments[0].scrollIntoView(true);", logo);
        Thread.sleep(3000);
    }
}
