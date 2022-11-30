package com.sampleTest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SampleTest {


	WebDriver wd;

	@Given("Open Browser as {string}")
	public void OpenBrowser(String Browser){
		if(Browser.contentEquals("Chrome")){
		System.setProperty("webdriver.chrome.driver", "D:\\Vcentury_Selinium\\Workspace\\C4_WebdriverTest\\WebDriver\\chromedriver.exe");
		wd=new ChromeDriver();
		wd.manage().window().maximize();
			
		}
		System.out.println("----------Open Browser------------"+Browser);	
	}
	
	@When("Enter URL as {string}")
	public void EnterURL(String URL){
		wd.get(URL);
		System.out.println("----------Enter URL------------"+URL);
	}
	/*
	@When("Click Login Link")
	public void ClickLoginLink(){
		wd.findElement(by)
		System.out.println("----------Click Login Link------------");
	}
	
	@Then("Verify Login Page Loaded or Not")
	public void VerifyLoginPageLoadedorNot(){
		System.out.println("----------Verify Login Page Loaded or Not------------");
	}
	*/
	@When("Enter Username as {string}")
	public void EnterUsername(String Username){
		WebElement username = wd.findElement(By.name("username"));
		username.sendKeys(Username);
		System.out.println("----------Enter Username------------"+Username);
	}
	
	@And("Enter Password as {string}")
	public void EnterPassword(String Password){
		WebElement password = wd.findElement(By.name("password"));
		password.sendKeys(Password);
		System.out.println("----------Enter Password------------"+Password);
	}
	
	@When("Click Login button")
	public void ClickLoginbutton(){
		
		WebElement login = wd.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		System.out.println("----------Click Login button------------");
	}
	
	@Then("Verify Login Success or Not")
	public void VerifyLoginSuccessorNot(){
		System.out.println(wd.getTitle());
		System.out.println("----------Verify Login Success or Not--------");
		
	}	
	
}


