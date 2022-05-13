package activities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import java.net.MalformedURLException;
import java.net.URL;

public class GoogleKeep {

    private AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    @BeforeClass
    public void beforeClass() throws MalformedURLException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "<device name>");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.google.android.keep");
        caps.setCapability("appActivity", ".activities.BrowseActivity");
        caps.setCapability("noReset", true);

        // Instantiate Appium Driver
        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<>(appServer, caps);
        wait = new WebDriverWait(driver, 25);

    }

    @Test
    public void addNotes() {
        // Wait for app to load
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.id("new_note_button")));

        // Click on add new task button
        driver.findElementById("new_note_button").click();

        // Find the new Task
        driver.findElementById("editable_title").click();
        driver.findElementById("editable_title").sendKeys("Testing1");
        driver.findElementById("edit_note_text").click();
        driver.findElementById("edit_note_text").sendKeys("Desc");
        // Click Back button
        driver.navigate().back();
        driver.navigate().back();
        System.out.print(driver.findElementById("index_note_title").getText());
        System.out.print(driver.findElementById("index_note_text_description").getText());
        assertEquals(driver.findElementById("index_note_title").getText(), "Testing1");

    }
}
