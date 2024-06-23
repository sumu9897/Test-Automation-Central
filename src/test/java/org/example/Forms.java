package org.example;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Forms extends DriverSetup {
    @Test
    public void Checkboxes() throws InterruptedException{
        browser.get("https://testautomationcentral.com/demo/checkboxes.html");
        //Select CheckBox 1
        browser.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
        Thread.sleep(2000);
        //Undo Checkbox 1
        browser.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
        Thread.sleep(1000);
        //Select Checkbox 2
        browser.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
        Thread.sleep(1000);
        //Select Checkbox 3
        browser.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
        Thread.sleep(2000);

        //Styled Checkboxes
        browser.findElement(By.xpath("(//input[@class='form-checkbox text-red-600'])[1]")).click();
        Thread.sleep(2000);

    }

    @Test
    public void  RadioButtons() throws InterruptedException {
        browser.get("https://testautomationcentral.com/demo/radiobuttons.html");
        //Select Radiobutton 1
        browser.findElement(By.xpath("(//input[@name='options'])[1]")).click();
        Thread.sleep(1000);
        //Select RadioButton 3
        browser.findElement(By.xpath("(//input[@name='options'])[3]")).click();
        Thread.sleep(2000);


    }

    @Test
    public  void Dropdowns(){
        browser.get("https://testautomationcentral.com/demo/dropdown.html");
    }
}
