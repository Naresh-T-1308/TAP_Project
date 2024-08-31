package com.TAP.POMTestCases;

import org.testng.Reporter;
import org.testng.annotations.Test;
import com.TAP.TestBase.BaseTest;
import com.TAP.TestBase.HomePage;

public class PageOpening extends BaseTest {
	
  @Test
  public void  TAP() {
	  HomePage hp= new HomePage(driver);
	  hp.TAPHomePage("naresh1304@gmail.com", "817@Naresh");
	  
	  Reporter.log("TAP login successful...", true);
	  
  }
}
