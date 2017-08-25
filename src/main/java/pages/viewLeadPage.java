package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class viewLeadPage extends BasePage {
	WebDriver driver;
	
	@FindBy(how = How.ID, using = "viewLead_companyName_sp")
	WebElement leadName;
	
	public viewLeadPage verifyLeadIdisDisplayed(){
		elementIsDisplayed(leadName);
		return this;
	}
	
	
	public viewLeadPage(){
		PageFactory.initElements(eventDriver, this);
	}

}
