package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{
	
	
	@FindBy(how = How.LINK_TEXT, using = "CRM/SFA")
	WebElement crmsfa;
	
	public CrmsfaPage clickCrmsfa(){
		
		click(crmsfa);
		System.out.println("CRMSFA link is clicked");
		return new CrmsfaPage();
	}
	
	
	public HomePage(){
		PageFactory.initElements(eventDriver, this);
	}

}
