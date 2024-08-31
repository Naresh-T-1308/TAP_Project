package com.TAP.DataDrivenTestCases;

import org.testng.annotations.Test;

import com.TAP.TestBase.BaseTest2;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;

public class NewTest extends BaseTest2 
{

	@Test(dataProvider = "dp")
	public void f(String email, String password) throws InterruptedException 
	{

		driver.findElement(By.cssSelector(loc.getProperty("email"))).sendKeys(email);
		driver.findElement(By.cssSelector(loc.getProperty("password"))).sendKeys(password);
		driver.findElement(By.cssSelector(loc.getProperty("login"))).click();
		Thread.sleep(1000);
	}

	@DataProvider
	public Object[][] dp() throws Exception 
	{

		Object[][] mydata=null;

		FileInputStream fi = new FileInputStream(".\\src\\test\\resources\\Excel\\loginDetails.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(fi);
		XSSFSheet sheet= workbook.getSheet("Sheet1");
		int rows = sheet.getPhysicalNumberOfRows();
		// System.out.println(rows); //4

		mydata =new Object [rows-1][2];

		for(int i=1;i<rows;i++)
		{
			mydata[i-1][0]=sheet.getRow(i).getCell(0).getStringCellValue();
			mydata[i-1][1]=sheet.getRow(i).getCell(1).getStringCellValue();
		}

		workbook.close();
		return mydata;
	}
}
