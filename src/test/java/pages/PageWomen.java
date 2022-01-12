package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import helpers.Helpers;

public class PageWomen {

	private WebDriver driver;
	private By womenVisibleTextDrop;
	private By womenIndexDrop;
	private By womenValueDrop;
public PageWomen(WebDriver driver) {
		
		this.driver = driver;
		
		womenVisibleTextDrop = By.id("selectProductSort");
		womenIndexDrop = By.id("selectProductSort");
		womenValueDrop = By.id("selectProductSort");
	}

public void selectByVisibleText(String text) {
	
	//Helpers helper = new Helpers();
	//helper.sleepSeconds(5);
	
	Select selectWomenDrop = new Select(driver.findElement(womenVisibleTextDrop));
	selectWomenDrop.selectByVisibleText(text);
	//helper.sleepSeconds(5);
}

public void selectByIndex(int index) {
	//Helpers helper = new Helpers();
	//helper.sleepSeconds(5);
	
	Select indexDrop = new Select(driver.findElement(womenIndexDrop));
	indexDrop.selectByIndex(index);
	//helper.sleepSeconds(3);
	
}

public void selectByValue(String value) {
	//Helpers helper = new Helpers();
	//helper.sleepSeconds(5);
	Select valueDrop = new Select(driver.findElement(womenValueDrop));
	valueDrop.selectByValue(value);
	//helper.sleepSeconds(3);
	
	
}



}
