package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import source.HomePage;
import source.LoginPage;

public class TestCase2 extends LaunchandQuit
{
	@Test
	public void loginamazon() throws InterruptedException
	{
		
		HomePage h1=new HomePage(driver);
		h1.aandlist(driver);
		h1.signin();

		LoginPage l1=new LoginPage(driver);
		l1.un();
		l1.continue01();
		
		l1.pwd();
		l1.sigin();
		Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		 
		
		Thread.sleep(1000);
		
		h1.search();
		
		h1.aandlist(driver);
		h1.signout();
		
		
	}
}
