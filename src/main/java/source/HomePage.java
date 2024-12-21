package source;



import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage 
{
	WebDriver driver;
	//step1 locating each component using @FindBy annotation
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	WebElement accountandlist;
	
	@FindBy(xpath="//span[.='Sign in']")
	WebElement sign_in;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement search_comp;
	
	@FindBy(xpath="//span[.='Sign Out']")
	WebElement sign_out;
	
	@FindBy(xpath="(//div[@class='a-section a-spacing-base'])[6]")
	WebElement shoe;
	
	//step2 create a method to perform its action on component
	public void aandlist(WebDriver driver)
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(accountandlist).perform();
		
	}
	public void signin()
	{
		sign_in.click();
	}
	public void search()
	{
		search_comp.sendKeys("shoes" + Keys.ENTER);
	}
	
	public void signout()
	{	
//		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(15));
//	    wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[.='Sign Out']")));
//		
//		
//		WebDriverWait w3=new WebDriverWait(driver,Duration.ofSeconds(10));
//		w3.until(ExpectedConditions.elementToBeClickable(sign_out));
		sign_out.click();
	}
	
	public void product() throws InterruptedException 
	{
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(15));
	    wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='a-section a-spacing-base'])[6]")));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(shoe));
	    shoe.click();
		
		
	}
	
	
	//step 3 
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}

