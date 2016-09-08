package dhsFlashSmokeTests.DHSFlashSmokeTests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import dhsFlashSmokeTests.Pages.Home;
import static org.junit.Assert.*;

public class CheckHomePage extends AbstractTest {
	Home homePage;
	String homeMessage = "Send some Kudos";
	String pageTitle = "Home | kudos";

	@Test (priority = 0)
	public void checkPageLoad() {
		homePage = new Home(driver);
		assertEquals(pageTitle, homePage.getPageTitle());
	}
	
	@Test (priority = 1)
	public void checkInHomePage() {
		waitDriver.until(ExpectedConditions.visibilityOf(homePage.getHomePage()));
		assertTrue(homePage.getHomePage().isDisplayed());
	}
	
	@Test (priority = 2)
	public void checkHomeContent() {
		waitDriver.until(ExpectedConditions.visibilityOf(homePage.getHomeContent()));
		assertTrue(homePage.getHomeContent().isDisplayed());
	}
}

