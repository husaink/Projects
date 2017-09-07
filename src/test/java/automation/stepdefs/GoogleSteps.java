package automation.stepdefs;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import automation.pages.GoogleSearchPage;
import automation.pages.GoogleSearchResultsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java8.En;

public class GoogleSteps implements En{
	private final GoogleSearchPage googleSearchPage;
	private final GoogleSearchResultsPage googleSearchResultsPage;
	
	private final Logger logger = LoggerFactory.getLogger(GoogleSteps.class);

	public GoogleSteps(GoogleSearchPage commonGoogleSearchPage, GoogleSearchResultsPage commonGoogleSearchResultsPage) {
		googleSearchPage = commonGoogleSearchPage;
		googleSearchResultsPage = commonGoogleSearchResultsPage;
	}

	@Given("^I am using (.*)$")
	public void i_am_using_Google(String searchTerm) throws Throwable {
		logger.info("Loading page");
		googleSearchPage.load(searchTerm);
		logger.debug("Loaded page");
	}
	
	 
	@When("^I search for (.*)$")
	public void i_search_for_search_term(String searchTerm) throws Throwable {
		googleSearchPage.searchFor(searchTerm);
	}

	@Then("^I am shown search results for (.*)$")
	public void i_am_shown_search_results_for_search_term(String searchTerm) throws Throwable {
		assertThat(googleSearchResultsPage.firstHitTitle().toLowerCase(), containsString(searchTerm));
	}
}
