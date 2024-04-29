package com.remindly.fw;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class MainScreenHelper extends BaseHelper {
    public MainScreenHelper(AppiumDriver driver) {
        super(driver);

    }

    public void confirm() {
        tap(By.id("android:id/button1"));
    }


    public boolean isNoReminderTextPresent() {
        return isElementPresent(By.id("no_reminder_text"));

    }

    public void tapOnAddReminder() {
        tap(By.id("add_reminder"));
    }

    public String isReminderTitlePresent() {
        return driver.findElement(By.id("recycle_title")).getText();
    }

    public void tapOnThreeDropMenu() {
        tap(By.className("android.widget.ImageView"));
    }

    public void tapOnLicencesMenu() {
        tap(By.xpath("//android.widget.LinearLayout"));
    }

    public String getHeaderText() {
       return driver.findElement(By.id("com.blanyal.remindly:id/licenses_text_view")).getText();

    }
}
