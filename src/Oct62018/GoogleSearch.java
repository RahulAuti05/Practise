package Oct62018;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Automation\\Selenium\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("testing");
		Thread.sleep(2000);
		List <WebElement> auto = driver.findElements(By.xpath("//ul[@role='listbox']/li[@role='presentation']"));
		int Total = auto.size();
		System.out.println(Total);
		//Iterator<WebElement> ele = auto.iterator();
		
	//	while(ele.hasNext())
		for(int i=0; i<Total; i++)
		{
			
			WebElement ele = auto.get(i);
			String abc = ele.getAttribute(" interview questions");
			if(abc.contentEquals("testig interview questions"))
			{
				ele.click();
				
			}
			
	    }
		
	}
		
}

