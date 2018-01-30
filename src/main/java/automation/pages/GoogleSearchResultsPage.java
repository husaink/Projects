package automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchResultsPage {
	private final WebDriver driver;

	@FindBy(css = ".g .r")
	private WebElement firstHitDescriptionText;
	@FindBy(css = ".g .r")
	private WebElement secHitDescriptionText;
	@FindBy(css = ".g .r")
	private WebElement thirdHitDescriptionText;

	public GoogleSearchResultsPage(WebDriver commonDriver) {
		driver = commonDriver;
		PageFactory.initElements(driver, this);
	}

	public String firstHitTitle() {
		return firstHitDescriptionText.getText();
	}
}
