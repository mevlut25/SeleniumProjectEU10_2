package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T3_CRM_LOGIN {
    public WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void crm_login_test(){
        //1. Create new test and make setups
        //2. Goto:https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com");

        //6. Verify title is as expected:
        BrowserUtils.verifyTitle(driver,"My tasks");
        System.out.println(driver.getTitle());



    }
}
