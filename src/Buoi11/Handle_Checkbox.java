package Buoi11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Initialization.Init;

public class Handle_Checkbox extends Init {

	public static void checkSuccessMsg() {
		WebElement successMsg = driver.findElement(By.xpath("//div[@id='txtAge']"));
		if (successMsg.isDisplayed()) {
			System.out.print(successMsg.getText());
		}
	}

	public static void handleClickCheckBox(WebElement Checkbox, Boolean isCheckSuccessMsg) {
		Boolean isSelected = Checkbox.isSelected();

		if (isSelected) {
			System.out.print("Clicked");
		} else {
			System.out.print("Not click\n");
			Checkbox.click();

			if (isCheckSuccessMsg)
				checkSuccessMsg();
		}
	}

	public static void handleCheckAll() throws Exception {
		/* 2. CHECKBOX ALL */
		WebElement CheckAllBtn = driver.findElement(By.xpath("//input[@value=\"Check All\"]"));
		Thread.sleep(2000);

		if (CheckAllBtn.isDisplayed() && CheckAllBtn.getAttribute("value").equals("Check All")) {

			CheckAllBtn.click();
		}
	}

	public static void handleCheckEveryCheckBox() {
		/*
		 * We need to get the list checkBox by getting the path of panel 2 => panel body
		 * <div class="panel-body" => path:
		 * //body/div[@id='easycont']/div[1]/div[2]/div[2]/div[2] and add "div" with
		 * "chechBox" attribute after that : /div[@class='checkbox'] EX:
		 * /tagName[@Attribute='value'] Attribute: id, name, class, value, placeholder
		 */

		var CheckboxList = driver.findElements(
				By.xpath("//body/div[@id='easycont']/div[1]/div[2]/div[2]/div[2]/div[@class='checkbox']"));

		for (int i = 1; i <= CheckboxList.size(); i++) {
			WebElement checkBox = driver.findElement(
					By.xpath("//body/div[@id='easycont']/div[1]/div[2]/div[2]/div[2]/div[" + i + "]/label[1]"));

			handleClickCheckBox(checkBox, false);
		}
	}

	public static void handleSigleCheckBox() throws Exception {
		/* 1. CHECKBOX */
		WebElement Checkbox = driver.findElement(By.id("isAgeSelected"));
		Thread.sleep(2000);

		handleClickCheckBox(Checkbox, true);
	}

	public static void handleMultipleCheckBox() throws Exception {
		/* 2. MULTIPLE CHECKBOX */

		// 2.1. Click on 'Check All' to check all checkboxes at once.
		handleCheckAll();

		// 2.2 When you check all the checkboxes, button will change to 'Uncheck All'
		handleCheckEveryCheckBox();

	}

	public static void main(String[] args) throws Exception {
		// SET UP
		Setup();
		driver.navigate().to("http://demo.seleniumeasy.com/basic-checkbox-demo.html");
		handleSigleCheckBox();
		// TEAR DOWN
		TearDown();

	}

}
