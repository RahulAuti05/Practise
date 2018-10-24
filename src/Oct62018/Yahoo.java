package Oct62018;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Automation\\Selenium\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.yahoo.com/");
		driver.manage().window().maximize();
		List<WebElement>links = driver.findElements(By.xpath("//li[@class='trending-list selected']//li"));
		int totallinks = links.size();
		System.out.println("The total number of links are "+totallinks);
		Iterator<WebElement> itr = links.iterator();
		while(itr.hasNext())
		{
		
			System.out.println(itr.next().getText());
		}
		
	}

}
