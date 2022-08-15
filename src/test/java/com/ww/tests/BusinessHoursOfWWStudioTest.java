package com.ww.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ww.pages.MeetingLocationPage;
import com.ww.pages.SearchResultsPage;
import com.ww.pages.WWStudioFinderPage;

public class BusinessHoursOfWWStudioTest extends BaseTest {

	public static final String EXPECTED_PAGE_TITLE = "Find WW Studios & Meetings Near You | WW USA";
	public static final String ZIP_CODE = "10011";	

	@Test
	public void wWStudioBusinessHours() {
		
		WWStudioFinderPage finderPage = new WWStudioFinderPage(driver);
		Assert.assertTrue(finderPage.getPageTitle().contains(EXPECTED_PAGE_TITLE));
		finderPage.clickInPerson();
		SearchResultsPage resultsPage = finderPage.searchForMeetingsByZipCode(ZIP_CODE);

		String firstSearchResultTitle = resultsPage.getFirstSearchResultTitle();
		MeetingLocationPage locationPage = resultsPage.clickFirstSearchResult();

		String meetingLocationTitle = locationPage.getMeetingLocationTitle();
		Assert.assertEquals(meetingLocationTitle, firstSearchResultTitle);
		locationPage.printBusinessHours();
		
	}

}
