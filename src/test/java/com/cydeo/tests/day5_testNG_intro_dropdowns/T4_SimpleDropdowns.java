package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_SimpleDropdowns {
    WebDriver driver;
    //1. Open Chrome browser
    //2. Go to https://practice.cydeo.com/dropdown
    @BeforeMethod
    public void setUpMethod() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");
    }
    @Test
    public void simpleDropdownTest(){
        // 3. Verify “Simple dropdown” default selected value is correct. Expected: “Please select an option”
        Select simpleDropdown=new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        WebElement currentlySelectOption=simpleDropdown.getFirstSelectedOption();
        String actualSimpleDropdownText=currentlySelectOption.getText();
        System.out.println(actualSimpleDropdownText);
        String expectedSimpleDropdownText="Please select an option";
        Assert.assertEquals(actualSimpleDropdownText,expectedSimpleDropdownText);
        // 4. Verify “State selection” default selected value is correct. Expected: "Select a State"
        Select stateDropdown=new Select(driver.findElement(By.xpath("//select[@id='state']")));
        String expectedStateDropdownText="Select a State";
        String actualStateDropdownText=stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualStateDropdownText,expectedStateDropdownText);


    }




}