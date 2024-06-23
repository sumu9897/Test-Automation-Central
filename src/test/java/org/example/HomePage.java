package org.example;

import org.testng.annotations.Test;

public class HomePage extends DriverSetup{
    @Test
    public  void OpenHomePage() throws InterruptedException {
        browser.get("https://testautomationcentral.com/demo/index.html");
        Thread.sleep(3000);
        System.out.println(browser.getTitle());
        System.out.println(browser.getCurrentUrl());
//        System.out.println(browser.getPageSource());
        System.out.println(browser.getWindowHandle());
        System.out.println(browser.getWindowHandles());
        System.out.println(browser.switchTo());
        System.out.println(browser.manage());
        System.out.println(browser.navigate());
    }
}
