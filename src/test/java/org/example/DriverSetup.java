package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class DriverSetup {
    public WebDriver browser;

    @BeforeTest
    public void openABrowser(){
        browser = new SafariDriver();
        browser.manage().window().maximize();
    }
    @AfterTest
    public  void closeBrowser(){
        browser.quit();
    }
}
