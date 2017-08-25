package wrappers;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotations extends WDMethods {
  
  @BeforeMethod
  public void beforeMethod() {
	  invokeApp("chrome", "http://leaftaps.com/opentaps");
  }

  @AfterMethod
  public void afterMethod() {
	  closeApp();
	  
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class executed");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class executed");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test executed");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test executed");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suite executed");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suite executed");
  }

}
