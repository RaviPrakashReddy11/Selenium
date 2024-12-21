package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import source.HomePage;
import source.LoginPage;

public class TestCase1 extends LaunchandQuit //login amazon
{
	@Test
	public void loginamazon()
	{
		
		HomePage h1=new HomePage(driver);
		h1.aandlist(driver);
		h1.signin();

		LoginPage l1=new LoginPage(driver);
		l1.un();
		l1.continue01();
		l1.pwd();
		l1.sigin();
		 
	}
}
