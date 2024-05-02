package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        //        create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
//        max the window
        driver.manage().window().maximize();

//        goto syntaxprojects.com
        driver.get("http://www.uitestpractice.com/Students/Switchto");
//  switch to the iframe which contains the input box
//        method :  by index
        driver.switchTo().frame(0);
//        this statement will shift the focus to the first  frame

        WebElement textBox = driver.findElement(By.xpath("//input[@id='name']"));
//        send some text
        textBox.sendKeys("abracadabra");

//        get the text  click on from parent window
        driver.switchTo().defaultContent();

//        find the text
        WebElement text = driver.findElement(By.xpath("//h3"));
        System.out.println("the text is "+text.getText());
//
//        get the text enter name in iframe
        driver.switchTo().frame("iframe_a");

        WebElement getLabel = driver.findElement(By.xpath("//label"));
        System.out.println("the label is :  "+getLabel.getText());

//        switch focus to the main page
        driver.switchTo().defaultContent();

//        3 Method switch to an iframe using WebElment
//        clear what ever is written in the text box
        WebElement frame1 = driver.findElement(By.xpath("//iframe[@name='iframe_a']"));
        driver.switchTo().frame(frame1);
        textBox.clear();


    }
}
