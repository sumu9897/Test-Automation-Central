package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
    public  void Dropdowns() throws InterruptedException {
        browser.get("https://testautomationcentral.com/demo/dropdown.html");
        //Simple dropdown
        browser.findElement(By.xpath("(//option[@value='option3'][normalize-space()='Option 3'])[1]")).click();
        Thread.sleep(2000);
    }
    @Test
    public void TextBox() throws InterruptedException {
        browser.get("https://testautomationcentral.com/demo/textboxes.html");

        // Simple Text
        WebElement inputElement = browser.findElement(By.xpath("(//input[@placeholder='Enter text'])[1]"));
        inputElement.sendKeys("Thank you");
        Thread.sleep(2000);

        // Remove "you" from the text
        String currentText = inputElement.getAttribute("value");
        inputElement.clear();
        inputElement.sendKeys(currentText.replace("you", ""));
        Thread.sleep(2000);

        // Write "thanks this site" in the input field
        inputElement.clear();
        inputElement.sendKeys("thanks this site");
        Thread.sleep(2000);
    }

    @Test
    public  void Buttons() throws InterruptedException{
        browser.get("https://testautomationcentral.com/demo/buttons.html");

        //Basic Button Select
        browser.findElement(By.xpath("(//button[normalize-space()='Click Me'])[1]")).click();
        Thread.sleep(1000);

        //Submit Button
        browser.findElement(By.xpath("(//button[normalize-space()='Submit Button'])[1]")).click();
        Thread.sleep(1000);

        //Submit Button Click
        browser.findElement(By.xpath("(//button[normalize-space()='Submit'])[1]")).click();
        Thread.sleep(1000);

        //Reset Button
        browser.findElement(By.xpath("(//button[normalize-space()='Reset Button'])[1]")).click();
        Thread.sleep(1000);

        //Reset Button Click
        browser.findElement(By.xpath("(//button[normalize-space()='Reset'])[1]")).click();
        Thread.sleep(1000);

        //Button With Icon
        browser.findElement(By.xpath("(//button[normalize-space()='Button with Icon'])[1]")).click();
        Thread.sleep(1000);

        //Button With Icon
        browser.findElement(By.xpath("(//button[normalize-space()='Icon Button'])[1]")).click();
        Thread.sleep(1000);

        //Disable Button
        browser.findElement(By.xpath("(//button[normalize-space()='Disabled Button'])[1]")).click();
        Thread.sleep(1000);

        //Disable Button Click
        browser.findElement(By.xpath("(//button[normalize-space()='Disabled'])[1]")).click();
        Thread.sleep(1000);
    }

}
