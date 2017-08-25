package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CreateLeadPage extends BasePage {
	WebDriver driver;
	
	@FindBy(how = How.ID, using = "createLeadForm_companyName")
	WebElement companyName;
	
	public CreateLeadPage enterCompanyName(){
		enterInput(companyName, "Kumaran");
		return this;
	}
	
	@FindBy(how = How.ID, using = "createLeadForm_firstName")
	WebElement firstName;
	
	public CreateLeadPage enterFirstNameName(){
		enterInput(firstName, "Sathish");
		return this;
	}
	
	@FindBy(how = How.ID, using = "createLeadForm_lastName")
	WebElement lastName;
	
	public CreateLeadPage enterlastNameName(){
		enterInput(lastName, "Jayaraman");
		return this;
	}
	
	@FindBy(how = How.ID, using = "createLeadForm_dataSourceId")
	WebElement dataSourceDropdown;
	
	public CreateLeadPage selectDatsourceDrpdwn(){
		selectByVisibleText(dataSourceDropdown, "Conference");
		return this;
	}
	
	@FindBy(how = How.ID, using = "createLeadForm_marketingCampaignId")
	WebElement campaignDropdown;
	
	public CreateLeadPage selectCampaignDrpdwn(){
		selectByVisibleText(campaignDropdown, "Automobile");
		return this;
	}
	
	@FindBy(how = How.ID, using = "createLeadForm_primaryPhoneNumber")
	WebElement primaryPhoneNumber;
	
	public CreateLeadPage enterPrimaryPhoneNo(){
		enterInput(primaryPhoneNumber, "65285206");
		return this;
	}
	
	@FindBy(how = How.ID, using = "createLeadForm_primaryEmail")
	WebElement primaryEmail;
	
	public CreateLeadPage enterPrimaryEmail(){
		enterInput(primaryEmail, "sathishjl08@gmail.com");
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
