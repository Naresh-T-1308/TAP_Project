package com.TAP.TestBase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//retrive all data from the table 

public class ForEachloop{

	public static void loop(WebDriver wd,String xp)
	{
		List<WebElement> totalrows= wd.findElements(By.xpath(xp));

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
	

	//particular element is avail

	public static void getDetails(WebDriver wd,String xp, String s)
	{
		List<WebElement> totalrows= wd.findElements(By.xpath(xp));

		for(WebElement row : totalrows)
		{
			List<WebElement> totalColumns=row.findElements(By.tagName("td"));
			for(WebElement col : totalColumns)
			{
				if(col.getText().equalsIgnoreCase(s))
				{
					System.out.println("item is avaialable");
					break;
				}
			}
		}
	}

}


/*
		String property="Joe Black";
		for(int i=1;i<=totalrows.size();i++)
	{
		List<WebElement> totalColumns=	driver.findElements(By.xpath("//div[@class='ant-table css-1ltd2fe']//tbody/tr[" + i + "]/td"));
		for(int j=1;j<=totalColumns.size();j++)
		{
		WebElement cell=driver.findElement(By.xpath("//div[@class='ant-table css-1ltd2fe']//tbody/tr[" + i + "]/td[" +  j + "]"));
		if(cell.getText().equalsIgnoreCase(property))
		{
			System.out.println("Avaiable at cell '" + i + "," + j + "'");
		}
	}
 */