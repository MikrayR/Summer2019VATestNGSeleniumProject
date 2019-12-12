package com.cybertek.tests.Practice1.HW_Wiki;


import com.cybertek.tests.TestBase;
import com.cybertek.utilities.Driver;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/**
 * Wiki assignment
 * 1. Go to https://www.wikipedia.org/
 * 2. Enter redsox
 * 3. Wait until all the search suggestions load
 * 4. Verify that there are more that 1 search suggestions
 * 5. Verify that first search suggestion starts with text Boston Red Sox
 * 6. Create a summary that includes that show when the test started, ended and how long it took.
 * It can be printed in console or some external report. You can use any tools.
 */
public class RedSox extends TestBase {

    int expectedSize;
    int actualSize;

    @Test
    public void RedSoxTest(){

        extentLogger=report.createTest("Test wikipedia search box");
        extentLogger.info("Go to http://www.vikipedia.org/");
        driver.get("https://www.wikipedia.org/");

        extentLogger.info("Enter redsox");
       // WebElement element=driver.findElement(By.className(""))


    }

}
