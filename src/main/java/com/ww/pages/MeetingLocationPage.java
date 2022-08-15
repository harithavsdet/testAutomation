package com.ww.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MeetingLocationPage {
	
	
	WebDriver driver;

	public MeetingLocationPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By meetingLocationTitle = By.className("locationName-1jro_");	
	By businessHoursTitle = By.className("title-3o8Pv");
	By businessDays = By.className("dayName-CTNC6");	
	By businessHours = By.className("times-fms3v");	
	
	public String getMeetingLocationTitle()
	{
		return driver.findElement(meetingLocationTitle).getText();
	}
	
	public void printBusinessHours()
	{
		driver.findElement(businessHoursTitle).click();
		List<WebElement> days=driver.findElements(businessDays);
		List<WebElement> hours=driver.findElements(businessHours);
		
		for(int i=0; i<days.size(); i++)
		{
			System.out.println(days.get(i).getText()+" "+hours.get(i).getText());
		}
		
	}
	
}
