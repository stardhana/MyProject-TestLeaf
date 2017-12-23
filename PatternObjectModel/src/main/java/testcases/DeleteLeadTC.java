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

public class DeleteLeadTC extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "Delete Lead";
		testCaseName = "Delete Lead";
		testDescription = "Deleting a lead";
		category= "Smoke";
		authors	="DB";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void duplicateLeadTC(String userName, String passWord, String pCode, String phoneNo) throws InterruptedException {
		
		
FindLeadsPage fl = new LoginPage(driver,test)
.enterUserName(userName)
.enterPassword(passWord)
.clickLogin()
.clickcrmsfa()
.clickLeads()
.clickFindLead()
.clickPhoneBtn()
.enterPhoneCode(pCode)
.enterPhoneNo(phoneNo)
.clickFindLeadsBtn();
String id = fl.getLeadId();
fl.clickFirstResultingLead()
.clickDeleteLead()
.clickFindLead()
.enterLeadIdLeadpg(id)
.clickFindLeadsBtn()
.verifyNoRecordMsg();		
		
	}

}
