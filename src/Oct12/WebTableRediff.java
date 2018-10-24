package Oct12;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableRediff {

	
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\\\Work\\\\Automation\\\\Selenium\\\\Selenium Softwares\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		
		List<WebElement> allcompny = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
		List<WebElement> currentprise = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		String abc ="Just Dial";
		String xyz = "PTC India";
		for(int i=0; i<allcompny.size();i++)
		{
			if(allcompny.get(i).getText().equals(abc))
			{
				System.out.println("The Current Prise of Just Dial is " +currentprise.get(i).getText());
			}
			if(allcompny.get(i).getText().equals(xyz))
			{
				System.out.println("The Current Prise of PTC India is " + currentprise.get(i).getText());
			}

		}
		
	}

}
