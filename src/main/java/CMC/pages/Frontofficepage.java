package CMC.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import CMC.base.testbase;

public class Frontofficepage extends testbase {
	@FindBy (xpath="/html/body/div[1]/div[1]/section/div/div/div/div[1]/div/a[1]") WebElement addappoint;
	@FindBy (css="body > div.wrapper > div.content-wrapper > section > div > div > div > div.box-header.with-border > div > a:nth-child(2)") WebElement visbook;
	@FindBy (xpath="/html/body/div[1]/div[1]/section/div/div/div/div[1]/div/a[3]") WebElement phonelog;
	@FindBy (xpath="//*[@id=\"dropdownMenu1\"]") WebElement postal;
	@FindBy (xpath="/html/body/div[1]/div[1]/section/div/div/div/div[1]/div/a[4]") WebElement compl;
	@FindBy (css="body > div.wrapper > div.content-wrapper > section > div > div > div > div.box-header.with-border > h3") WebElement texts;
	
	public Frontofficepage () {
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean label() {
		
		return texts.isDisplayed();
	}
	
	public Visitorpage clickvisitorbook() {
		visbook.click();
	return new Visitorpage();
	}
}	
	


