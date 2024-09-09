package com.TAP.POMTestCases;

import org.testng.Reporter;
import org.testng.annotations.Test;
import com.TAP.TestBase.BaseTest;
import com.TAP.TestBase.TAP_HomePage;

public class PageOpening extends BaseTest {
	
  @Test
  public void  TAP() {
	  TAP_HomePage hp= new TAP_HomePage();
	  hp.TAPHomePage("naresh1304@gmail.com", "817@Naresh");
	  
	  
	  Reporter.log("TAP login successful...", true);
	  
  }
}
