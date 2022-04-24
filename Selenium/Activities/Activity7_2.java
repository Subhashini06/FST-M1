package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity7_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //Open browser
        driver.get("https://training-support.net/selenium/dynamic-attributes");

        //Get the page title and print it to the console
        String title = driver.getTitle();
        System.out.println("Page title: " + title);

        WebElement username = driver.findElement(By.xpath("//input[contains(@class, '-username')]"));
        WebElement password = driver.findElement(By.xpath("//input[contains(@class, '-password')]"));
        WebElement confirmPassword = driver.findElement(By.xpath("//label[text()='Confirm Password']/following::input"));
        WebElement email = driver.findElement(By.xpath("//input[starts-with(@class, 'email')]"));

        username.sendKeys("admin");
        password.sendKeys("password");
        confirmPassword.sendKeys("password");
        email.sendKeys("abc@example.com");

        driver.findElement(By.xpath("//button[contains(text(), 'Sign Up')]")).click();

        //Print login message
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message: " + loginMessage);

        //Close browser
        driver.close();


    }
}
