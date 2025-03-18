package liveTraining.register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TC_02_register_user {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");

        driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Stephin");
        driver.findElement(By.id("input-lastname")).sendKeys("New");
        driver.findElement(By.xpath("//*[@name='email']")).sendKeys("stephin1234@gmail.com");
        driver.findElement(By.xpath("//*[@type='tel']")).sendKeys("1234567848");

        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Stephy@1234");
        driver.findElement(By.id("input-confirm")).sendKeys("Stephy@1234");

        driver.findElement(By.xpath("//*[@type='checkbox']")).click();
        driver.findElement(By.xpath("//*[@type='submit']")).click();

        String windowTitle =  driver.getTitle();
        System.out.println(windowTitle);
    }
}
