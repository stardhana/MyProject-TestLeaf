package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class FindLeadsPage extends ProjectMethods{
	
	public FindLeadsPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
	
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Email']")
	private WebElement eleEmailBtn;
	public FindLeadsPage clickEmailBtn() {
		click(eleEmailBtn);
		return this;
		
	}
	
	@FindBy(how=How.XPATH,using="//span[text()= 'Phone']")
	private WebElement elePhoneBtn;
	public FindLeadsPage clickPhoneBtn() {
		click(elePhoneBtn);
		return this;
		
	}
	
	@FindBy(how=How.NAME,using="emailAddress")
	private WebElement eleEmailTxt;
	public FindLeadsPage enterEmail(String email) {
		type(eleEmailTxt, email);
		return this;
		
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='phoneCountryCode']")
	private WebElement elePhoneCodeTxt;
	public FindLeadsPage enterPhoneCode(String pCode) {
		type(elePhoneCodeTxt, pCode);
		return this;
		
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='phoneNumber']")
	private WebElement elePhoneNoTxt;
	public FindLeadsPage enterPhoneNo(String phoneNo) {
		type(elePhoneNoTxt, phoneNo);
		return this;
		
	}
	@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
	private WebElement eleFirstName;
	public FindLeadsPage enterFirstName(String fName) {
		type(eleFirstName, fName);
		return this;
		
	}
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleFindLeads;
	public FindLeadsPage clickFindLeadsBtn() throws InterruptedException {
		click(eleFindLeads);
		Thread.sleep(3000);
		return this;
		
	}
	
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement eleFirstLead;
	public ViewLeadPage clickFirstResultingLead() {
		click(eleFirstLead);
		return new ViewLeadPage(driver, test);
	}
		
	@FindBy(how=How.XPATH,using="//input[@name='id']")
	private WebElement eleLeadIdTxt;
	public FindLeadsPage enterLeadIdMergeFlow(String leadId) {
		type(eleLeadIdTxt, leadId);
		return this;
}
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement eleResultLead;
	public FindLeadsPage clickResultedLead() {
		click(eleResultLead);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@name = 'id']")
	private WebElement eleLeadId;
	public FindLeadsPage enterLeadIdLeadpg(String leadId) {
		type(eleLeadId, leadId);
		return this;
}
	
	@FindBy(how=How.XPATH,using="//div[text()='No records to display']")
	private WebElement eleNoRecordMsg;
	public FindLeadsPage verifyNoRecordMsg() {
		verifyDisplayed(eleNoRecordMsg);
		return this;
	}
	
	public MergeLeadsPage switchingWindow(int index) {
		switchToWindow(index);
		return new MergeLeadsPage(driver, test);
		
	}
	
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement eleGetLeadId;
	public String getLeadId() {
		String leadId = getText(eleGetLeadId);
		return leadId;
	}
}

