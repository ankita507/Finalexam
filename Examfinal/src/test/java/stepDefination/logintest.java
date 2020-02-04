package stepDefination;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class logintest {
     public static WebDriver driver;
     @Given("^user open TestMeApp$")
     public void useropentestmeapp()
     {
    	 System.setProperty("webdriver.chrome.driver", "C:\\selenium_drivers\\chromedriver\\chromedriver.exe");
 		driver = new ChromeDriver();
 		driver.get("http:10.232.237.143:443/TestMeApp/");
 		driver.manage().window().maximize();
 		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
 		System.out.println("in login");
     }
     
     
     @When("^user click signin button$")
     public void userclickonsigninbuttin()
     {
    	 driver.findElement(By.xpath("//a[@href='login.htm']")).click();
     }
     
     @And("^enter credentials as$")
 	public void entercredeintial(DataTable dt)
 	{
 		List<String> cred = dt.asList(String.class);
 		driver.findElement(By.name("userName")).sendKeys(cred.get(0));
 		driver.findElement(By.name("password")).sendKeys(cred.get(1));	
 		
 	}
     @Then("^click on login$")
     public void userclickonloginbutton()
     {
    	 driver.findElement(By.name("Login")).click();
    	 System.out.println("user successfully login");
     }
	
	
}
