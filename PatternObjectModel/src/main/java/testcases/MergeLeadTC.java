package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.FindLeadsPage;
import pages.LoginPage;
import pages.MergeLeadsPage;
import wdMethods.ProjectMethods;

public class MergeLeadTC extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "Merge Lead";
		testCaseName = "MergeLead";
		testDescription = "To Merge two leads";
		category= "Smoke";
		authors	="DB";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void createLeadTC(String userName, String passWord,String firstLeadId, String secondLeadId) throws InterruptedException {
		
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickcrmsfa()
		.clickLeads()
		.clickMergeLead()
		.clickFromLeadIcon()
		.switchingWindow(1)
		.enterLeadIdMergeFlow(firstLeadId)
		.clickFindLeadsBtn()
		.clickResultedLead()
		.switchingWindow(0)		
		.clickToLeadIcon()
		.switchingWindow(1)		
		.enterLeadIdMergeFlow(secondLeadId)
		.clickFindLeadsBtn()
		.clickResultedLead()
		.switchingWindow(0)
		.clickMergeBtn()
		.acceptAlertPop()
		.clickFindLead()
		.enterLeadIdLeadpg(firstLeadId)
		.clickFindLeadsBtn()
		.verifyNoRecordMsg();			
				
	}

}
