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

public class MaxValue 
{
	//Important Code //Video 25 Bhanu

	@Test
	public void MaxWebTableValue() throws InterruptedException, Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Work\\Automation\\Selenium\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.manage().window().maximize();

		Driver.get("https://money.rediff.com/gainers/bse/daily");
		
		String row = "//*[@id=\"leftcontainer\"]/table/tbody/tr";
		int rowsize = Driver.findElements(By.xpath(row)).size();
		
		//WebElement CurrentPrise = Driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[4]"));

		String firstpart = "//*[@id=\"leftcontainer\"]/table/tbody/tr[";
		String secondpart ="]/td[4]";
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i =1; i<rowsize; i++)
		{
			String Finalpart =firstpart+i+secondpart;
			System.out.println(Finalpart);
			
			String prise = Driver.findElement(By.xpath(Finalpart)).getText();
			
			NumberFormat numberformat = NumberFormat.getNumberInstance();
			Number num = numberformat.parse(prise);
			prise = num.toString();
			System.out.println(prise);
			Double m = Double.parseDouble(prise);
			int intprise = m.intValue();
			arr.add(intprise);
						
		}
			Collections.sort(arr);
			System.out.println(arr.get(0));
			System.out.println(arr.get(arr.size()-1));
			
	}
}
