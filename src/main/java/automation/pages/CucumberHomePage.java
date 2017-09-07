package automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CucumberHomePage {
	
	private final WebDriver driver ;
	
	@FindBy(linkText="Videos")
	private WebElement videosLink ;
	
public CucumberHomePage(WebDriver driver) {
	this.driver = driver ;
	PageFactory.initElements(driver, this);
}
	
 public CucumberVidoesPage clickOnVideos()
 {
	 this.videosLink.click();
	 return new CucumberVidoesPage(this.driver);
 }

}
