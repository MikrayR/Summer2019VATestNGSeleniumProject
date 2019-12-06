package com.cybertek.tests.Practice1;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class PracticeDropdownList {

    @Test
    public void test1(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement dropdownList=driver.findElement(By.id("dropdownMenuLink"));
        dropdownList.click();

        List<WebElement> options=driver.findElements(By.className("dropdown-item"));
        System.out.println("options.size= "+options.size());

        for(WebElement option: options){
            System.out.println(option.getText());
        }
        driver.findElement(By.linkText("Amazon")).click();
    }

    @Test
    public void test2(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement element=driver.findElement(By.id("month"));
        Select monthList=new Select(element);


        List<WebElement> options=monthList.getOptions();

        System.out.println(options.size());

        for(WebElement month: options){
            System.out.println(month.getText());
        }

    }
    @Test
    public void VerifiedSelected() throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

       Select monthList=new Select(driver.findElement(By.id("month")));

       String actualSelection=monthList.getFirstSelectedOption().getText();
        System.out.println("actualSelection= "+ actualSelection);

        Assert.assertEquals(actualSelection,"November");

        Thread.sleep(1000);

        monthList.selectByIndex(0);
        actualSelection=monthList.getFirstSelectedOption().getText();
        System.out.println("actualSelection= "+ actualSelection);
        Assert.assertEquals(actualSelection,"January");

        Thread.sleep(1000);
        monthList.selectByValue("1");
        actualSelection=monthList.getFirstSelectedOption().getText();
        System.out.println("actualSelection= "+ actualSelection);

        Assert.assertEquals(actualSelection,"February");

        Thread.sleep(1000);
        monthList.selectByVisibleText("April");
        actualSelection=monthList.getFirstSelectedOption().getText();
        System.out.println("actualSelection= "+ actualSelection);
        Assert.assertEquals(actualSelection,"April");



    }

}
