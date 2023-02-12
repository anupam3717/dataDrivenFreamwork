package test;



import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.apache.log4j.LogManager;
import  org.apache.log4j.Logger;
import listener.TestListener;
import object.LoginObject;
import object.Successful_login;
import resources.Base;
import utlities.ReadXl;
@Listeners(TestListener.class)
public class Login extends Base {
    @BeforeMethod
    public void launch() throws Exception {
    	initialize();
    	String address = prop.getProperty("address");
		driver.get(address);
    }
    
    @Test(dataProviderClass =ReadXl.class,dataProvider = "provide")
	public void login(String mail, String passward) throws Exception {
    	 Logger log= LogManager.getLogger("Login");
		//login
    	log.info("started");
    	LoginObject page1= new LoginObject();
		page1.EnterMail(mail);
		page1.EnterPasswasrd(passward);
		page1.submit();
		//checking
		Successful_login account=new Successful_login();
		Assert.assertTrue(account.verify());
		
	}
    @AfterMethod
    public void quit() {
    	driver.quit();
	}
}
