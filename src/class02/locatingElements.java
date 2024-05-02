package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatingElements {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com/");

        driver.findElement(By.id("email")).sendKeys("Mohamed");
        driver.findElement(By.name("pass") ).sendKeys("214587236589");

      //  driver.findElement(By.linkText("Create new account")).click();



        //click on forgotten password
        driver.findElement(By.partialLinkText("password?")).click();


    }
}
