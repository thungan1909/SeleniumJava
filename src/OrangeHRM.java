 
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Documents\\Ngan\\Testing\\Automation Testing\\Java Selenium\\Setup\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		SET thời gian chờ cho tất cả
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		try {
			// Open the target webpage
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		    driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("Admin");
		    driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("admin123");
		    driver.findElement(By.xpath("//button[normalize-space()=\"Login\"]")).click();

		} catch (Exception e) {
			System.out.print("Some thing went wrong");
			e.printStackTrace();
		} finally {
			// Close the browser
//			driver.quit();
		}
	}

}
