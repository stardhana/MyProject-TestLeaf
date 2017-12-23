package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import freemarker.ext.jsp.TaglibFactory.ClearMetaInfTldSource;
import wdMethods.ProjectMethods;

public class EditLeadPage extends ProjectMethods{
	
	public EditLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
	
	}
	
	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	private WebElement eleCompanyName;
	public EditLeadPage updateCompanyName(String cName) {
		type(eleCompanyName, cName);		
		return this;
		
	}
	
	@FindBy(how=How.XPATH,using="(//input[@class='smallSubmit'])[1]")
	private WebElement eleUpdateBtn;
	public ViewLeadPage clickUpdateBtn() {
		click(eleUpdateBtn);
		return new ViewLeadPage(driver, test);
		
	}
		
}
