package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class MergeLeadsPage extends ProjectMethods{
	
	public MergeLeadsPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
	
	}
	
	@FindBy(how=How.XPATH,using="(//img[@src='/images/fieldlookup.gif'])[1]")
	private WebElement eleFromLeadIcon;
	public MergeLeadsPage clickFromLeadIcon() {
		click(eleFromLeadIcon);
		return this;
		
	}
	
	@FindBy(how=How.XPATH,using="(//img[@src='/images/fieldlookup.gif'])[2]")
	private WebElement eleToLeadIcon;
	public MergeLeadsPage clickToLeadIcon() {
		click(eleToLeadIcon);
		return this;
		
	}
	
	@FindBy(how=How.XPATH,using="//a[@class='buttonDangerous']")
	private WebElement eleMergeBtn;
	public MergeLeadsPage clickMergeBtn() {
		click(eleMergeBtn);
		return this;
		
	}
	
	//@FindBy(how=How.XPATH,using="//a[@class='buttonDangerous']")
	//private WebElement eleMergeBtn;
	public FindLeadsPage switchingWindow(int index) {
		switchToWindow(index);
		return new FindLeadsPage(driver, test);
		
	}
	
	public MyLeadsPage acceptAlertPop() {
		acceptAlert();
		return new MyLeadsPage(driver, test);
		
	}
}
