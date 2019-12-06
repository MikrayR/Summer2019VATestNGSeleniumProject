package com.cybertek.tests.Practice1;
// selenium part starts here
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// selenium part
public class authentication {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();   // opening new window
        driver.get("http://google.com/");
//        System.out.println(driver.getTitle());
//        driver.findElement(By.name("q")).sendKeys("Uyghur music" + Keys.ENTER);

         Thread.sleep(3000);
         driver.navigate().to("https://cybertekschool.okta.com");
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("[//*[@id=\"form1\"]/div[1]/div[2]/div[1]/div[1]")).sendKeys("Kitap");

        System.out.println(driver.getTitle());

    }
}
