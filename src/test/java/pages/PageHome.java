package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helpers.Helpers;

public class PageHome {

	private WebDriver driver;

	private By searchField;
	private	By searchButton;
	private By signInButton;
	private By womenButton;
	
	
	public PageHome(WebDriver driver) {
		
		this.driver = driver;
		searchField = By.id("search_query_top");
		searchButton = By.name("submit_search");
		signInButton = By.className("login");
		womenButton = By.className("sf-with-ul");
		
	}
	
	
	public void searchEjemplo1(String item) {
		
		driver.findElement(searchField).sendKeys(item);
		//Helpers helper = new Helpers();
		//helper.sleepSeconds(5);
		driver.findElement(searchButton).click();
		//helper.sleepSeconds(5);
		
	}
	
	
	public void clickSignIn() {
		
		//Helpers helper = new Helpers();
		//helper.sleepSeconds(6);
		driver.findElement(signInButton).click();
		//helper.sleepSeconds(3);
		
	}
	
	
	public void clickWomen() {
		//Helpers helper = new Helpers();
		//helper.sleepSeconds(5);
		driver.findElement(womenButton).click();
		
		
	}
	
	
	
}
