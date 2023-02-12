package Work.testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import listener.TestListener;
import object.Login;
import utlities.ReadXl;


/*@Listeners(TestListener.class)*/
public class MyWork extends Base{
	@BeforeMethod
	public void work() {
		onstart();
	}
	
	
	@Test(dataProviderClass =ReadXl.class,dataProvider = "provide")
	public void login(String mail, String passward) throws Exception {
		
		Login page1 = new Login(driver);
		page1.EnterMail(mail);
		page1.EnterPasswasrd(passward);
		page1.submit();
		Assert.assertEquals(false,true);
		driver.quit();
	}
	
}
