package com.cybertek.tests.Practice1.HomeWorkTestCases;


import com.cybertek.tests.TestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**  Test case#1
 * Step 1. Go to “http://practice.cybertekschool.com”
 * Step 2. Click on “Registration Form”
 * Step 3. Enter “wrong_dob” into date of birth input box.
 * Step 4. Verify that warning message is displayed: “The date of birth is not valid”
 */

public class RegistrationForm extends TestBase {


   @Test
    public void DOBverification(){
        extentLogger=report.createTest("Test Verify DOB");
        extentLogger.info("go to cybertekherokuapp");
        driver.get("http://practice.cybertekschool.com");
    }


}
