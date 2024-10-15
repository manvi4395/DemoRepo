Feature: Test google search functionality

  @Test1
  Scenario: Validate Google Search
    Given Browser is open
    And User is on google search page
    When User enters the text in search box
    And Hits enter
    Then User is navigated to search resultss
    
