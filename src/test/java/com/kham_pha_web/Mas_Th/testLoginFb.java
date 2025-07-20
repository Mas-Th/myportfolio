package com.kham_pha_web.Mas_Th;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
import java.time.Duration;

public class testLoginFb {
    WebDriver driver;

    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }
    @AfterClass
    public void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }

    @Test
    public void testLoginFb() throws InterruptedException {
        driver.get("https://web.facebook.com");

        WebElement email = driver.findElement(By.id("email"));
        WebElement pass = driver.findElement(By.id("pass"));
        WebElement btnLogin = driver.findElement(By.name("login"));

//        String user = System.getenv("FB_USERNAME");
//        String pwd = System.getenv("FB_PASSWORD");
        String user = "0352563834";
        String pwd = "fbThieunv1211996";

        email.sendKeys(user);
        pass.sendKeys(pwd);

        btnLogin.click();
        Thread.sleep(10000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("facebook.com"));
        assert driver.getCurrentUrl().contains("https://web.facebook.com/"):"Login khong thanh cong";

    }

    public void testLoginGmail() throws InterruptedException {
        driver.get("web.google.com");
        Thread.sleep(2000);
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("facebook");
        search.submit();
        Thread.sleep(2000);

    }
}
