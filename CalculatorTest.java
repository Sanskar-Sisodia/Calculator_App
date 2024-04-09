import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculatorTest {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
    	System.getProperty("webdriver.chrome.driver","C:/Users/sansk/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the file path of the HTML file
        driver.get("file:///C:/calculator/index.html");

        // Find input fields and buttons
        WebElement input1 = driver.findElement(By.id("num1"));
        WebElement input2 = driver.findElement(By.id("num2"));
        WebElement addButton = driver.findElement(By.xpath("//button[contains(text(), 'Add')]"));
        WebElement resultField = driver.findElement(By.id("result"));

        // Enter values into input fields
        input1.sendKeys("10");
        input2.sendKeys("5");

        // Click the "Add" button
        addButton.click();

        // Get the result value
        String result = resultField.getAttribute("value");

        // Verify if the result is correct
        if (result.equals("15")) {
            System.out.println("Test Passed! Result is correct.");
        } else {
            System.out.println("Test Failed! Result is incorrect.");
        }

        // Close the browser
        driver.quit();
    }
}
