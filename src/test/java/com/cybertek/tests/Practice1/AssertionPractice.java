package com.cybertek.tests.Practice1;

import com.cybertek.utilities.Driver;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

public class AssertionPractice {

    @BeforeClass
    public void setUpClass(){
        System.out.println("Before Class");

    }
    @AfterClass
    public void teardownClass(){
        System.out.println("After Class");
        Driver.closeDriver();
    }
    @BeforeMethod
    public void setUpMethod(){
        System.out.println("Before method");
    }
    @Test
    public void test1(){
        String actualResult="1";
        String expectedResult="1";
        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void test2(){
        Assert.assertTrue("mila@yahoo.com".contains("@"),"my emails must contain @sign");
    }
    @Test
    public void test3(){
        Assert.assertTrue(1>0);

    }
    @Test
    public void test4(){
        String actual="10";
        String expected="1";

        Assert.assertNotEquals(actual, expected);
    }
    @Test
    public void testRadioButton5(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http:practice.cybertekschool.com/radio_buttons");
        WebElement blue=driver.findElement(By.xpath("//input[@id='blue']"));
       Assert.assertTrue(blue.isSelected());
       WebElement red=driver.findElement(By.xpath("//input[@id='red']"));
       Assert.assertFalse(red.isSelected());

       //verified disabled elements
       WebElement green= driver.findElement(By.xpath("//*[.='Green']"));
      // Assert.assertTrue(green.isDisplayed(),"Green is disabled");
        System.out.println(green.isDisplayed()+" Green is Disabled");
        green.click();


    }
    @Test
    public void testSelectElement(){
        WebDriver driver=WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dynamic_controls");
        WebElement checkboxA=driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkboxA.click();
        System.out.println("A check Box is slected: "+ checkboxA.isSelected());
        WebElement enablebox=driver.findElement(By.xpath("//input[@type='text']"));
        System.out.println("is box enable: "+enablebox.isEnabled());
        //enablebox.sendKeys("Hi"); // because disable to able to send key

        WebElement EnableLetter=driver.findElement(By.xpath("//form[@id='input-example']/button"));
        System.out.println(EnableLetter.getText());
        //in order to get attribute we need give attribute name
        System.out.println(EnableLetter.getAttribute("type"));   //get button
        System.out.println(EnableLetter.getAttribute("onclick"));  //get swapInput

    }

    @AfterMethod
    public void teardownMethod(){
        System.out.println("After Mehtod");

    }
}
