package com.cybertek.tests.VyTrak;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Vytrack shortcut functionality
 * 1. Open browser
 * 2. Go to Vytrack login page
 * 3. Login as a sales manager
 * 4. Verify Dashboard page is open
 * 5. Click on Shortcuts icon
 * 6. Click on link See full list
 * 7. Click on link Opportunities
 * 8. Verify Open opportunities page is open
 * 9. Click on Shortcuts icon
 * 10. Click on link See full list
 * 11. Click on link Vehicle Service Logs
 * 12. Verify error message text is You do not have permission to perform this action.
 * 13. Verify Shortcut Actions List page is still open
 */

public class VyTrakShortCutFuctionality {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://qa2.vytrack.com");
        driver.manage().window().maximize();
        driver.findElement(By.name("_username")).sendKeys("storemanager67");
        driver.findElement(By.name("_password")).sendKeys("UserUser123");
        driver.findElement(By.name("_submit")).click();

        String expectTitle = "Dashboard";
        String actualTitle = driver.getTitle();
        if(actualTitle.equals(expectTitle)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }

       // System.out.println(actualTitle);
        Thread.sleep(3000);
        WebElement shortcut=driver.findElement(By.xpath("//i[@class='fa-share-square']"));
        shortcut.click();
        Thread.sleep(3000);
        WebElement fullList=driver.findElement(By.xpath("//a[.='See full list']"));
        fullList.click();
        Thread.sleep(3000);
        WebElement OppurLink=driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/div/table/tbody/tr[21]/td[1]/a"));
        OppurLink.click();
        String link=OppurLink.getText();
        System.out.println("Oppurtinity Page is open= "+link);
//
//
//        WebElement Fleetbutton=driver.findElement(By.xpath("(//span[@class='title title-level-1'])[2]"));
//        Fleetbutton.click();
//        Thread.sleep(3000);
//        WebElement vehicleServiceLog=driver.findElement(By.linkText("Vehicle Services Logs"));
//        vehicleServiceLog.click();
//        Thread.sleep(3000);
//        WebElement errorMassage=driver.findElement(By.xpath("//div[@class=\"message\"]"));
//        String Massage=errorMassage.getText();
//        System.out.println("Error Massage: "+Massage);

        //driver.close();

    }


}
