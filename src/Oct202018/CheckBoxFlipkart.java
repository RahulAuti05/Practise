package Oct202018;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CheckBoxFlipkart {

	public static void main(String[] args) throws Exception 
	{

		System.setProperty("webdriver.chrome.driver", "E:\\\\Work\\\\Automation\\\\Selenium\\\\Selenium Softwares\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//span[text()='Electronics']"));
		act.moveToElement(ele).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/smartwatches-store?otracker=nmenu_sub_Electronics_0_Smart%20Watches']")).click();
		/*WebElement ss = driver.findElement(By.xpath("//a[@href='/smartwatches-store?otracker=nmenu_sub_Electronics_0_Smart%20Watches']"));
		act.moveToElement(ss).click().build().perform();
		*/
	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='1205 MORE']")).click();
		Thread.sleep(3000);


	}

}
