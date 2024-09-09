package TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.TAP.TestBase.BaseTest;
import com.TAP.TestBase.BaseTest2;
import com.TAP.TestBase.TAP_HomePage;

public class DataprintMethod extends BaseTest{

	/*
	total tabs in the left side= //*[@id="root"]/div/aside/div/ul/li = 9
	1.dashBoard= //*[@id="root"]/div/aside/div/ul/li[1]
	2.properies= //*[@id="root"]/div/aside/div/ul/li[2]
	3.workflows
	etc...
	 */

	TAP_HomePage hp= new TAP_HomePage();


	@Test
	public void Cases() throws Exception {

		hp.TAPHomePage("naresh@gmail.com", "com");

		driver.findElement(By.cssSelector("a[href='/cases']")).click();

		List<WebElement> header=  driver.findElements(By.xpath("//div[@class='ant-table-container']//thead/tr/th"));
		System.out.println(header.size());//8


		List<WebElement> table=  driver.findElements(By.xpath("//div[@class='ant-table-container']//tbody/tr"));
		System.out.println("total rows : "+table.size()); //9

		Thread.sleep(1000);

	}

	@Test
	public void property()
	{

		hp.TAPHomePage("naresh@gmail.com", "com");

		driver.findElement(By.xpath("//li[@class='ant-menu-item'][4]")).click();

		List<WebElement> pro=	driver.findElements(By.xpath("//div[@class='_cardContainer_6j8f6_1']/div[2]/div"));
		System.out.println("property field rows: "+pro.size());

		for(WebElement p:pro)
		{
			System.out.println(p.getText());
			System.out.println(" ");
		}


	}



	@Test
	public void cards() 
	{

		hp.TAPHomePage("naresh@gmail.com", "com");
		List<WebElement> card= driver.findElements(By.xpath("//div[@class='_rightContainer_1pks3_24']/div/div/span"));

		for(WebElement c:card)
		{
			System.out.println(c.getText());
		}
	}

	@Test
	public void leftside1()
	{


		hp.TAPHomePage("naresh@gmail.com", "com");
		List<WebElement> left=	driver.findElements(By.xpath("//div[@class='_leftContainer_1pks3_9']/div[1]/div"));

		for(WebElement le:left)
		{
			System.out.println(le.getText());
		}
	}


	@Test
	public void leftside2()
	{


		hp.TAPHomePage("naresh@gmail.com", "com");

		List<WebElement> left=	driver.findElements(By.xpath("//div[@class='_leftContainer_1pks3_9']/div[2]/div"));

		for(WebElement le:left)
		{
			System.out.println(le.getText());
		}
	}

	@Test
	public void properties()
	{


		hp.TAPHomePage("naresh@gmail.com", "com");

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/aside/div/ul/li[2]")).click();

		List<WebElement> totalrows=	driver.findElements(By.xpath("//div[@class='ant-table css-1ltd2fe']//tbody/tr"));
		
		
		for(WebElement row : totalrows)
		{
			List<WebElement> totalColumns=row.findElements(By.tagName("td"));
			for(WebElement col : totalColumns)
			{
				System.out.print(col.getText() + "||");
			}
			System.out.println();
		}
	}

}

