package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");
        //Check the title of the page
        String title = driver.getTitle();
        //Print the title of the page
        System.out.println("Page title: " + title);

        //Find the "Get Started!" link and click it
        driver.findElement(By.xpath("//a[contains(text(), 'About Us')]")).click();

        //Print title of new page
        System.out.println("Page title: " + driver.getTitle());

        //Close the browser
        driver.close();

    }
}
