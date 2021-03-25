package CMCadmintest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import CMC.base.testbase;
import CMC.pages.Frontofficepage;
import CMC.pages.Homepage;
import CMC.pages.Loginpage;

public class Frontofficepagetest extends testbase {
	Frontofficepage frontofficepage;
	Homepage hpg;
	Loginpage logg;
	public Frontofficepagetest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		 logg = new Loginpage();
		hpg = logg.login(prop.getProperty("username"), prop.getProperty("password"));
		frontofficepage=hpg.clickfrontoffice();
	}
	@Test
	public void frontofficetest()
	{
		
		frontofficepage=hpg.clickfrontoffice();
	}

	@Test
	public void verifyfrontoffice() {
		
		Assert.assertTrue(frontofficepage.label());
		

	}
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}
	

}
