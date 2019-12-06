package com.cybertek.tests.d11_file_upload_actions_class;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
 public class FileUploadTest {

     /**
      * Class Notes:
      * File download —> in using selenium we cannot verify the contents of the downloaded files. We can go to some websites,
      * click on links to download files using selenium. But we cannot verify the content.
      * Using java + other libraries we can verify if file exists, and we can verify the contents.
      * File Uploading:
      * To upload file manually we have 2 steps
      * 1. Click on button which opens file explorer using which we choose some file
      * 2. Click another button which completes the uploading
      * To upload file with selenium we have 2 steps
      * 1. We provide path to file which we want to the browser button using sendKeys()
      * method
      * 2. Click another button which completes the uploading
      * HOW TO GET THE FILE PATH:
      * MAC
      * 1. Right click on file
      * 2. Hold option key
      * 3. Select option Copy ..... as Pathname
      * WINDOWS
      * 1. Hold shift button
      * 2. Right click on the file 3. Copy as path
      * When we provide wrong file path, it throws InvalidArgumentException exception.
      * Create resources
      * 1. Right click on test
      * 2. New —> Directory 3. Name: resources 4. OK
      * Create test file
      * 1. Right click on resources
      * 2. New —> File
      * 3. Name; test_file.txt
      * 4. OK
      * What if I cannot upload a file with selenium ?
      * New use Robot class, AutoIT, Sikuli. These tools are used to automate the desktop apps
      */
     WebDriver driver;

     @BeforeMethod
     public void setupMethod() {
         driver = WebDriverFactory.getDriver("chrome");
     }

     @AfterMethod
     public void teardownMethod() throws InterruptedException {
         Thread.sleep(2000);
         // driver.quit();
     }

     /**
      * go to website http://practice.cybertekschool.com/upload
      * upload file
      * click upload
      * verify file name is displayed in the next page
      */

     @Test
     public void test() throws InterruptedException {
         driver.get("http://practice.cybertekschool.com/upload");

         //  Thread.sleep(2000);
         driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("/Users/mikrayrahman/Desktop/file.txt");
         driver.findElement(By.id("file-submit")).click();

         String actual = driver.findElement(By.id("uploaded-files")).getText();
         System.out.println("actual Text: " + actual);
         Assert.assertEquals(actual, "file.txt");
     }

     @Test
     public void test2() {
         driver.get("http://practice.cybertekschool.com/upload");
         String projectPath = System.getProperty("user.dir");

         // location of the file within the project
         String relativePath = "/src/test/resources/test_file.txt";
         // location of the file within the project
         String fullPath = projectPath + relativePath;

         driver.findElement(By.id("file-upload")).sendKeys(fullPath);
         driver.findElement(By.id("file-submit")).click();
         String actual = driver.findElement(By.id("uploaded-files")).getText();
         System.out.println("actual Text: "+actual);
         Assert.assertEquals(actual, "test_file.txt");

     }


 }
