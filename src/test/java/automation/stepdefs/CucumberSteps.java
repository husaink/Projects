package automation.stepdefs;

import automation.pages.CucumberHomePage;
import automation.pages.CucumberVidoesPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;

public class CucumberSteps {
	
	private final CucumberHomePage cukeHomepage;
	private  CucumberVidoesPage cukeVideoPage;
	
	public CucumberSteps(final CucumberHomePage cukeHomePage) {
		this.cukeHomepage = cukeHomePage;
		
	}
	
	@When("^I click videos link$")
	public void click_on_link() throws Throwable{
	this.cukeVideoPage = this.cukeHomepage.clickOnVideos();
	}
	
	@Then("^I am shown list of videos$")
	public void list_of_videos() throws Throwable{
		assertTrue(" Videos are not displayed " , this.cukeVideoPage.validateVideosAreDisplayedPage() );
	}
	

}
