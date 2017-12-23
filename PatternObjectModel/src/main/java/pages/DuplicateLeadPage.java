package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class DuplicateLeadPage extends ProjectMethods{
	
	public DuplicateLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
	
	}
	
	@FindBy(how=How.ID,using="sectionHeaderTitle_leads")
	private WebElement elePageTitle;
	public DuplicateLeadPage verifyPageTitle() {
		verifyDisplayed(elePageTitle);
		return this;
		
	}
	
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleSubmitBtn;
	public ViewLeadPage clickSubmitBtn() {
		click(eleSubmitBtn);
		return new ViewLeadPage(driver,test);
	}
	
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement eleFirstName;
	public String getFirstName() {
		String fname = getText(eleFirstName);
		return fname;
	}
				
}
