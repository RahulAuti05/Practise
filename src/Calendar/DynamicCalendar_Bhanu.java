package Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//WebTable and Calendar
public class DynamicCalendar_Bhanu 
{
	
	
	@Test
	public void calendar() throws InterruptedException	
	
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Automation\\Selenium\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
	
		Driver.get("https://www.phptravels.net/");
		Thread.sleep(2000);
		
		//Driver.findElement(By.xpath("//div[@id='select2-drop']/div/input")).click();
				
		Driver.findElement(By.xpath("//div[@id='select2-drop']/div/input")).sendKeys("Mum");
	//	Driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Pune");
		
		//Driver.findElement(By.xpath("//*[@id=\"onward_cal\"]")).click();
		
		
	}
}