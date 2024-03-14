package assignments.week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AccountCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Launch the Chrome browser
		ChromeDriver driver = new ChromeDriver();
		// Load the url
		driver.get("http://leaftaps.com/opentaps/");
		//to maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//locate the username field and type the username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click Login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//to verify the title 
		System.out.println(driver.getTitle());
		//click on crmsfa link
		driver.findElement(By.partialLinkText("CRM")).click();
		//click on Accounts link
		driver.findElement(By.linkText("Accounts")).click();
		//click on Create Account link
		driver.findElement(By.linkText("Create Account")).click();
		//enter accountName
		driver.findElement(By.id("accountName")).sendKeys("Bincy");
		//enter Description
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester.");
		//enter industry
		driver.findElement(By.name("industryEnumId")).sendKeys("ComputerSoftware");
		//Select "S-Corporation" as ownership using SelectByVisibleText.
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select Corp = new Select(ownership);
		Corp.selectByVisibleText("S-Corporation");
		//Select "Employee" as the source using SelectByValue.
		WebElement Source = driver.findElement(By.id("dataSourceId"));
		Select Emp = new Select(Source);
		Emp.selectByValue("LEAD_EMPLOYEE");
		//Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex.
		WebElement marketing = driver.findElement(By.id("marketingCampaignId"));
		Select Ecomm = new Select(marketing);
		Ecomm.selectByIndex(6);
		//Select "Texas" as the state/province using SelectByValue.
		WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select Tex = new Select(state);
		Tex.selectByValue("TX");
		
		//Click the "Create Account" button.
		driver.findElement(By.className("smallSubmit")).click();
		
		//Verify that the account name is displayed correctly.
		System.out.println(driver.getTitle());
		
		//Close the browser window
		
		driver.close();//close
	}

}
