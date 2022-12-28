package com.cydeo.tests.day3_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_locators_getText {
    public static void main(String[] args) {
        // 1- Open a chrome browser
        // 2- Go to: https://login1.nextbasecrm.com/
        // 3- Enter incorrect username: “incorrect”
        // 4- Enter incorrect password: “incorrect”
        // 5- Click to log in button.
        // 6- Verify error message text is as expected:
        // Expected: Incorrect login or password

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://login1.nextbasecrm.com");
        driver.findElement(By.className("login-inp")).sendKeys("incorrect");
        driver.findElement(By.name("USER_PASSWORD")).sendKeys("incorrect");
        driver.findElement(By.className("login-btn")).click();
        WebElement errorMassage = driver.findElement(By.className("errortext"));

        String expectedErrorMassage = "Incorrect login or password";
        String actualErrorMassage = errorMassage.getText();

        if (actualErrorMassage.equals(expectedErrorMassage)) {
            System.out.println("Error Massage Verification PASSED!");
        } else {
            System.out.println("Error Massage Verification FAILED!!!");
        }


    }
}
