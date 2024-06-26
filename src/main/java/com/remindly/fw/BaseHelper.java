package com.remindly.fw;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseHelper {
    AppiumDriver driver;
    public BaseHelper(AppiumDriver driver) {
        this.driver = driver;
    }




    public boolean isElementPresent(By locator)
    {
        return driver.findElements(locator).size()>0;
    }

    public void type(By locator, String text) {
        if (text != null) {
            tap(locator);
            driver.findElement(locator).clear();
            driver.findElement(locator).sendKeys(text);
        }
        driver.navigate().back();//hide keyboard
    }

    public void tap(By locator) {
        driver.findElement(locator).click();
    }



    public void pause(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}




