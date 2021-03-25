package CMCadmintest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import CMC.base.testbase;
import CMC.pages.Homepage;
import CMC.pages.Loginpage;

public class Homepagetest extends testbase {
	Homepage homepage;
	
	public Homepagetest()
	{
		super ();
	}
	@BeforeMethod
	public void setup() {
	initialization();
	Loginpage logpage=new Loginpage();
	homepage=logpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void verifyhomepage() {
		String Actualtitle=homepage.verifytitle();
		String Expectedtitle="Smart Hospital Management System";
		Assert.assertEquals(Actualtitle, Expectedtitle);
		Assert.assertTrue(homepage.label());
		
		
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	

}
