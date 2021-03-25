package CMCadmintest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import CMC.base.testbase;
import CMC.pages.Frontofficepage;
import CMC.pages.Homepage;
import CMC.pages.Loginpage;
import CMC.pages.Visitorpage;
import CMC.util.ReadExcel;

public class Visitorpagetest extends testbase {
	Visitorpage vstrpage;
	Frontofficepage fopage;
	Homepage hmpage;
	Loginpage lpage;
	String sheetname= "Visitor data";

	public Visitorpagetest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		lpage = new Loginpage();
		hmpage = lpage.login(prop.getProperty("username"), prop.getProperty("password"));
		fopage = hmpage.clickfrontoffice();
		vstrpage = fopage.clickvisitorbook();
	}
	@DataProvider public Object [] [] getVISTestdata(){
		Object data[][]= ReadExcel.getTestData("Visitor data");
		return data;
	}
		
	@Test(dataProvider="getVISTestdata")
	public void addvisitordetails(String args[]) {
		
		Assert.assertTrue(vstrpage.label());
		vstrpage.clickaddscreen();
		Assert.assertTrue(vstrpage.label2());
		vstrpage.clickaddvisitr(args);

	}

	@AfterMethod
	public void teardown() {
		driver.close();
	}

}
