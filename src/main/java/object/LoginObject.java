package object;

import org.openqa.selenium.By;
import resources.Base;

public class LoginObject extends Base {
	
     private By email=By.id("input-email");
     private By passwared=By.id("input-password");
     private By submit= By.xpath("//input[@value='Login']");
     
    
     public void EnterMail(String s) {
    	 driver.findElement(email).sendKeys(s);
     }
     
     public void EnterPasswasrd(String s) {
    	 driver.findElement(passwared).sendKeys(s);
     }
     public void submit() {
    	 driver.findElement(submit).click();
     }
     
}
