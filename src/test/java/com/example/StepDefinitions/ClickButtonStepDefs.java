package com.example.StepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickButtonStepDefs {
    @Given("^Find commentary$")
    public void launchGoogle(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bible.com/ro/bible/191/PSA.17.3.VDC");
        driver.manage().window().maximize();
        Assert.assertTrue(driver.getTitle().contains("Psalmul 17:3"));
        driver.findElement(By.xpath("//a[@href='/ro/bible/191/PSA.17.VDC']")).click();
        driver.close();
    }
}
