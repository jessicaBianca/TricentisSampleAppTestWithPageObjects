package objects;


import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import page.UseDataMotorcyclePage;


public class MotorcycleObject {
	
	private WebDriver driver;	
	UseDataMotorcyclePage data = new UseDataMotorcyclePage();
	

	public void initialSetupChrome() {
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	}
	
	public void getTricentis() {
		driver.get(data.getUrl());
	}
	
	public void getMenuMotorcycle() {
		driver.findElement(By.id("nav_motorcycle")).click();
	}
	
	public void setMake() {
		WebElement make = driver.findElement(By.id("make"));
		Select selectMake = new Select(make);
		selectMake.selectByValue(data.getMakeValue());
	}
	
	public void setModel() {
		WebElement model = driver.findElement(By.id("model"));
		Select selectMake = new Select(model);
		selectMake.selectByValue(data.getModelValue());
	}
	
	public void setCylinderCapacity() {
		WebElement cylinderCap = driver.findElement(By.id("cylindercapacity"));
		cylinderCap.sendKeys(data.getCylinderCapacity());
	}
	
	public void setEnginePerformance() {
		WebElement engPerformance = driver.findElement(By.id("engineperformance"));
		engPerformance.sendKeys(data.getEnginePerformance());
	}
	
	public void setDateOfManufacture() {
		WebElement dateofmanufacture = driver.findElement(By.id("dateofmanufacture"));
		dateofmanufacture.sendKeys(data.getDateOfManufacture());
	}
	
	public void setNumberOfSeats() {
		WebElement numberOfSeats = driver.findElement(By.id("numberofseatsmotorcycle"));
		Select selectMake = new Select(numberOfSeats);
		selectMake.selectByValue(data.getNumberOfSeats());
	}
	public void setListPrice() {
		WebElement listprice = driver.findElement(By.id("listprice"));
		listprice.sendKeys(data.getListPrice());
	}
	
	public void setAnnualMileage() {
		WebElement annualMileage = driver.findElement(By.id("annualmileage"));
		annualMileage.sendKeys(data.getAnnualMileage());
	}
	
	public void clickBtnNext() {
		driver.findElement(By.id("nextenterinsurantdata")).click();
	}
	
	public void validation() {
		assertEquals("Enter Insurant Data", driver.getTitle());
	}
	
	public void exitPage() {
		driver.quit();
	}
}
