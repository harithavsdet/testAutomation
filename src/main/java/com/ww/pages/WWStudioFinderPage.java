package com.ww.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class WWStudioFinderPage {

	WebDriver driver;

	public WWStudioFinderPage(WebDriver driver) {
		this.driver = driver;
	}

	By InPerson = By.xpath("(//span[@class='buttonText-3DCCO'])[1]");
	By locationSearchBox = By.id("location-search");
	By locationSearchButton = By.id("location-search-cta");

	public String getPageTitle() {
		return driver.getTitle();
	}

	public void clickInPerson() {
		driver.findElement(InPerson).click();
	}

	public SearchResultsPage searchForMeetingsByZipCode(String zipCode) {
		driver.findElement(locationSearchBox).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
		driver.findElement(locationSearchBox).sendKeys(zipCode);
		driver.findElement(locationSearchButton).click();
		return new SearchResultsPage(driver);
	}

}
