package CMC.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import CMC.base.testbase;
import CMC.util.Commonutility;
import CMC.util.Datepicker;

public class Visitorpage extends testbase {
	Datepicker datutil=new Datepicker();
	@FindBy(css="body > div.wrapper > div.content-wrapper > section > div > div > div > div.box-header.ptbnull > h3")WebElement title;
	@FindBy(css="body > div.wrapper > div.content-wrapper > section > div > div > div > div.box-header.ptbnull > div > a")WebElement addvisitr;
	@FindBy(css="#myModal > div > div > div.modal-header.modal-media-header > h4") WebElement addvistitle;
	@FindBy(xpath="//*[@id=\"formadd\"]/div[1]/div[1]/div[1]/div/select")WebElement purpse;
	@FindBy(xpath="//*[@id=\"formadd\"]/div[1]/div[1]/div[2]/div/input")WebElement names;
	@FindBy(xpath="//*[@id=\"formadd\"]/div[1]/div[2]/div[1]/div/input")WebElement phones;
	@FindBy(xpath="//*[@id=\"formadd\"]/div[1]/div[2]/div[2]/div/input")WebElement ids;
	@FindBy(xpath="//*[@id=\"formadd\"]/div[1]/div[3]/div[1]/div/input")WebElement personnum;
	@FindBy(xpath="//*[@id=\"date\"]")WebElement dates;
	@FindBy(xpath="//*[@id=\"stime_\"]")WebElement itime;
	@FindBy(xpath="//*[@id=\"stime_\"]")WebElement otime;
	@FindBy(xpath="//*[@id=\"description\"]")WebElement notess;
	@FindBy(xpath="//*[@id=\"formadd\"]/div[1]/div[6]/div/div/input")WebElement addfle;
	@FindBy(xpath="//*[@id=\"formadd\"]/div[2]/button")WebElement savebtn;
	
	public Visitorpage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean label() {
		return title.isDisplayed();
	}
	
	public boolean label2() {
		waitforElementvisible(addvistitle);
		return addvistitle.isDisplayed();
	}
	public void clickaddscreen()
	
	{
		addvisitr.click();
	}
	public void clickaddvisitr(String data[]) {
	
		Select drp=new Select(purpse);
		drp.selectByVisibleText(data[0]);
		names.sendKeys(data[1]);
		phones.sendKeys(data[2]);
		ids.sendKeys(data[3]);
		personnum.sendKeys(data[4]);
		dates.click();
		datutil.datpicker(data[5]);
		notess.sendKeys(data[6]);
		Commonutility.mouseclick(addfle);
		Commonutility.upload();
		savebtn.click();
		
		 
	}

}
