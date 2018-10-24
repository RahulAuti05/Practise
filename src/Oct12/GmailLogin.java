package Oct12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\\\Work\\\\Automation\\\\Selenium\\\\Selenium Softwares\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/ServiceLogin/signinchooser?passive=1209600&continue=https%3A%2F%2Faccounts.google.com%2FManageAccount&followup=https%3A%2F%2Faccounts.google.com%2FManageAccount&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("rahul.auti14@gmail.com"); 
		driver.findElement(By.xpath("//div[@id='identifierNext'] ")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("5"); 
		driver.findElement(By.xpath("//div[@id='passwordNext'] ")).click();;
		driver.findElement(By.xpath("//a[@aria-label='Google apps'] ")).click();
		driver.findElement(By.xpath("//a[@href='https://mail.google.com/mail/']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\":li\"]/div/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\":qz\"]")).sendKeys("shitalgunjal66@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\":q7\"]")).click();
		System.out.println("The email Sent Successfully");
		

	}

}
