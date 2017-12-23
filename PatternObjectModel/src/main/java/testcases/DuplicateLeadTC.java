package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.DuplicateLeadPage;
import pages.FindLeadsPage;
import pages.HomePage;
import pages.LoginPage;
import pages.MyHomePage;
import pages.MyLeadsPage;
import pages.ViewLeadPage;
import wdMethods.ProjectMethods;

public class DuplicateLeadTC extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "Duplicate Lead";
		testCaseName = "Duplicate Lead";
		testDescription = "To duplicate a lead";
		category= "Smoke";
		authors	="DB";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void duplicateLeadTC(String userName, String passWord, String email) throws InterruptedException {
		
		
ViewLeadPage frl = new LoginPage(driver,test)
.enterUserName(userName)
.enterPassword(passWord)
.clickLogin()
.clickcrmsfa()
.clickLeads()
.clickFindLead()
.clickEmailBtn()
.enterEmail(email)
.clickFindLeadsBtn()
.clickFirstResultingLead();
String firstName1 =frl.getFirstName();
frl.clickDuplicateLead()
.verifyPageTitle()
.clickSubmitBtn()
.verifyExactText(locateElement("id", "viewLead_firstName_sp"), firstName1);



		
		
		
		
		
	}

}
