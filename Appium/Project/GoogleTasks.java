package activities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class GoogleTasks {
    private AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    @BeforeClass
    public void beforeClass() throws MalformedURLException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "<device name>");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.google.android.apps.tasks");
        caps.setCapability("appActivity", ".ui.TaskListsActivity");
        caps.setCapability("noReset", true);

        // Instantiate Appium Driver
        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<>(appServer, caps);
        wait = new WebDriverWait(driver, 25);
    }

    @Test
    public void addTasks() {
        // Wait for app to load
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Create new task")));

        // Click on add new task button
        driver.findElementByAccessibilityId("Create new task").click();

        // Wait for fields to load
        //wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.EditText[@text='New Task']")));

        // Find the new Task
        MobileElement newTask1 = driver.findElementByXPath("//android.widget.EditText[@text='New task']");
        // Enter the text in the fields
        newTask1.sendKeys("Complete Activity with Google Tasks");
        // Save the contact
        driver.findElementById("add_task_done").click();

        // Click on add new task button
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Create new task")));

        driver.findElementByAccessibilityId("Create new task").click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                MobileBy.xpath("//android.widget.EditText[@text='New task']")));

        // Find the new Task
        MobileElement newTask2 = driver.findElementByXPath("//android.widget.EditText[@text='New task']");
        // Enter the text in the fields
        newTask2.sendKeys("Complete Activity with Google Keep");
        // Save the contact
        driver.findElementById("add_task_done").click();

        // Click on add new task button
        wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Create new task")));

        // Click on add new task button
        driver.findElementByAccessibilityId("Create new task").click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                MobileBy.xpath("//android.widget.EditText[@text='New task']")));

        // Find the new Task
        MobileElement newTask3 = driver.findElementByXPath("//android.widget.EditText[@text='New task']");
        // Enter the text in the fields
        newTask3.sendKeys("Complete the second Activity Google Keep");
        // Save the contact
        driver.findElementById("add_task_done").click();

        // Wait for task to appear
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.LinearLayout[@content-desc=\"My Tasks\"]")));

        // Assertion
        MobileElement mobileCard = driver.findElementByXPath("//android.widget.LinearLayout[@content-desc=\"My Tasks\"]");
        Assert.assertTrue(mobileCard.isDisplayed());

        //String taskName = driver.findElementById("task_name").getText();


        List<MobileElement> taskName = driver.findElementsById("task_name");
        System.out.println("Number of tasks currently: " + taskName.size());
        assertEquals(taskName.size(), 3);

        for(WebElement tasks :  taskName) {
            String actualResult = tasks.getText();
            System.out.println("actualResult:" + actualResult);
            assertEquals(actualResult, "Complete Activity with Google Keep");

        }



    }


}
