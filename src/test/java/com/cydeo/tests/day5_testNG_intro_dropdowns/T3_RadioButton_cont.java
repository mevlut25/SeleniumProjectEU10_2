package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T3_RadioButton_cont {
    public static void main(String[] args) {
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons");
        //3. Click to “Hockey” radio button
        //Locate name='sport' radio button and store them in a lsit os Web Element.
        List<WebElement> sportRadioButtons = driver.findElements(By.name("sport"));
        for (WebElement each : sportRadioButtons) {
            String eachId = each.getAttribute("id");
            System.out.println("eachId = " + eachId);
            if (eachId.equals("hockey")) {
                each.click();
                System.out.println("Hockey is selected : = "+each.isSelected());
                break;

            }

        }

        //4. Verify “Hockey” radio button is selected after clicking.

    }
}
