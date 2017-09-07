#Author: husain.koser@gmail.com

@complete
Feature: Validate Cucumber Videos link display training videos.


  Scenario: Validate Videos Link on Home page
    Given I am using Cucumber
    When I click videos link
    Then I am shown list of videos
