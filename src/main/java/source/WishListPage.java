package source;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
public class WishListPage 
{
	WebDriver driver;
	@FindBy(id="add-to-wishlist-button-submit")
	WebElement wishlist_btn;
	@FindBy(xpath="//button[@class=' a-button-close a-declarative']")
	WebElement close_btn;
	
	@FindBy(id="add-to-cart-button")
	WebElement cart_btn;
	@FindBy(xpath="//span[@id='nav-cart-count']")
	WebElement go_to_cart;
	
	@FindBy(xpath="//input[@aria-label='Delete BRUTON EVA Lite Sport Shoes Running Shoes for Men- Blue, UK 10']")
	WebElement delete_cart;
	
	@FindBy(linkText="Your Wish List")
	WebElement yourWishList;
	
	@FindBy(xpath="//input[@aria-labelledby='delete-button-IKFKM5U01LH1P-announce']")
	WebElement del;
	
	public void wishlist()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(wishlist_btn));
	    
		wishlist_btn.click();
	}
	public void close_wishlist()
	{
		close_btn.click();
	}
	public void cart()
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(cart_btn));
		cart_btn.click();
		
	}
	public void go2cart()
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(go_to_cart));
		go_to_cart.click();
	}
	
	public void remove_cart()
	{
		delete_cart.click();
	}
	
	public void your_wishList()
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(yourWishList));
		yourWishList.click();
	}
	
	public void rm_wishlist()
	{
		del.click();
	}
	public WishListPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
}
