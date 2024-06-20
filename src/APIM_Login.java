import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class APIM_Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Documents\\Ngan\\Testing\\Automation Testing\\Java Selenium\\Setup\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		try {

			driver.get("http://223.130.162.247/");
			Thread.sleep(3000);

			WebElement loginPageBtn = driver.findElement(By.xpath(
					"//button[@class=\"MuiButtonBase-root MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeMedium MuiButton-outlinedSizeMedium MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeMedium MuiButton-outlinedSizeMedium css-1jy3pn1\"]"));
			loginPageBtn.click();
			Thread.sleep(3000);

			driver.findElement(By.xpath("//input[@placeholder=\"아이디\"]")).sendKeys("portaladmin1");
			Thread.sleep(3000);

			WebElement nextBtn = driver.findElement(By.xpath(
					"//button[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeLarge MuiButton-containedSizeLarge MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeLarge MuiButton-containedSizeLarge css-k8a6i9\"]"));
			nextBtn.click();
			Thread.sleep(3000);

			driver.findElement(By.xpath("//input[@placeholder=\"비밀번호\"]")).sendKeys("abc123!@#");
			Thread.sleep(3000);

			WebElement loginBtn = driver.findElement(By.xpath(
					"//button[@class=\"MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeLarge MuiButton-containedSizeLarge MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeLarge MuiButton-containedSizeLarge css-k8a6i9\"]"));
			loginBtn.click();
			Thread.sleep(3000);

			boolean dashBoardText = driver.findElement(By.xpath("//span[contains(text(),'대시보드 홈')]")).isDisplayed();
			if (dashBoardText) {
				System.out.print("Dashboard");
			}

			Thread.sleep(3000);

		} catch (Exception e) {
			System.out.print("Some thing went wrong");
			e.printStackTrace();
		} finally {
			// Close the browser
			driver.quit();
		}
	}

}
