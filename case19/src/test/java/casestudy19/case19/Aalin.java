package casestudy19.case19;

import java.util.List;
import java.util.Map;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class Aalin {
	
		
	public static WebDriver driver;
	Actions action;
	

	
	@Given("Launch chrome and load TestMeApp")
	public void launch_chrome_and_load_TestMeApp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\test\\Downloads\\chromedriver_win32\\chromedriver.exe");
	     driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("http://192.168.40.4:8083/TestMeApp1");
	  
	}

	@Given("navigate to signup")
	public void navigate_to_signup() {
		driver.findElement(By.xpath(".//a[contains(text(),\"SignUp\")]")).click();
	  
	}

	@Given("enter the credentials")
	public void enter_the_credentials(io.cucumber.datatable.DataTable dataTable) {

		List<Map<String,String>> list = dataTable.asMaps(String.class,String.class);
		
		//System.out.println(list.get(0).get("username"));
		  driver.findElement(By.name("userName")).sendKeys(list.get(0).get("userName"));
		     driver.findElement(By.name("firstName")).sendKeys(list.get(0).get("firstName"));
		     driver.findElement(By.name("lastName")).sendKeys(list.get(0).get("lastName"));
		     driver.findElement(By.name("password")).sendKeys(list.get(0).get("password"));
		     driver.findElement(By.name("confirmPassword")).sendKeys(list.get(0).get("Confirm password"));
		     driver.findElement(By.xpath(".//span[contains(text(),\"Male\")]"));
		     
		     driver.findElement(By.name("emailAddress")).sendKeys(list.get(0).get("Email"));
		     driver.findElement(By.name("mobileNumber")).sendKeys(list.get(0).get("MobileNumber"));
		     driver.findElement(By.name("dob")).sendKeys(list.get(0).get("DOB"));
		     driver.findElement(By.name("address")).sendKeys(list.get(0).get("Address"));
		     
		     Select s=new Select(driver.findElement(By.id("securityQuestion")));
		     s.selectByIndex(1);
		     		
		     		driver.findElement(By.name("answer")).sendKeys(list.get(0).get("Answer"));
		     		
	   
	}

	@Then("click on register button")
	public void click_on_register_button() {
		driver.findElement(By.xpath(".//input[@value=\"Register\"]")).click();
		
	  
	}



}
