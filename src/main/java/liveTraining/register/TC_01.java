package liveTraining.register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TC_01 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.get("https://tutorialsninja.com/demo/");

        driver.findElement(By.xpath("//*[@class='caret']")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Register")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
