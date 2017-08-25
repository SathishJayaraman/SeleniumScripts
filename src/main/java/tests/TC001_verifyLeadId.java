package tests;



import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.Annotations;

public class TC001_verifyLeadId extends Annotations {
	
	
	
	@Test
	public void verifyLeadID(){
		
		new LoginPage()
	//	.enterUsernameInLoginPage()
	//	.enterPasswordInLoginPage()
		.clickSubmitBtnInLoginPage()
		.clickCrmsfa()
		.clickLeadTab()
		.enterFirstNameName()
		.enterlastNameName()
		.enterCompanyName()
		.selectDatsourceDrpdwn()
		.selectCampaignDrpdwn()
		.enterPrimaryPhoneNo()
		.enterPrimaryEmail()
		.clickSubmitBtn()
		.verifyLeadIdisDisplayed();
		
	}
	
	@DataProvider(name = "testData")
	public String[][] getTestData(){
		return new String[][] 
				{
			{"DemoSalesManager", "crmsfa"},
			{"DemoSalesManager1", "crmsfa"}
				};
	}

}
