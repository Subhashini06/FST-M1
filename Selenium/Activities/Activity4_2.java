package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/simple-form");

        //Get the title of the page
        String title = driver.getTitle();
        System.out.println("Page title: " + title);

        WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
        WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));

        firstName.sendKeys("TestUser");
        lastName.sendKeys("LastUser");

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test@example.com");
        driver.findElement(By.xpath("//input[@id='number']")).sendKeys("9448709876");

        driver.findElement(By.xpath("//input[@class='ui green button']")).click();

    }
}
