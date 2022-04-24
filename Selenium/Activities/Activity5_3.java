package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {
    public static void main(String[] args) {
        //Create Webdriver Instance
        WebDriver driver = new FirefoxDriver();

        //Launch the browser
        driver.get("https://training-support.net/selenium/dynamic-controls");
        //Get the page title and print it to the console
        String title = driver.getTitle();
        System.out.println("Page title: " + title);

        //Find the textbox
        WebElement textInput = driver.findElement(By.xpath("//input[@type='text']"));
        System.out.println("The textbox Input is displayed: " + textInput.isEnabled());

        //Click the checkbox to select it
        driver.findElement(By.id("toggleInput")).click();

        System.out.println("The textbox Input is displayed: " + textInput.isEnabled());

        //Close the browser
        driver.close();
    }
}
