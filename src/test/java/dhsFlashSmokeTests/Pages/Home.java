package dhsFlashSmokeTests.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class Home {
	WebDriver driver;

	@FindBy(xpath="//div[@id='kudosform']/h3")
	WebElement homeMessage;
	
	@FindBy(id="kudos_level_1")
	WebElement kudosBronze;
	
	@FindBy(id="kudos_level_2")
	WebElement kudosSilver;
	
	@FindBy(id="kudos_level_3")
	WebElement kudosGold;
	
	@FindBy(css="button[title='Log In']")
	WebElement submitButton;

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
	 * Gets the text of main message on form
	 * @return the message of the form
	 */
	public String getMessageText() {
		return homeMessage.getText();
	}
	
	/**
	 * Getter for the home message element to be interacted
	 * with in the test class
	 * @return the home message element
	 */
	public WebElement getHomeMessage() {
		return homeMessage;
	}
	
	/**
	 * Getter for the bronze kudos element for the tests
	 * @return the bronze kudos element
	 */
	public WebElement getKudosBronze() {
		return kudosBronze;
	}
	
	/**
	 * Getter for the silver kudos element for the tests
	 * @return the silver kudos element
	 */
	public WebElement getKudosSilver() {
		return kudosSilver;
	}
	
	/**
	 * Getter for the gold kudos element for the tests
	 * @return the gold kudos element
	 */
	public WebElement getKudosGold() {
		return kudosGold;
	}
	
	/**
	 * Getter for the submit button element for the tests
	 * @return the submit button element
	 */
	public WebElement getSubmitButton() {
		return submitButton;
	}
}