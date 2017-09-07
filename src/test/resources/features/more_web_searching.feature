@complete
Feature: Search the web some more to demonstrate parallel testing
  As an ignorant
  In order to learn things
  I want to be able to find stuff on the web

  Scenario: Search for word beginning with C
    Given I am using Google
	When I search for cucumber
	Then I am shown search results for cucumber
	
	

  
