package automation.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CucumberVidoesPage {
	
	@FindBy(xpath="//*[@id='content']/div/div/div/table/tbody")
	private WebElement tableBody;
	
	//private List<WebElement> tableElements;
	
	private final WebDriver driver ;
	
	
	public CucumberVidoesPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
	}
	
	public boolean validateVideosAreDisplayedPage()
	{
		return this.tableBody.isDisplayed();
	}

}
