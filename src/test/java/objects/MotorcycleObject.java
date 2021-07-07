package objects;


import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class MotorcycleObject {
	
	private WebDriver driver;
	private String url = "http://sampleapp.tricentis.com/101/index.php";
	private String makeValue = "Audi";
	private String modelValue = "Scooter";
	private String cylinderCapacity = "1";
	private String enginePerformance = "2000";
	private String dateOfManufacture = "09/24/1996";
	private String numberOfSeats = "1";
	private String listPrice = "500";
	private String annualMileage = "100";

	public void initialSetupChrome() {
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	}
	
	public void getTricentis() {
		driver.get(this.url);
	}
	
	public void getMenuMotorcycle() {
		driver.findElement(By.id("nav_motorcycle")).click();
	}
	
	public void setMake() {
		WebElement make = driver.findElement(By.id("make"));
		Select selectMake = new Select(make);
		selectMake.selectByValue(this.makeValue);
	}
	
	public void setModel() {
		WebElement model = driver.findElement(By.id("model"));
		Select selectMake = new Select(model);
		selectMake.selectByValue(this.modelValue);
	}
	
	public void setCylinderCapacity() {
		WebElement cylinderCap = driver.findElement(By.id("cylindercapacity"));
		cylinderCap.sendKeys(this.cylinderCapacity);
	}
	
	public void setEnginePerformance() {
		WebElement engPerformance = driver.findElement(By.id("engineperformance"));
		engPerformance.sendKeys(this.enginePerformance);
	}
	
	public void setDateOfManufacture() {
		WebElement dateofmanufacture = driver.findElement(By.id("dateofmanufacture"));
		dateofmanufacture.sendKeys(this.dateOfManufacture);
	}
	
	public void setNumberOfSeats() {
		WebElement numberOfSeats = driver.findElement(By.id("numberofseatsmotorcycle"));
		Select selectMake = new Select(numberOfSeats);
		selectMake.selectByValue(this.numberOfSeats);
	}
	public void setListPrice() {
		WebElement listprice = driver.findElement(By.id("listprice"));
		listprice.sendKeys(this.listPrice);
	}
	
	public void setAnnualMileage() {
		WebElement annualMileage = driver.findElement(By.id("annualmileage"));
		annualMileage.sendKeys(this.annualMileage);
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
