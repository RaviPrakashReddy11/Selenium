package brokenlink;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks02 
{
	public static void main(String[] args) throws IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		List<WebElement> l1=driver.findElements(By.tagName("a"));
		int size=l1.size();
		
		for(int i=0;i<size;i++)
		{
			WebElement e1=l1.get(i);
			String url=e1.getDomAttribute("href");
			System.out.println(url);
			verify(url);
			
		}
	}
	static void verify(String url) throws IOException
	{
		URL u1= new URL(url);
		HttpURLConnection u2= (HttpURLConnection) u1.openConnection();
		if(u2.getResponseCode()==200)
		{
			System.out.println("Link is valid: "+ url+" "+u2.getResponseMessage());
		}
		else
		{
			System.out.println("Link is not valid: "+ url+" "+u2.getResponseMessage());
		}
	}
}
