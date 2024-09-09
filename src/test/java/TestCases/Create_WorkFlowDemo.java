package TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create_WorkFlowDemo {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();


		// Navigate to the webpage
		driver.get("https://the-tap-app.netlify.app/"); 
		driver.findElement(By.id("login_email")).sendKeys("naresh@gamail.com");
		driver.findElement(By.id("login_password")).sendKeys("naresh123");
		driver.findElement(By.xpath("//*[@id=\"login\"]/div[3]/div/div/div/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/aside/div/ul/li[3]/span[2]/a")).click();

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div/div[1]/div[2]/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"stare\"]")).click();

		
		List<WebElement> divs = driver.findElements(By.cssSelector("div[class='ant-select-item-option-content']"));
		System.out.println(divs.size());
		for (WebElement div : divs) {
			System.out.println( div.getText());
			if( div.getText().equalsIgnoreCase("Alaska"))
				div.click();
		}

		driver.findElement(By.id("county")).click();

		List<WebElement> divs1 = driver.findElements(By.cssSelector("div[class='ant-select-item-option-content']"));
		System.out.println(divs1.size());
		for (WebElement div1 : divs1) {
			System.out.println( div1.getText());
			if( div1.getText().equalsIgnoreCase("Alaska"))
				div1.click();
		}
		driver.findElement(By.id("courthouse")).click();
		
		List<WebElement> divs2 = driver.findElements(By.cssSelector("div[class='ant-select-item ant-select-item-option']"));
		System.out.println(divs2.size());
		for (WebElement div3 : divs2) {
			System.out.println( div3.getText());
			if( div3.getText().equalsIgnoreCase("Alaska Courthouse"))
				div3.click();
			
		}
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("adding");
		driver.findElement(By.xpath("//textarea[@id='description']")).sendKeys("adding");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(2000);
		driver.close();

	}
}
