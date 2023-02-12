package object;

import org.openqa.selenium.By;

import resources.Base;

public class Successful_login extends Base{
	 private By linkText=By.linkText("Edit your account information");
	 public Boolean verify() {
		return driver.findElement(linkText).isDisplayed();
	}
}
