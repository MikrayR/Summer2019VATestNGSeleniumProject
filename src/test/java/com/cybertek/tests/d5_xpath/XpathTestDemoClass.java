package com.cybertek.tests.d5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathTestDemoClass {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        //absolute xpath starts with html(from parent)until last child
        WebElement link=driver.findElement(By.xpath("/html/body/div/div/div/div/h3"));

        //relative xpath starts with double slashes uses parent/child relationship
       // WebElement link=driver.findElement(By.xpath("//li/a"));
        //find any h3 element
       // WebElement link=driver.findElement(By.xpath("//h3"));
        // use formulaE[@A='t']
        // WebElement link=driver.findElement(By.xpath("//button[@onclick='button1()']"));
        //certain element with exact text E[.='t']   E--for tag
        // WebElement link=driver.findElement(By.xpath("//button[.='Button 1']"));
        // certain element with Partial text E[contains9text(),'t']
        //any element //*[.='t']
        //any element with contains we can take partial element //*[contains(text(),'t')]
        //any element keep changing it text after first value //button[starts-with(@id,'button_')]
        //any element keep changing it text with endes with   //E[ends-with(@A,'t']
        // find element with index number find relationship //E[1]
        System.out.println(link.getText());
    }
}
