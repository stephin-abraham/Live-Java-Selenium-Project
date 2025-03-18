package com.practice.test;

import com.practice.utils.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC1 extends Base {
    @Test
    public void clickRegisterUser() throws InterruptedException {
        driver.get("https://tutorialsninja.com/demo/");

        driver.findElement(By.xpath("//*[@class='caret']")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Register")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
