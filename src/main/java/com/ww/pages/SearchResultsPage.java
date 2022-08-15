package com.ww.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultsPage {

	WebDriver driver;

	public SearchResultsPage(WebDriver driver) {
		this.driver = driver;
	}

	By firstResultTitle = By.xpath("(//a[@class='linkUnderline-1_h4g'])[1]");
	By firstResultDistance = By.xpath("(//span[@class='distance-OhP63'])[1]");
	
	public String getFirstSearchResultTitle()
	{
		String firstResTitle=driver.findElement(firstResultTitle).getText();
		String firstResDistance=driver.findElement(firstResultDistance).getText();
		
		System.out.println("First search result title: "+firstResTitle);
		System.out.println("First search result distance: "+firstResDistance);
		
		return firstResTitle;
	}
	
	public MeetingLocationPage clickFirstSearchResult()
	{
		driver.findElement(firstResultTitle).click();
		return new MeetingLocationPage(driver);
	}
	
	

}
