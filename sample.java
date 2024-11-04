import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchTest {

    public static void main(String[] args) {
        // Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        
        // Create instance of WebDriver (Chrome in this case)
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to Google's homepage
            driver.get("https://www.google.com");

            // Locate the search box element
            WebElement searchBox = driver.findElement(By.name("q"));

            // Enter search query into the search box
            searchBox.sendKeys("Selenium WebDriver");

            // Submit the search form
            searchBox.submit();

            // Wait for the results to load and display the title
            Thread.sleep(2000); // You can use WebDriverWait for better handling

            // Print the title of the current page
            System.out.println("Page title is: " + driver.getTitle());

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
}
