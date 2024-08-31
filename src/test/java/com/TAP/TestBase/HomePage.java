package com.TAP.TestBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BaseTest{

	public WebDriver wd;

	public HomePage(WebDriver d)
	{
		wd=d;
	}

	public void TAPHomePage(String email, String password)
	{
		WebElement emailField=driver.findElement(By.cssSelector(loc.getProperty("email")));
		emailField.clear();
		emailField.sendKeys(email);

		WebElement passwordField=driver.findElement(By.cssSelector(loc.getProperty("password")));
		passwordField.clear();
		passwordField.sendKeys(password);

		driver.findElement(By.cssSelector(loc.getProperty("login"))).click();
	}

}
