package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MedopractHRMsteps {

	WebDriver driver;
	
	@Given("launch Chrome browser")
	public void launch_chrome_browser() {
		driver=new ChromeDriver();
	}

	@When("enter the URL")
	public void enter_the_url() {
		driver.get("https://medopractapi-zk64betx7a-em.a.run.app/");
	}

	@Then("enter the Username and Password")
	public void enter_the_username_and_password() {
		
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("ashwinkv016");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("ashwinkv016");
	}

	@Then("Click on Submit Button")
	public void click_on_submit_button() {
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
	}

	@Then("close browser")
	public void close_browser() {
		driver.close();
	}

}
