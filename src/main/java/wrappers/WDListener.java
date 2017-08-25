package wrappers;

import org.apache.http.ConnectionClosedException;
import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WDListener implements WebDriverEventListener {
	WebDriverWait wait;
	

	@Override
	public void afterAlertAccept(WebDriver arg0) {
		

	}

	@Override
	public void afterAlertDismiss(WebDriver arg0) {


	}

	@Override
	public void afterChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {


	}

	@Override
	public void afterClickOn(WebElement arg0, WebDriver arg1) {


	}

	@Override
	public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {


	}

	@Override
	public void afterNavigateBack(WebDriver arg0) {


	}

	@Override
	public void afterNavigateForward(WebDriver arg0) {


	}

	@Override
	public void afterNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterNavigateTo(String URL, WebDriver driver) {
		System.out.println("The browser "+driver+ "is launched with URL "+URL);

	}

	@Override
	public void afterScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeAlertAccept(WebDriver arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeAlertDismiss(WebDriver arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeChangeValueOf(WebElement element, WebDriver arg1, CharSequence[] input) {
		String inputvalue=element.toString();
		String ivalue=inputvalue.substring(64);
		System.out.println("Before entering  with value "+ input[0]+" for the element "+ivalue);		
	}

	@Override
	public void beforeClickOn(WebElement element, WebDriver arg1) {
		

	}

	@Override
	public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {


	}

	@Override
	public void beforeNavigateBack(WebDriver arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeNavigateForward(WebDriver arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeNavigateTo(String arg0, WebDriver arg1) {
		System.out.println("Browser to be launched");

	}

	@Override
	public void beforeScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onException(Throwable throwable, WebDriver arg1) {

		System.out.println("Inside Exception");


		if(throwable instanceof NoSuchElementException){
			System.out.println("Element could not be found "+throwable.getMessage());
		}
		else if(throwable instanceof NoSuchWindowException){
			System.out.println("Window is not present "+throwable.getMessage());
		}
		else if(throwable instanceof InvalidSelectorException){
			System.out.println("The element is wrong"+throwable.getMessage());
		}
		else if(throwable instanceof ConnectionClosedException){
			System.out.println("Connection lost"+throwable.getMessage());
		}


		throw new RuntimeException();
	}

}
