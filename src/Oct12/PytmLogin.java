package Oct12;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PytmLogin {

	public static void main(String[] args) throws Exception 
	{
	
		System.setProperty("webdriver.chrome.driver", "E:\\\\Work\\\\Automation\\\\Selenium\\\\Selenium Softwares\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Log In/Sign Up']")).click();
		List<WebElement> totalframe = driver.findElements(By.tagName("iframe"));
		System.out.println("The total no of frame is "+totalframe.size());
		
		for(int i=0;i<totalframe.size();i++)
		{
			driver.switchTo().frame(i);
			if(driver.findElements(By.xpath("//span[text()='Login/Signup with mobile number and password']")).size()== 1)
			{				
				driver.findElement(By.xpath("//span[text()='Login/Signup with mobile number and password']")).click();
				break;
				
			}
			driver.switchTo().defaultContent();
		}
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("abcd@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abcd@gmail");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/md-content/button")).click();
		System.out.println("Test Success");
		
		
	}

}
