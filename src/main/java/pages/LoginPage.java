package pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
	
	
	@FindBy(how = How.ID, using = "username")
	WebElement userName;
	
	public LoginPage enterUserNameInLoginPage(){
		enterInput(userName, "DemoSalesManager");
		return this;		
	}
	
	public LoginPage enterUsernameInLoginPage(String user){
		enterInput(userName, "DemoSalesManager");
		System.out.println("Username is entered");
		return this;
	}
	
	@FindBy(how = How.ID, using = "password")
	WebElement password;
	
	public LoginPage enterPasswordInLoginPage(String pwd){
		enterInput(password, pwd);
		System.out.println("Password is entered");
		return this;
	}
	
	@FindBy(how = How.CLASS_NAME, using = "decorativeSubmit")
	WebElement submitBtn;
	
	public HomePage clickSubmitBtnInLoginPage(){
		click(submitBtn);
		System.out.println("Submit button is clicked");
		return new HomePage();
	}
	
	
		public LoginPage(){
		PageFactory.initElements(eventDriver, this);
	}

}
