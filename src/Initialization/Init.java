package Initialization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Init {

	public static WebDriver driver = null;

	public static void Setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Documents\\Ngan\\Testing\\Automation Testing\\Java Selenium\\Setup\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	public static void TearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}
}
