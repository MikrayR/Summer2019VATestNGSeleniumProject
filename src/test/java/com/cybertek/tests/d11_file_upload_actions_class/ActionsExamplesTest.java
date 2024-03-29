package com.cybertek.tests.d11_file_upload_actions_class;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionsExamplesTest {

    /**
     * Actions class:
     * Actions class is used to do advanced user interactions like mouse hover, double click., drag drop, scroll up/down etc.
     * Actions class is a class comes from selenium and is created by passing the web driver object as constructor.
     * Code pushed
     */
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void teardownMethod() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    /*
    go to page http://practice.cybertekschool.com/hovers
    hover over the first image
    verify text View profile is displayed
     */
    @Test
    public void hoverTest() throws InterruptedException {
        driver.get(" http://practice.cybertekschool.com/hovers");

        WebElement img1 = driver.findElement(By.tagName("img"));

        // Actions  --> class that contains all the user interactions
        Actions actions = new Actions(driver);
        Thread.sleep(2000);
        // moveToElement() --> moves the mouse on top of the given element
        // perform() --> complete the action, using every time after calling action
        actions.moveToElement(img1).perform();

        Assert.assertTrue(driver.findElement(By.linkText("View profile")).isDisplayed());

    }

    @Test
    public void dragdroptest() throws InterruptedException {
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        // source --> we will drag this element
        WebElement source = driver.findElement(By.id("draggable"));
        // target --> we drop here
        WebElement target = driver.findElement(By.id("droptarget"));

        Actions actions = new Actions(driver);

        Thread.sleep(2000);
        // dragAndDrop --> drags the source to target
        actions.dragAndDrop(source, target).perform();

    }

    @Test
    public void dragdropbychainingtest(){
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        // source --> we will drag this element
        WebElement source = driver.findElement(By.id("draggable"));
        // target --> we drop here
        WebElement target = driver.findElement(By.id("droptarget"));

        Actions actions = new Actions(driver);
        //  we can chain multiple actions
        // at the end we call the build().perform()
        // build --> is used to chain the actions.
        actions.moveToElement(source).clickAndHold().moveToElement(target).release().build().perform();

    }

}
