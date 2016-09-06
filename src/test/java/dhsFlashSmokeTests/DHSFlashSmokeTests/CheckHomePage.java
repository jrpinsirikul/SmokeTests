package dhsFlashSmokeTests.DHSFlashSmokeTests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import dhsFlashSmokeTests.Pages.Home;
import static org.junit.Assert.*;

public class CheckHomePage extends AbstractTest {
	Home homePage;
	String homeMessage = "Send some Kudos";

	@Test (priority = 0)
	public void checkPageLoad() {
		homePage = new Home(driver);
		waitDriver.until(ExpectedConditions.visibilityOf(homePage.getHomeMessage()));
		assertEquals(homeMessage, homePage.getMessageText());
	}
	
	@Test (priority = 1)
	public void checkKudosLevels() {
		assertTrue(homePage.getKudosBronze().isDisplayed());
		assertTrue(homePage.getKudosSilver().isDisplayed());
		assertTrue(homePage.getKudosGold().isDisplayed());
	}
	
	@Test (priority = 2)
	public void checkSubmitButton() {
		assertTrue(homePage.getSubmitButton().isDisplayed());
	}
}

