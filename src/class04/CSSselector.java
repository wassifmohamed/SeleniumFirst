package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselector {
    public static void main(String[] args) throws InterruptedException {



        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");

        //click on create new account using CSSselector

        WebElement createNewBtn = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        createNewBtn.click();
        //sleep statement so that the browser can open up the window which contains the element
        Thread.sleep(2000);

        WebElement firstName=driver.findElement(By.cssSelector("input[name='firstname']"));
        firstName.sendKeys("Mohamed");

    }
}
