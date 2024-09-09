package TestCases;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkflowTestcase {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();


		// Navigate to the webpage
		driver.get("https://the-tap-app.netlify.app/"); 
		driver.findElement(By.id("login_email")).sendKeys("naresh@gamail.com");
		driver.findElement(By.id("login_password")).sendKeys("naresh123");
		driver.findElement(By.xpath("//*[@id=\"login\"]/div[3]/div/div/div/div/button")).click();
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/aside/div/ul/li[3]/span[2]/a")).click();

		WebElement t=	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div/div[2]/div/div/div/div/div/table/thead"));

		List<WebElement> rows = driver.findElements(By.tagName("tr"));


	for (WebElement row : rows) {
		List<WebElement> columns = row.findElements(By.tagName("td"));

		for (WebElement column : columns) {
			System.out.print(column.getText() + " | ");
		}
		System.out.println(); // New line after each row
	}

	System.out.println(t);
	Thread.sleep(2000);

	driver.close();

}
}


/*

	// Iterate over each row
	for (WebElement row : rows) {
	
		// Within each row, you might want to get column
		 
		List<WebElement> columns = row.findElements(By.tagName("td"));

		// Print the text of each column in the current row
		for (WebElement column : columns) {
			System.out.print(column.getText() + " | ");
		}
		System.out.println(); // New line after each row


 */