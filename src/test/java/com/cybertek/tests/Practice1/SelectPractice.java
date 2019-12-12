package com.cybertek.tests.Practice1;

import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.Driver;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SelectPractice extends TestBase {

    @Test
    public void testSlect(){

        LoginPage loginPage = new LoginPage();
        loginPage.userName.sendKeys("storemanager85");
        loginPage.password.sendKeys("UserUser123");
        loginPage.submit.click();



    }
}
