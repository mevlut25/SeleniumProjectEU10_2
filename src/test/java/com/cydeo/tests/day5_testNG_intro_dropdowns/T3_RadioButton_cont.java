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
        clickAndVerificationRadioButton(driver,"sport","hockey");
        clickAndVerificationRadioButton(driver,"sport","football");


    }

    private static void clickAndVerificationRadioButton(WebDriver driver, String nameAttribute, String idValue) {
        List<WebElement> RadioButtons = driver.findElements(By.name(nameAttribute));
        //3. Click to “Hockey” radio button
        //Locate name='sport' radio button and store them in a list os Web Element.
        for (WebElement each : RadioButtons) {
            String eachId = each.getAttribute("id");
            System.out.println("eachId = " + eachId);
            if (eachId.equals(idValue)) {
                each.click();
                System.out.println(eachId+" is selected : = " + each.isSelected());
                break;
            }
        }
    }
}
