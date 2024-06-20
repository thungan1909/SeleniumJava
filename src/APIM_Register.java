import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class APIM_Register {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Documents\\Ngan\\Testing\\Automation Testing\\Java Selenium\\Setup\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		try {
			driver.get("http://223.130.162.247/");

		} catch (Exception e) {
			System.out.print("Some thing went wrong");
			e.printStackTrace();
		} finally {
			// Close the browser
			driver.quit();
		}
	}
}
