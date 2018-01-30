package automation.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import automation.config.TestConfig;

public class GoogleSearchPage {

	private final WebDriver driver;

	@FindBy(id = "lst-ib")
	private WebElement searchField;

	@FindBy(name = "btnG")
	private WebElement searchButton;
	
	@FindBy(name = "submit")
	private WebElement submitBtn;
	
	@FindBy(name = "clear")
	private WebElement clearButton;

	public GoogleSearchPage(WebDriver commonDriver) {
		driver = commonDriver;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
	}

	public void load(String url) throws Throwable {
		if ("Google".equals(url)) {
			driver.get(TestConfig.valueFor("GoogleBaseUrl"));
		} else if ("Cucumber".equals(url)) {
			driver.get(TestConfig.valueFor("CucumberUrl"));
		} else {
			throw new Error("Incorrect URL requested to load");
		}
	}

	public void searchFor(String searchString) {
		searchField.clear();
		searchField.sendKeys(searchString + "\n");
		searchButton.click();
	}
}
