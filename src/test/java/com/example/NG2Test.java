package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
// import org.testng.annotations.AfterMethod;
// import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NG2Test {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void searchSeleniumWebDriver() throws InterruptedException {
        driver.get("https://www.bing.com");

        // WebElement searchBox = driver.findElement(By.name("q"));
        // searchBox.sendKeys("Selenium WebDriver");
        // Thread.sleep(2000);  // optional wait

        // searchBox.submit();
        // Thread.sleep(3000);  // wait for results

        System.out.println("Page title: " + driver.getTitle() + " is the title of the page");
    }

    @Test(enabled = false) // This test is skipped
    public void skippedTest() {
        System.out.println("This will not run");
    }

    @Test
    public void conditionallySkippedTest() { // This test will be skipped based on a condition
        if (true) {
            throw new SkipException("Skipping this test because condition is true");
        }
        System.out.println("This test will not run if the condition is true.");
    }

    @AfterClass
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}