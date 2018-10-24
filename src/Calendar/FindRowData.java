package Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindRowData 
{

	@Test
	public void MaxWebTableValue() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Automation\\Selenium\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();

		Driver.get("https://money.rediff.com/gainers/bse/daily");
		Thread.sleep(1000);
		
		//find xpath is important in table we select all tr
		//int rows = Driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr")).size();
	//	System.out.println(rows);
		//find xpath is important in table we select first ttr and then td
	//	int Cols = Driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[1]/td")).size();
	//	System.out.println(Cols);
		
		//=-----------Find Max Value Prise from table----------//
		
	//Method 1 - Harcoede Method
		
		String rowsData = Driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[8]/td[4]")).getText();
		System.out.println(rowsData);
		
	//Method -2 Best Way -- Xpath	
		String CompanyName  = Driver.findElement(By.xpath("//a[contains(text(),'Ecoplast  L')]//parent::*/following-sibling::td[3]")).getText();
		System.out.println(CompanyName);


	
		
		
		
			
	}
}
