package com.cybertek.tests.d9_tabs_frames_alerts_popups;

import com.cybertek.utilities.WebDriverFactory;
import com.google.gson.internal.bind.util.ISO8601Utils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class PopupAndAlerts {
    WebDriver  driver;    // this works for every case we cannot reasign it example: String driver=WebDriverFactory.getDriver("chrome")
    @BeforeMethod
    public void setupMethod() {
     //   WebDriver driver = WebDriverFactory.getDriver("chrome");   it is not applicable this is a mistake
        //   if we use this way we will get error because this equal to reasigning it

        driver = WebDriverFactory.getDriver("chrome");

    }

    @AfterMethod
    public void teardownMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public void htmlPopup(){   // there is two way popups 1. html pop ups: deal with it is as another web element;
                                                        // 2. Javascript alerts it is asecond type of alert and we
        //we can not right click for html hreF for we know it is not from html
        driver.get("https://www.primefaces.org/showcase/ui/overlay/confirmDialog.xhtml");
        // bring pop up
        driver.findElement(By.xpath("//span[.='Destroy the World']")).click();
        // click  on the pop up
        driver.findElement(By.xpath("//span[.='No']")).click();


    }
    @Test
    public void jsALerts() {
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        // trigger the alert
        driver.findElement(By.xpath("//button[1]")).click();
        // control the alert using alert class
        Alert alert = driver.switchTo().alert();
        // accept alert --> clicking ok in alerts
        alert.accept();

        // trigger the second alert
        driver.findElement(By.xpath("//button[2]")).click();
        // switch to the new alert
        alert = driver.switchTo().alert();
        // dismiss --> clicking x to close, selecting no/cancer
        alert.dismiss();

        // trigger the 3rd alert
        driver.findElement(By.xpath("//button[3]")).click();
        // switch to the new alert
        alert = driver.switchTo().alert();
        // send keys to alert
        alert.sendKeys("red alert");
        // print text of the alert
        System.out.println(alert.getText());
        // close the alert
        alert.accept();


    }


}
