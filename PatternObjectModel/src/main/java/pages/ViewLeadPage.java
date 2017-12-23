package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods{
	
	public ViewLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
	
	}
	
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement eleFirstName;
	public String getFirstName() {
		String fname = getText(eleFirstName);
		return fname;
	}
	
	@FindBy(how=How.XPATH,using="//a[text()='Duplicate Lead']")
	private WebElement eleDupLeadBtn;
	public DuplicateLeadPage clickDuplicateLead() {
		click(eleDupLeadBtn);
		return new DuplicateLeadPage(driver, test);
		
	}
	
	@FindBy(how=How.CLASS_NAME,using="subMenuButtonDangerous")
	private WebElement eleDeleteLeadBtn;
	public MyLeadsPage clickDeleteLead() {
		click(eleDeleteLeadBtn);
		return new MyLeadsPage(driver, test);
		
	}
	@FindBy(how=How.ID,using="sectionHeaderTitle_leads")
	private WebElement elePageTitle;
	public ViewLeadPage verifyPageTitle() {
		verifyDisplayed(elePageTitle);
		return this;
		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Edit")
	private WebElement eleEditLeadBtn;
	public EditLeadPage clickEditLead() {
		click(eleEditLeadBtn);
		return new EditLeadPage(driver, test);
		
	}
	
	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	private WebElement eleCompanyName;
	public ViewLeadPage verifyCompanyName(String cName) {
		verifyPartialText(eleCompanyName, cName);
		return this;
		
	}
		
}
