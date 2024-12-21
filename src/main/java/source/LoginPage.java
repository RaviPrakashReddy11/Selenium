package source;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	WebDriver driver;
	@FindBy(name="email")
	WebElement email_enter;
	@FindBy(xpath="//input[@id='continue']")
	WebElement btn_continue;
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	@FindBy(xpath="//span[@id='auth-signin-button']")
	WebElement btn_signin;
	
	
	public void un()
	{
		email_enter.sendKeys("9849916886");
	}
	public void continue01()
	{
		
		btn_continue.click();
	}
	public void pwd()
	{
		password.sendKeys("BubuSwan@1106");
	}
	public void sigin()
	{
		btn_signin.click();
	}

	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
