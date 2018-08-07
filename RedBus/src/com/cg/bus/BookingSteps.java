package com.cg.bus;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BookingSteps {
	
	WebDriver driver;
	@Given("^User loads the redbus page$")
	public void user_loads_the_redbus_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\sunitsha\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.redbus.in//");
	}

	@Given("^User enters the From Location$")
	public void user_enters_the_From_Location() throws Throwable {
		WebElement test = driver.findElement(By.id("src"));
		test.sendKeys("Pune");
		Thread.sleep(2000);
		test.sendKeys(Keys.ENTER);
	
	}

	@Given("^User enters the To Location$")
	public void user_enters_the_To_Location() throws Throwable {
		WebElement test = driver.findElement(By.xpath("//*[@id=\"dest\"]"));
		test.sendKeys("Chennai");
		Thread.sleep(2000);
		test.sendKeys(Keys.ENTER);
	}

	
	
	@Given("^User enters the On-Wards date$")
	public void user_enters_the_On_Wards_date() throws Throwable {
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[4]/td[3]")).click();
		
			 }
	
	@Given("^User Searches for the bus$")
	public void user_Searches_for_the_bus() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"search_btn\"]")).click();
		
	}
	
	
	@Given("^User selects view seats button$")
	public void user_selects_view_seats_button() throws Throwable {
		Thread.sleep(3000);
	   driver.findElement(By.xpath("//*[@id=\"8368723\"]/div/div[2]/div[1]")).click();
	 
	   
	}

@Given("^User selects desired seats$")
public void user_selects_desired_seats() throws Throwable {
	Thread.sleep(4000);
	WebElement element = driver.findElement(By.xpath("//*[@id=\"rt_8368723\"]/div/div/div/div[2]/div[2]/div[2]/canvas"));

    Actions builder = new Actions(driver);
    builder.moveToElement(element,60,30).click().build().perform();
}


	@Given("^User selects boarding point location$")
	public void user_selects_boarding_point_location() throws Throwable {
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"8368723\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div[1]/ul/li[1]/span[2]")).click();
	
	}

	@Given("^User selects departure location$")
	public void user_selects_departure_location() throws Throwable {
		//driver.findElement(By.xpath("//*[@id=\"8368723\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div[2]/ul/li")).click();
		
	}

	@Then("^User selects procced to pay$")
	public void user_selects_procced_to_pay() throws Throwable {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"8368723\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[6]/button"));
		
	}
	
	/*@Then("^User details are filled$")
	public void user_details_are_filled() throws Throwable {
		Thread.sleep(2000);
		WebElement test=driver.findElement(By.xpath("//*[@id=\"seatno-04\"]"));
		test.sendKeys("Sunitha");
		List<WebElement> test1 = driver.findElements(By.xpath("//*[@id=\"23_0\"]"));
		test1.get(1).click();
		WebElement test2=driver.findElement(By.xpath("//*[@id=\"seatno-01\"]"));
		test2.sendKeys("21");
		WebElement test3=driver.findElement(By.xpath("//*[@id=\"seatno-05\"]"));
		test3.sendKeys("sunithasharma20@gmail.com");
		WebElement test4=driver.findElement(By.xpath("//*[@id=\"seatno-06\"]"));
		test4.sendKeys("9566247900");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div/div/div[2]/div[2]/input")).click();}
				*/
				
				
				
				
				
				
				
				
				
				
				





}
