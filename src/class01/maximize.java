package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximize {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver= new ChromeDriver();

        driver.get("https://www.google.com/");
        //maximize
        driver.manage().window().maximize();
        //full screen
        driver.manage().window().fullscreen();
        //close
        driver.close();





    }
}
