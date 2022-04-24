package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity6_1 {
    public static void main(String[] args) {
        //Create Webdriver Instance
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait;

        //Launch the browser
        driver.get("https://training-support.net/selenium/dynamic-controls");
        //Get the page title and print it to the console
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String title = driver.getTitle();
        System.out.println("Page title: " + title);

        //Find checkbox and toggle button
        WebElement checkboxInput = driver.findElement(By.xpath("//div[@id='dynamicCheckbox']/input"));
        WebElement toggleCheckbtn = driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));
        toggleCheckbtn.click();

        //Wait for checkbox to disappear
        wait.until(ExpectedConditions.invisibilityOf(checkboxInput));

        //Click toggle button again
        toggleCheckbtn.click();

        //Wait for checkbox to appear
        wait.until(ExpectedConditions.visibilityOf(checkboxInput));
        checkboxInput.click();

        //Close browser
        driver.close();

    }
}
