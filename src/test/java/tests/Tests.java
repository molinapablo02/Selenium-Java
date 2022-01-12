package tests;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helpers.Helpers;
import pages.PageHome;
import pages.PageSignIn;
import pages.PageWomen;


public class Tests {

	private WebDriver driver;
	
	
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void setUp() {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	
	
	//@Test
	public void pruebaUno() {
	
		PageHome pagehome = new PageHome(driver);
		pagehome.searchEjemplo1("aaa");
		
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"center_column\"]/p")).getText().contains("No results were found for your search"));
		
		
		
	}
	//@Test
	public void login() {
		
		PageHome pagehome = new PageHome(driver);
		pagehome.clickSignIn();
		
		PageSignIn pageSign = new PageSignIn(driver);
		pageSign.singIn("pablo", "hola");
		
		
		
		
	}
	
	@Test
	public void selectWomen() {
		
		PageHome pagehome = new PageHome(driver);
		pagehome.clickWomen();
		
		PageWomen selectBySort = new PageWomen(driver);
		selectBySort.selectByVisibleText("Price: Lowest first");
		selectBySort.selectByIndex(2);
		selectBySort.selectByValue("name:asc");
		
		
	}
		
		

	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
}
