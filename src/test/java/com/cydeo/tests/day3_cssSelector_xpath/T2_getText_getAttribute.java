package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {
    public static void main(String[] args) {
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com");
        //3- Verify “remember me” label text is as expected:
        //Expected: Remember me on this computer
        WebElement rememberMeLabel = driver.findElement(By.className("login-item-checkbox-label"));
        String expectedRememberMeLabel = "Remember me on this computer";
        String actualRememberMeLabel = rememberMeLabel.getText();
        if (actualRememberMeLabel.equals(expectedRememberMeLabel)) {
            System.out.println("Label Verification PASSED!");
        } else {
            System.out.println("Label Verification FAILED!!!");
        }
        // 4- Verify “forgot password” link text is as expected:
        //Expected: Forgot your password?
        WebElement forgotPasswordLink = driver.findElement(By.className("login-link-forgot-pass"));
        String expectedForgotPasswordLinkText = forgotPasswordLink.getText();
        String actualForgotPasswordLinkText = "Forgot your password?";
        if (actualForgotPasswordLinkText.equalsIgnoreCase(expectedForgotPasswordLinkText)) {
            System.out.println("Forgot Password Link Test PASSED!");
        } else {
            System.out.println(actualForgotPasswordLinkText);
            System.out.println(expectedForgotPasswordLinkText);
            System.out.println("Forgot Password Link TesT FAILED!!!");
        }
        //5- Verify “forgot password” href attribute’s value contains expected:
        //Expected: forgot_password=yes
        String expectedInHref = "forgot_password=yes";
        String actualHrefAttributeValue = forgotPasswordLink.getAttribute("href");
        System.out.println("actualHrefAttributeValue =" + actualHrefAttributeValue);
        if (actualHrefAttributeValue.contains(expectedInHref)) {
            System.out.println("HREF attribute value verification PASSED!");
        } else {
            System.out.println("HREF attribute value verification FAILED!!!");
        }


    }
}
