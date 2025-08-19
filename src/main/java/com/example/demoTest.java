package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        // Open Google
        driver.get("https://www.google.com");
        Thread.sleep(2000); // tunggu 2s

        // Finding text box
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium WebDriver");
        Thread.sleep(2000); // tunggu 2s

        // Submit search
        searchBox.submit();
        Thread.sleep(3000); // tunggu 3s nak tengok result

        // Getting title page
        System.out.println("Page title: " + driver.getTitle());

        driver.quit();
    }
}