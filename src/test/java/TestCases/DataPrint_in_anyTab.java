package TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.TAP.TestBase.BaseTest;
import com.TAP.TestBase.ForEachloop;
import com.TAP.TestBase.TAP_HomePage;

public class DataPrint_in_anyTab extends BaseTest{

	

	TAP_HomePage hp= new TAP_HomePage();


	@Test()
	public void Cases() throws Exception {

		hp.TAPHomePage("naresh@gmail.com", "com");

		driver.findElement(By.cssSelector("a[href='/cases']")).click();

		ForEachloop.loop(driver, "//div[@class='ant-table-container']//tbody/tr");
	//	Thread.sleep(2000);
		
		System.out.println("******************************************************");
		
		// properties

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/aside/div/ul/li[2]")).click();
		
		ForEachloop.loop(driver, "//div[@class='ant-table css-1ltd2fe']//tbody/tr");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/aside/div/ul/li[2]")).click();
		
		ForEachloop.loop(driver, "//div[@class='ant-table css-1ltd2fe']//tbody/tr");
		
		System.out.println("******************************************************");
		
		//workflow
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/aside/div/ul/li[3]")).click();
		
		ForEachloop.loop(driver, "//table[@style='table-layout: auto;']/tbody/tr");
		
		
		
		}
	
}

