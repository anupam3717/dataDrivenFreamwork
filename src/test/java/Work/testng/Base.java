package Work.testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
        public static WebDriver driver;
        
        public static void onstart() {
        	driver = new ChromeDriver();
    		driver.manage().window().maximize();
    		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    		driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
        }
}
