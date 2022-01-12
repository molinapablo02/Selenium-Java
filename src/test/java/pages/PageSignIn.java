package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import helpers.Helpers;

public class PageSignIn {

	private WebDriver driver;
	
	private By emailField;
	private By passwordField;
	private By loginButton;
	
	
	public PageSignIn(WebDriver driver) {
		
		this.driver = driver;		
		emailField = By.xpath("//*[@id=\"email\"]");
		passwordField = By.xpath("//*[@id=\"passwd\"]");
		loginButton = By.xpath("//*[@id=\"SubmitLogin\"]/span/i");
		
	}
	
	
	
	public void singIn(String email, String password) {
		
		
		driver.findElement(emailField).sendKeys(email);
		driver.findElement(passwordField).sendKeys(password);
		driver.findElement(loginButton).click();
		
		Helpers h = new Helpers();
		h.sleepSeconds(4);
		
	}
	
	
	
	
}
