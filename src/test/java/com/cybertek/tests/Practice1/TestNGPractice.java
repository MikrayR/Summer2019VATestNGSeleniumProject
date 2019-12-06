package com.cybertek.tests.Practice1;

import net.bytebuddy.implementation.bytecode.Throw;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

public class TestNGPractice {

    @BeforeClass
    public void beforeClass(){
        System.out.println("this annotation runs first and only once");
    }

    @BeforeMethod
    public void setUp(){
        System.out.println("this annotation runs once before each test method");
    }

    @Test(priority = 2)
    public void Test1(){
        String str1="cybertek";
        String str2="cyberteK";
        System.out.println("Test1");
        Assert.assertEquals(str1, str2);
    }
    @Test(priority = 3)
    public void Test2(){

        System.out.println("Test2");
        Assert.assertTrue(10%2>20/10);

    }

    @Test(priority = 1)
    public void Test3(){
        System.out.println("Test3");
        Assert.assertTrue(100%20==10%2);
        throw new SkipException("need to check later");
    }
    @AfterMethod
    public void tearDown(){
        System.out.println("this annotation runce once after every test method");
    }
    @AfterClass
    public void TearDown(){
        System.out.println("this annotation runs once at the end and only once");
    }

}
