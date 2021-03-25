package CMCadmintest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import CMC.base.testbase;
import CMC.pages.Loginpage;

public class Loginpagetest extends testbase
{
	
	Loginpage loginpage;
	
	public Loginpagetest() 
	{
	super();	
	}
	
	@BeforeMethod
	public void setup() 
	{
		initialization();
		loginpage=new Loginpage();
	}
	@Test
		public void verifytitle() {
		String Actualtitle=loginpage.verifypagetitle();
		String Expectedtitle="Smart Hospital : Hospital Management System";
		Assert.assertEquals(Actualtitle, Expectedtitle);
		}
	@Test
	public void verifylogo() {
		boolean logo=loginpage.pagelogo(); 
		Assert.assertTrue(logo);
	}
	@Test
	public void logintest() {
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	@AfterMethod
	public void teardown() {
	driver.quit();	
	}
	
	
	

}
