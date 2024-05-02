package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsexecutor {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        //fill out username
        WebElement username =driver.findElement(By.xpath("//input[@name='txtUsername']"));
        username.sendKeys("admin");

            //  to highlight the username box
            JavascriptExecutor js=(JavascriptExecutor) driver;
            //2.execute scripts
            js.executeScript("arguments[0].style.border='5px dotted blue'", username);



        //        find the WebElement
        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
       //click the login button
        js.executeScript("arguments[0].click();",loginBtn);

    }
}
