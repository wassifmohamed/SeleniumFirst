package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class tagName {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");

        List<WebElement> tags=driver.findElements(By.tagName("a"));
        //in order tp print
        // we need to itrerat
         for (WebElement tag:tags){
            String  link= tag.getAttribute("href");
             System.out.println(link);
         }

    }
}
