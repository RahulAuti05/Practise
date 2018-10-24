package Calendar;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PrintTableData 
{
	//Important Code //Video 26 Bhanu

	@Test
	public void MaxWebTableValue() throws InterruptedException, Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Automation\\Selenium\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://money.rediff.com/gainers/bse/daily");
		
		
		String col= "//*[@id=\"leftcontainer\"]/table/tbody/tr[1]/td";
		int colssize =Driver.findElements(By.xpath(col)).size();
		
		System.out.println("The cols are " +colssize);
		
		String row = "//*[@id=\"leftcontainer\"]/table/tbody/tr";
		int rowsize = Driver.findElements(By.xpath(row)).size();
		
		System.out.println("The cols are " +rowsize);
						
		String firstpart="//*[@id=\"leftcontainer\"]/table/tbody/tr[";
		String secondpart="]/td[";
		String thirdpart="]";
		
		for(int i=1;i<=rowsize;i++)
		{
			for(int j=1;j<colssize;j++)
			{
				String finalpart = firstpart+i+secondpart+j+thirdpart;
				String text = Driver.findElement(By.xpath(finalpart)).getText();
				System.out.print(text +" ");
			}
			System.out.println();
		}
	}
}
