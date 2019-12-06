package com.cybertek.tests.d6_css;

import org.testng.annotations.*;

public class BeforeAfterTests {


    @Test
    public void tests1(){
        System.out.println("this is test one");
    }
    @Test
    public void tests2(){
        System.out.println("this is test two");
    }

    @BeforeMethod
    public void setupMethod(){
        System.out.println("Before method");
        System.out.println("Opening Chrome");
    }
    @AfterMethod
    public void teardownMethod(){
        System.out.println("After method");
        System.out.println("Closing Chrome");

    }

    @BeforeClass
    public void setupClass(){
        System.out.println("Before Class: Running Only One Time");
    }
    @AfterClass
    public void teardownClass(){
        System.out.println("After Class: Running Only One Time");
    }
}
