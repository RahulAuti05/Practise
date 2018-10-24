package Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//WebTable and Calendar
public class DynamicCalendar 
{
	String month = "Nov 2018";
	String date ="21";
	
	@Test
	public void calendar() throws InterruptedException	
	
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Automation\\Selenium\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
	
		Driver.get("https://www.irctc.co.in/");
		
		//Driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Mumbai");
	//	Driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Pune");
		//Thread.sleep(5000);
		Driver.findElement(By.xpath("//*[@id=\"onward_cal\"]")).click();
		
		
	//	WebElement getmonth = Driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[2]"));
	//	System.out.println(getmonth.getText());
		/*while(true)
		{
		
			if(getmonth.getText().equals(month))
			{
				break;
			}
			else
			{
				Driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']//tr[1]/td[3]")).click();
			}
			
			Driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[7]/td[5]")).click();
		}
		
			
		Driver.findElement(By.xpath("//input[@id='return_cal']")).click();*/
		
	}
}
