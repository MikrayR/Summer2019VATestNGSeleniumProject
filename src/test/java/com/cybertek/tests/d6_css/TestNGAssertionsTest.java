package com.cybertek.tests.d6_css;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestNGAssertionsTest {
    //this will fail
    @Test
    public void test1(){
        System.out.println("first assertion");
        Assert.assertEquals("one", "One");

        System.out.println("second assertion");
        Assert.assertEquals(1, 1);

    }

    @Test
    public void test2(){
        Assert.assertNotEquals("one", "two");
    }

    @Test
    public void test3(){
        String expectedTitle="Cbt";
        String actualTitle="Cbt";
        Assert.assertTrue(expectedTitle.startsWith(actualTitle));
        Assert.assertTrue("ma@cbt.com".contains("@"));
       // Assert.assertTrue(true);
        Assert.assertTrue(1>0);
       // System.out.println("1==1");
    }

    @Test
    public void test4(){
        Assert.assertFalse(1<0);
    }

    @Test
    public void test5(){
       // Assert.assertEquals("Cbt", "Ccbt", "Title did not match");
        Assert.assertTrue("mila@gmail.com".contains("@"),"All emails must contain @sign");
    }

    @Test
    public void teardownMethod(){
        System.out.println("close chrome");
    }

}


