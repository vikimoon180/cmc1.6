package CMC.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CMC.base.testbase;

public class Homepage extends testbase {
	@FindBy(css = "img.topuser-image")
	WebElement img;
	@FindBy(xpath = "//*[@id=\"alert\"]/nav/div[2]/div/div/ul/li[4]/ul/li/div/div[2]/h4")
	WebElement txt;
	@FindBy(xpath = "//*[@id=\"sibe-box\"]/ul[2]/li[1]/a/span")
	WebElement foffice;
	@FindBy(css = "ul.sidebar-menu verttop li:nth of (2)")
	WebElement opd;
	@FindBy(css = "ul.sidebar-menu verttop li:nth of (3)")
	WebElement ipd;
	@FindBy(css = "ul.sidebar-menu verttop li:nth of (4)")
	WebElement pharma;
	@FindBy(css = "ul.sidebar-menu verttop li:nth of (5)")
	WebElement patho;
	@FindBy(css = "ul.sidebar-menu verttop li:nth of (6)")
	WebElement radio;
	@FindBy(css = "ul.sidebar-menu verttop li:nth of (7)")
	WebElement oth;
	@FindBy(css = "ul.sidebar-menu verttop li:nth of (8)")
	WebElement bbank;
	@FindBy(css = "ul.sidebar-menu verttop li:nth of (9)")
	WebElement tpa;
	@FindBy(css = "ul.sidebar-menu verttop li:nth of (10)")
	WebElement finance;
	@FindBy(css = "ul.sidebar-menu verttop li:nth of (11)")
	WebElement ambulance;
	@FindBy(css = "ul.sidebar-menu verttop li:nth of (12)")
	WebElement hr;
	@FindBy(css = "ul.sidebar-menu verttop li:nth of (13)")
	WebElement messaging;
	@FindBy(css = "ul.sidebar-menu verttop li:nth of (14)")
	WebElement download;
	@FindBy(css = "ul.sidebar-menu verttop li:nth of (15)")
	WebElement inventory;
	@FindBy(css = "ul.sidebar-menu verttop li:nth of (16)")
	WebElement frontcms;
	@FindBy(css = "ul.sidebar-menu verttop li:nth of (17)")
	WebElement reports;
	@FindBy(css = "ul.sidebar-menu verttop li:nth of (18)")
	WebElement setup;

	public Homepage() {
		PageFactory.initElements(driver, this);
	}

	public String verifytitle() {
		return driver.getTitle();
	}

	public boolean label() {
		img.click();
		return txt.isDisplayed();
	}
	
	public Frontofficepage clickfrontoffice() {
		foffice.click();
		return new Frontofficepage();
		
	}
	

}
