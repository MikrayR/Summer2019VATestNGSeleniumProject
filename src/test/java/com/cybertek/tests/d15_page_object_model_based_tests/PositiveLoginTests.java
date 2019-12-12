package com.cybertek.tests.d15_page_object_model_based_tests;

import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PositiveLoginTests extends TestBase {

    @Test
    public void loginAsDriver(){
        LoginPage loginPage=new LoginPage();
        loginPage.userName.sendKeys("user2");
        loginPage.password.sendKeys("UserUser123");
        loginPage.submit.click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://q3.vytrack.com");
    }
}
/**
 * Create page object class for login page
 * 1.Right click on pages package
 * 2.New —> Class
 * 3.Enter name: LoginPage
 * 4.OKPage Object model vs PageFactory
 * Page Object model —> design pattern in selenium
 * PageFactory —> is class in selenium using which we can create page object model.
 * When we crate a page object class, we create public constructor for this class.
 * In the constructor body we call the static method initElements from the PageFactory class.
 * initElements takes 2 params: 1. Webdriver object,
 *                              2 instance of this object
 *
 *     You may see page object class constructors that look like this which is normal
 *     WebDriver driver;
 *     public LoginPage(){
 *         PageFactory.intElements(driver, LoginPage.class);
 *
 *         @FindBy —> annotation from selenium, used to provide locator for the element
 *     }
 */
