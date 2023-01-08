package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T5_WindowsPractice {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        //1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //1. Go to : https://practice.cydeo.com/windows
        driver.get("https://practice.cydeo.com/windows");
    }

    @Test
    public void multiple_window_test() {
        //Storing the main page's window handle as String is
        // good practice for future re-usable purposes
        String mainHandle=driver.getWindowHandle();
        System.out.println("mainHandle = " + mainHandle);
        //2. Assert: Title is “Windows”
        String expectedTitle="Windows";
        String actualTitle=driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);

        //3. Click to: “Click Here” link
        //6. Switch to new Window.
        //7. Assert: Title is “New Window”

    }
}