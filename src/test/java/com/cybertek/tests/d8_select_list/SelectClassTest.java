package com.cybertek.tests.d8_select_list;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SelectClassTest {
    //this works with drop down list
    @Test
    public void printAllOptions(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

        // select---> html tag that is used for dropdown lists
        //in selenium we use the Select classs to deal with those elment select tag.
        //Select onlly works with select tag
        // how to use select class:
        // 1.make sure the dropdown uses the select tag.
        //2. locate the element with the select tag
        //3. create select object by passing the element from step 2 as constructor
        //select class requires a constructor of type web element . that element must have tag name

        //locate the element with the select tag
        WebElement element=driver.findElement(By.id("state"));

        //Create Select object by passing the elemnet from step 2 as constructor
        Select stateList=new Select(element);

        //returns all the available options from the dropdown list
       // getOptions();  //returns all the available options from the dropdown list

        List<WebElement> options=stateList.getOptions();

        for (WebElement option : options) {
            System.out.println(option.getText());

        }

    }

    @Test
        public void selectAndVerifySelected() throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/dropdown");

        //create a select object
        //1 locate the webelement with the selct tag
        //crate Select class object by passing that webelement as a constructor

       Select stateList=new Select(driver.findElement(By.id("state")));
//
//        //verify that by deafault Select a State is selected
//
//        //stateList.getFirstSelectedOption();   this returns WebElement
//        //getFirstSelectedOption.get.Text()---> returns the text of what is currently selected

        String actualSelection=stateList.getFirstSelectedOption().getText();

        System.out.println("actualSelection= "+ actualSelection);

       Assert.assertEquals(actualSelection,"Select a State");
//
//        //Select
        Thread.sleep(1000);
//
// Select using visible text
//        //selectByvisible text--> selects using the visible text

        stateList.selectByVisibleText("Ohio");

      actualSelection=stateList.getFirstSelectedOption().getText();

      Assert.assertEquals(actualSelection,"Ohio");


        Thread.sleep(1000);
//      //Select using index
//        //selcetByIndex--> selecats using the index of the option, cont starts from 0
        stateList.selectByIndex(51);

        actualSelection=stateList.getFirstSelectedOption().getText();

        Assert.assertEquals(actualSelection,"Wyoming");

        Thread.sleep(1000);

        // Select by value
       //selectByValue()--> selects by the value of the value attribute

        stateList.selectByValue("DC");
        actualSelection=stateList.getFirstSelectedOption().getText();
        Assert.assertEquals(actualSelection,"District Of Columbia");




    }

}
