package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");

        String title = driver.getTitle();
        System.out.println("Page title: " +title);

        //Find the third header
        String third_header = driver.findElement(By.xpath("//h3[@id='third-header']")).getText();
        System.out.println("Third header title: " +third_header);

        //Find the fifth header and get it's colour
        String fifth_header = driver.findElement(By.xpath("//h5")).getCssValue("color");
        System.out.println("Fifth header title: " +fifth_header);

        //Find the violet button and print it's classes
        String btnViolet = driver.findElement(By.xpath("//button[@class='ui violet button']")).getAttribute("class");
        System.out.println("Violet button: " +btnViolet);

        //Find the grey button with Absolute XPath
        String btnGrey = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
        System.out.println("Grey button: " +btnGrey);

        //Close the browser
        driver.close();

    }
}
