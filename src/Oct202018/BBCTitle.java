package Oct202018;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BBCTitle {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\\\Work\\\\Automation\\\\Selenium\\\\Selenium Softwares\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.bbc.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);

		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='most-popular']//a"));
		/*Iterator<WebElement> itr = links.iterator();
		
		while(itr.hasNext())
		{
			Thread.sleep(2000);
			act.contextClick(itr.next()).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(2000);
			String abc = driver.getTitle();
			Thread.sleep(2000);
			System.out.println(abc);
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
		}
	*/
		
		
		for(int i=0;i<links.size();i++)
		{
			Thread.sleep(2000);
		//	act.contextClick(links.get(i)).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
			driver.navigate().refresh();
			links.get(i).click();
			Thread.sleep(3000);
			String abc = driver.getTitle();
			Thread.sleep(3000);
			System.out.println(abc);
			Thread.sleep(3000);
			driver.navigate().back();
			Thread.sleep(3000);
			driver.navigate().refresh();
		}
		
	/*	driver.findElement(By.xpath("//h3[text()='China grows at slowest pace since 2009']")).click();
		Thread.sleep(3000);
		driver.getTitle();*/
	}

}
