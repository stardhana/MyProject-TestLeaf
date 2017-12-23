package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class EditLeadTC extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "Edit Lead";
		testCaseName = "EditLead";
		testDescription = "Edit existing lead";
		category= "Smoke";
		authors	="DB";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void createLeadTC(String userName, String passWord, String fName, String cName) throws InterruptedException {
		
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickcrmsfa()
		.clickLeads()
		.clickFindLead()
		.enterFirstName(fName)
		.clickFindLeadsBtn()
		.clickFirstResultingLead()
		.verifyPageTitle()
		.clickEditLead()
		.updateCompanyName(cName)
		.clickUpdateBtn()
		.verifyCompanyName(cName);		
	}

}
