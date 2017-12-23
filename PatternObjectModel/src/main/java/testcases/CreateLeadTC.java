package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class CreateLeadTC extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "Create Lead";
		testCaseName = "CreateLead";
		testDescription = "To create new lead";
		category= "Smoke";
		authors	="DB";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void createLeadTC(String userName, String passWord, String cName, String fName, String lName) {
		
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickcrmsfa()
		.clickLeads()
		.clickCreateLead()
		.enterCompName(cName)
		.enterfirstName(fName)
		.enterlastName(lName)
		.clickSubmitBtn();
		
		
		
		
		
		
		
		
	}

}
