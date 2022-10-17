package com.Open_MRS.testBase;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import com.Open_MRS.pageLayer.LoginPage;
import com.Open_MRS.pageLayer.Logout;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase{
	public static WebDriver driver;
	public Properties prop;
	//public LoginPage login;
	//public Logout logout;
	
	public void setup() throws IOException {
		
	    prop = new Properties();
		String propPath = System.getProperty("user.dir")+"\\src\\main\\java\\data.properties";
		FileInputStream fis = new FileInputStream(propPath);
		prop.load(fis);
		
		String br = prop.getProperty("browser");	
		if(br.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		
		else if(br.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		else if(br.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		else {
			System.out.println("Please Enter Valid Browser");
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
//		 login = new LoginPage();
//		 logout = new Logout();

	}
	
	public void inputText(String strXpath, String strInputText) {	
		WebElement wbOfInputText = driver.findElement(By.xpath(strXpath));
		wbOfInputText.sendKeys(strInputText);
	}
	
	public void selectBox(String strXpath, String strSelectChoice) {
		Select selectElement = new Select(driver.findElement(By.xpath(strXpath)));
		selectElement.selectByVisibleText(strSelectChoice);
	}
	
	public void clickElement(String strXpath) {
		WebElement wbOfClickElement = driver.findElement(By.xpath(strXpath));
		wbOfClickElement.click();
	}
	
	public void assertEquals(String strXpath, String strValue) {

		
		boolean isPresent = false;
		List<WebElement> lstWbFindRecord = driver.findElements(By.xpath(strXpath));

		for (WebElement webElementOfRecord : lstWbFindRecord) {
			if(strValue.equals(webElementOfRecord.getText())) {
				isPresent = true;
				webElementOfRecord.click();
				break;
			}
		}		
		Assert.assertTrue(isPresent, "Record doesnot exist "+strValue);
	}
}