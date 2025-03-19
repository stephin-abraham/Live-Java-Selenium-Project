package com.practice.test;

import com.practice.pageobjects.HomePage;
import com.practice.pageobjects.LoginPage;
import com.practice.utils.Base;
import org.testng.annotations.Test;

public class TC5 extends Base {
    @Test
    public void homePage() throws InterruptedException {
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        LoginPage l = new LoginPage(driver);
        l.loginApp();
        HomePage h = new HomePage(driver);
        h.homePageApp();
    }
}
