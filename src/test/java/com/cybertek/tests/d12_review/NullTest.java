package com.cybertek.tests.d12_review;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
// in this test we want to check we only can declare variable one time if we declare second time then even two variable have a same name
// but their value will not be same example:  in the below
public class NullTest {
    //declare string variable
    String string;

    @BeforeMethod
    public void setupMethod() {

        //String string="AAA"; this second declaring string if we use this we will get different value of string; one is null value; one is AAA value
        //assign string variable with the value
        string = "AAA";
    }


    @Test
    public void test() {
        System.out.println(string.toLowerCase());
    }


}