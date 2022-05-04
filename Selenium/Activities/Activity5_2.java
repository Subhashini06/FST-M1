package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {
    public static void main(String[] args) {
        //Create Webdriver Instance
        WebDriver driver = new FirefoxDriver();

        //Launch the browser
        driver.get("https://training-support.net/selenium/dynamic-controls");
        //Get the page title and print it to the console
        String title = driver.getTitle();
        System.out.println("Page title: " + title);

        //Find the checkbox
        WebElement checkboxInput = driver.findElement(By.xpath("//input[@type='checkbox']"));
        System.out.println("The checkbox Input is displayed: " + checkboxInput.isSelected());

        //Click the checkbox to select it
        checkboxInput.click();

        System.out.println("The checkbox Input is displayed: " + checkboxInput.isSelected());

        //Close the browser
        driver.close();
    }


}