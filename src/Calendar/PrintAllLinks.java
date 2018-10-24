package Calendar;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PrintAllLinks 
{
	//Important Code //Video 26 Bhanu

	@Test
	public void MaxWebTableValue() throws InterruptedException, Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Automation\\Selenium\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://money.rediff.com/gainers/bse/daily");
		
		List<WebElement> Links = Driver.findElements(By.xpath("//a"));
		int size = Links.size();
		
		for(int i=0; i<size;i++)
		{
			System.out.println(Links.get(i).getAttribute("href"));
		}
		
	}
		
}
