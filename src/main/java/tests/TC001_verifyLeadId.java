package tests;



import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dataprovider.ExcelDataProvider;
import pages.LoginPage;
import wrappers.Annotations;

public class TC001_verifyLeadId extends Annotations {
	
	
	
	@Test (dataProvider = "testData")
	public void verifyLeadID(String userName, String password,String firstName, String lastName, String companyName, String dataSourceVal, String campaignValue, String phoneNumber, String email){
		
		new LoginPage()
		.enterUsernameInLoginPage(userName)
		.enterPasswordInLoginPage(password)
		.clickSubmitBtnInLoginPage()
		.clickCrmsfa()
		.clickLeadTab()
		.enterFirstName(firstName)
		.enterlastName(lastName)
		.enterCompanyName(companyName)
		.selectDatsourceDrpdwn(dataSourceVal)
		.selectCampaignDrpdwn(campaignValue)
		.enterPrimaryPhoneNo(phoneNumber)
		.enterPrimaryEmail(email)
		.clickSubmitBtn()
		.verifyLeadIdisDisplayed();
		
	}
	
	@DataProvider(name = "testData")
	public Object[][] getTestData() throws IOException, FileNotFoundException{
		return ExcelDataProvider.excelDataProvider("TC_001", "OpenTaps");
	}

}
