package assignments.week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;

public class FacebookReg {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver =new ChromeDriver(); ///Launch chrome
		driver.get(" https://en-gb.facebook.com/"); //Launch FB URL
		driver.manage().window().maximize(); //Maximize
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create new account")).click(); //click create new account
		driver.findElement(By.xpath(" //div[@class='mbm _1iy_ _a4y _3-90 lfloat _ohe']//input")).sendKeys("Bincy"); //input First Name
		driver.findElement(By.xpath(" //div[@class='mbm _1iy_ _a4y rfloat _ohf']//input")).sendKeys("Johnson");//input Last Name
		driver.findElement(By.name("reg_email__")).sendKeys("0527573330"); //input Mobile No
		driver.findElement(By.id("password_step_input")).sendKeys("Welcome@123");//input Password
		WebElement Date = driver.findElement(By.id("day"));//DOB
		Select DD = new Select(Date);
		DD.selectByValue("20");
		WebElement Month = driver.findElement(By.id("month"));//DOB
		Select MM = new Select(Month);
		MM.selectByIndex(10);
		WebElement Year = driver.findElement(By.name("birthday_year"));//DOB
		Select YYYY = new Select(Year);
		YYYY.selectByVisibleText("2000");
		driver.findElement(By.xpath("//label[text()='Female']")).click();///Select Female
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();	//Sign Up
		String WelcomeNote = driver.getTitle(); //Welcome note
		System.out.println(WelcomeNote);//Print Welcome Note
		driver.close();//Close the browser
		
		
			
	}

}
