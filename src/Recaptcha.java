import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Recaptcha {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Documents\\Ngan\\Testing\\Automation Testing\\Java Selenium\\Setup\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();


        try {
            // Open the target webpage
            driver.get("https://www.google.com/recaptcha/api2/demo");

            // Wait for the iframe to be present and switch to it
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement recaptchaFrame = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[@title='reCAPTCHA']")));
            driver.switchTo().frame(recaptchaFrame);

            // Wait for the reCAPTCHA checkbox to be clickable and click it
            WebElement recaptchaCheckbox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='recaptcha-checkbox-border']")));
            recaptchaCheckbox.click();

            // Add any additional steps you need here
            


            // Switch back to the default content
            driver.switchTo().defaultContent();

            // Wait for a while to observe the behavior
            Thread.sleep(15000);

        } catch (Exception e) {
        	System.out.print("Some thing went wrong");
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
	}
}
