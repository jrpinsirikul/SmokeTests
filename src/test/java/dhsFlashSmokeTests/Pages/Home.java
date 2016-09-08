package dhsFlashSmokeTests.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class Home {
	WebDriver driver;

	@FindBy(className="home")
	WebElement homePage;
	
	@FindBy(id="page-wrapper")
	WebElement homeContent;

	/**
	 * Initializes home page element
	 * @param driver the driver to interact with browser
	 */
	public Home(WebDriver driver) {
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 15);
		PageFactory.initElements(factory, this);
	}
	
	/**
	 * Gets the home page title
	 * @return the page's title
	 */
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	/**
	 * Getter for the element that contains the home page
	 * @return the home element
	 */
	public WebElement getHomePage() {
		return homePage;
	}
	
	/**
	 * Getter for the element that contains home page content
	 * @return the content
	 */
	public WebElement getHomeContent() {
		return homeContent;
	}
}