package TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.TAP.TestBase.BaseTest;
import com.TAP.TestBase.BaseTest2;
import com.TAP.TestBase.ForEachloop;
import com.TAP.TestBase.TAP_HomePage;

public class DataPrintTrail extends BaseTest{

	

	TAP_HomePage hp= new TAP_HomePage();


	@Test(priority=1)
	public void Cases() throws Exception {

		hp.TAPHomePage("naresh@gmail.com", "com");

		driver.findElement(By.cssSelector("a[href='/cases']")).click();

		ForEachloop.loop(driver, "//div[@class='ant-table-container']//tbody/tr");
		
		System.out.println("..............................");
		
		}
	

	@Test(priority=2)
	public void properties()
	{
		
		/*
		 * if you want to run this test separately use
		 * hp.TAPHomePage("naresh@gmail.com", "com");
		 */


		driver.findElement(By.xpath("//*[@id=\"root\"]/div/aside/div/ul/li[2]")).click();
	
		ForEachloop.loop(driver, "//div[@class='ant-table css-1ltd2fe']//tbody/tr");
	}

}

