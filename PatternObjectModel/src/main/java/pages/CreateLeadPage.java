package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{
	
	public CreateLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
	
	}
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompName;
	public CreateLeadPage enterCompName(String cName) {
		type(eleCompName, cName);
		return this;
		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement elefirstName;
	public CreateLeadPage enterfirstName(String fName) {
		type(elefirstName, fName);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement elelastName;
	public CreateLeadPage enterlastName(String lName) {
		type(elelastName, lName);
		return this;
	}
	
	
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement eleSubmitBtn;
	public ViewLeadPage clickSubmitBtn() {
		click(eleSubmitBtn);
		return new ViewLeadPage(driver,test);
	}
		
}
