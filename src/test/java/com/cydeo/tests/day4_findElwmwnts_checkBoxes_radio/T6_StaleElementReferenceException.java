package com.cydeo.tests.day4_findElwmwnts_checkBoxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class T6_StaleElementReferenceException {
    public static void main(String[] args) {
        //1- Open a Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2- Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");
        // 3- Locate “CYDEO” link, verify it is displayed.
        // 4- Refresh the page.
        //5- Verify it is displayed, again.

    }
}
