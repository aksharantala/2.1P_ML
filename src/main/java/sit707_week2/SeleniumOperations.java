package sit707_week2;

import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

/**
 * This class demonstrates Selenium locator APIs to identify HTML elements.
 * 
 * Details in Selenium documentation https://www.selenium.dev/documentation/webdriver/elements/locators/
 * 
 * @author Ahsan Habib
 */
public class SeleniumOperations {

	public static void sleep(int sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void officeworks_registration_page(String url) throws IOException {
		// Step 1: Locate chrome driver folder in the local drive.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshar Antala\\Desktop\\Jar\\chromedriver.exe");
		
		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Driver info: " + driver);
		
		sleep(2);
	
		// Load a webpage in chromium browser.
		driver.get(url);
		
		/*
		 * How to identify a HTML input field -
		 * Step 1: Inspect the webpage, 
		 * Step 2: locate the input field, 
		 * Step 3: Find out how to identify it, by id/name/...
		 */

		
		// Find first input field which is firstname
		WebElement Fname = driver.findElement(By.id("firstNameId"));
		System.out.println("Found element: " + Fname);
		// Send first name
		Fname.sendKeys("akshar");
		
		/*
		 * Find following input fields and populate with values
		 */
		// Last Name
		WebElement Lname = driver.findElement(By.id("lastNameId"));
		System.out.println("Found element: " + Lname);
		// Send first name
		Lname.sendKeys("Antala");
		
		
		// Last Name
		WebElement Email = driver.findElement(By.id("myEmailId"));
		System.out.println("Found element: " + Email);
		// Send Mail id name
		Email.sendKeys("aksharantala@gmail.com");
				
		// password
		WebElement password = driver.findElement(By.id("pwordId"));
		System.out.println("Found element: " + password);
		// Send password
		password.sendKeys("Qazwsx@123");
		
		
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(screenshotFile, new File("./screenshots/ss.png"));
		
		/*
		 * Identify button 'Create account' and click to submit using Selenium API.
		 */
		WebElement click = driver.findElement(By.id("account-action-btn"));
		click.click();
		
		
		/*
		 * Take screenshot using selenium API.
		 */
		// Write code
		File screenshotFile1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(screenshotFile1, new File("./screenshots/2nd_ss.png"));
		
		// Sleep a while
		sleep(2);
		
		// close chrome driver
		driver.close();	
	}
	
	
}
