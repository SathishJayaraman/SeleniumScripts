package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CreateLeadPage extends BasePage {
	WebDriver driver;
	
	@FindBy(how = How.ID, using = "createLeadForm_companyName")
	WebElement eleCompanyName;
	
	public CreateLeadPage enterCompanyName(String companyName){
		enterInput(eleCompanyName, companyName);
		return this;
	}
	
	@FindBy(how = How.ID, using = "createLeadForm_firstName")
	WebElement eleFirstName;
	
	public CreateLeadPage enterFirstName(String firstName){
		enterInput(eleFirstName, firstName);
		return this;
	}
	
	@FindBy(how = How.ID, using = "createLeadForm_lastName")
	WebElement eleLastName;
	
	public CreateLeadPage enterlastName(String lastName){
		enterInput(eleLastName, lastName);
		return this;
	}
	
	@FindBy(how = How.ID, using = "createLeadForm_dataSourceId")
	WebElement eleDataSourceDropdown;
	
	public CreateLeadPage selectDatsourceDrpdwn(String dataSourceVal){
		selectByVisibleText(eleDataSourceDropdown, dataSourceVal);
		return this;
	}
	
	@FindBy(how = How.ID, using = "createLeadForm_marketingCampaignId")
	WebElement eleCampaignDropdown;
	
	public CreateLeadPage selectCampaignDrpdwn(String campaignVal){
		selectByVisibleText(eleCampaignDropdown, campaignVal);
		return this;
	}
	
	@FindBy(how = How.ID, using = "createLeadForm_primaryPhoneNumber")
	WebElement elePrimaryPhoneNumber;
	
	public CreateLeadPage enterPrimaryPhoneNo(String phoneNumber){
		enterInput(elePrimaryPhoneNumber, phoneNumber);
		return this;
	}
	
	@FindBy(how = How.ID, using = "createLeadForm_primaryEmail")
	WebElement elePrimaryEmail;
	
	public CreateLeadPage enterPrimaryEmail(String email){
		enterInput(elePrimaryEmail, email);
		return this;
	}
	
	@FindBy(how = How.CLASS_NAME, using = "smallSubmit")
	WebElement submitBtn;
	
	public viewLeadPage clickSubmitBtn(){
		click(submitBtn);
		return new viewLeadPage();
	}
	
	public CreateLeadPage(){
		PageFactory.initElements(eventDriver, this);
	}

}
