package test;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

import source.HomePage;
import source.LoginPage;
import source.WishListPage;

public class TestCase4 extends LaunchandQuit
{
	    @Test
		public void method1() throws InterruptedException
		{
			HomePage h1=new HomePage(driver);
			h1.aandlist(driver);
			h1.signin();
			
			LoginPage l1=new LoginPage(driver);
			
			l1.un();
			l1.continue01();
			l1.pwd();
			l1.sigin();
			h1.search();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			h1.product();
			Set<String> s1=driver.getWindowHandles();
			Iterator<String> i1=s1.iterator();
			String parentid=i1.next();
			String childid=i1.next();
			driver.switchTo().window(childid);
			WishListPage w1=new WishListPage(driver);
			w1.wishlist();
			w1.close_wishlist();
			w1.cart();
			Thread.sleep(10000);
			driver.switchTo().window(parentid);
			h1.aandlist(driver);
			h1.signout();  
			
	}
}
