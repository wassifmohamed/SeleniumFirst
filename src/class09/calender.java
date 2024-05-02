package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class calender {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.delta.com/");

        // get the calendar
        WebElement calenderBtn=driver.findElement(By.xpath("//div[@role='button']"));
        calenderBtn.click();
         // get the month from the calendar
        WebElement month = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']"));
        //get the next  button
        WebElement next = driver.findElement(By.xpath("//span[text()='Next']"));

        //click on next button until you find the right month
        boolean isFound=false;

        while (!isFound){

           String month_ = month.getText();
           if (month_.equalsIgnoreCase("August")){
               // select the day
               List<WebElement> days=driver.findElements(By.xpath("//table[@class='dl-datepicker-calendar']/tbody/tr/td"));
               for (WebElement day:days){
                   String day_text = day.getText();
                   if (day_text.equalsIgnoreCase("20")){
                       day.click();
                       isFound=true;
                       break;
                   }
               }

           }
           else {
               next.click();
           }
        }




    }
}
