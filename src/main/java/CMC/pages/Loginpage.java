package CMC.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CMC.base.testbase;

public class Loginpage extends testbase {
@FindBy(css="input#email")WebElement uname;
@FindBy(css="input#password")WebElement pword;
@FindBy(tagName="img")WebElement logo;
@FindBy(linkText="Forgot Password?")WebElement fpword;
@FindBy(className="btn")WebElement loginbtn;

//Initializing page objects
 public Loginpage()
 {
	PageFactory.initElements(driver, this); 
 }
 // to validate the page title
 public String verifypagetitle()
 {
	return driver.getTitle();
	 
 }
 //to validate page logo
 public boolean pagelogo()
 {
	return logo.isDisplayed();
	 
 }
 public Homepage login(String username, String password)
 {
	 uname.sendKeys(username);
	 pword.sendKeys(password);
	 loginbtn.click();
	 return new Homepage();
	}

}
