package brokenlink;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenLinks01 
{
	@Test
	public void method()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=713930225169&hvpos=&hvnetw=g&hvrand=1069839342210574799&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062136&hvtargid=kwd-64107830&hydadcr=14452_2402225&gad_source=1");
		
		List<WebElement> l1=driver.findElements(By.tagName("a"));
		int size=l1.size();
		
		for(int i=0;i<size;i++)
		{
			WebElement e1=l1.get(i);
			String s1=e1.getText();
			System.out.println(s1);
		}
	}
}
