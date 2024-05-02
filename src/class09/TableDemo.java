package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TableDemo {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        // create an instance of Web driver

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //  go to the website
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        //fill out username
        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");
        //fill out password
        driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");

        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']")).click();
// get the id 91004A and click on the checkbox
        // in order to find the desire id
        boolean idfound = false;
        while (!idfound) {

            List<WebElement> ids = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));

            for (int i = 0; i < ids.size(); i++) {
                String id = ids.get(i).getText();

                if (id.equalsIgnoreCase("91004A")) {

                    System.out.println("id is on the row " + i);
                    // to click on the particular checkbox
                    WebElement checkBox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (i+1) + "]/td[1]"));
                    checkBox.click();
                    idfound = true;
                    break;

                }
            }
            // click on the next page

            if (!idfound) {
                WebElement nextBtn = driver.findElement(By.xpath("//a[text()='Next']"));
                nextBtn.click();


            }
        }
    }
}