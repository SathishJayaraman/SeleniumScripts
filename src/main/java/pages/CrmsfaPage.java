package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CrmsfaPage extends BasePage{
	
	
	@FindBy(how = How.LINK_TEXT, using = "Create Lead")
	WebElement createLeadTab;
	
	public CreateLeadPage clickLeadTab(){
		click(createLeadTab);
		return new CreateLeadPage();
	}
	
	
	public CrmsfaPage(){
		PageFactory.initElements(eventDriver, this);
	}

}
