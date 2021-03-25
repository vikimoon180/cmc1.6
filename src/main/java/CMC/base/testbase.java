package CMC.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import CMC.util.WebEventListener;

public class testbase {
	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener webel;

	public testbase() {
		prop = new Properties();
		try {
			FileInputStream ipconfig = new FileInputStream(
					System.getProperty("user.dir") + "./src/main/java/CMC/config/CMC.properties");
			prop.load(ipconfig);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void initialization() {
		String browsername = prop.getProperty("browser");
		if (browsername.equals("chrome"))
			;
		{
			System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
		//Firing event 
	    e_driver=new EventFiringWebDriver(driver);
	    webel =new WebEventListener();
	    e_driver.register(webel);
	    driver=e_driver;
		

	}
	//explicit wait script
	  WebDriverWait wait ;
	//visibility Of Elements
	  public void waitforElementvisible(WebElement el)
	  {
	    wait = new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.visibilityOf(el));
	  }

}
