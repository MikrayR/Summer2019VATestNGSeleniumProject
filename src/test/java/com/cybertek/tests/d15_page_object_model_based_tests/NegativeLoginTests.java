package com.cybertek.tests.d15_page_object_model_based_tests;

import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeLoginTests extends TestBase {

    @Test
    public void wrongPasswordTest(){
        LoginPage loginPage = new LoginPage();
        loginPage.userName.sendKeys("salesmanager101");
        loginPage.password.sendKeys("greatpassword");
        loginPage.submit.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://qa3.vytrack.com/user/login");
    }

    @Test
    public void wrongUsernameTest(){
        LoginPage loginPage=new LoginPage();
        loginPage.userName.sendKeys("superadminuser");
        loginPage.password.sendKeys("UserUser123");
        loginPage.submit.click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://qa3.vytrack.com/user/login");
    }
}
/***
 * Framework is organization of files folders in a way that makes automated testing easy.
 * Properties file —> keep the important test information More utilities
 * —Configuration reader —> reads from the properties file
 * Driver class —> single class that creates and provides web driver object for all tests
 * Test base —> contains common logic and properties for all tests.
 * Page object model —> this is a design pattern that enhances the ease of maintenance and reusaility.
 * It is an encapsulated class that mirrors the behavior and objects of a web page from the AUT.
 * In page object model we create classes that serve as object repository.
 * In page object model, we operate the test logic from the UI logic.
 * Pom file —> this is pom.xml and has nothing to do with selenium.
 * POM —> abbreviation used for age object modelEasy to maintain, scale, reuse
 * Create a new package1.Right click on package cybertek
 * 2.New —> package
 * 3.Enter name: pages
 * 4.OK
 *
 */
