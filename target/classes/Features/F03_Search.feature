@Search
Feature:The feature will allow user to search function in the website
  Background:
    Scenario: The user can search for products and returns the correct results
      Given User Navigate to the home page or any page where the search field is visible
      And User type a search word in the appropriate search field and click on the search icon
      And The website returns some results
      And The user click on advanced search and use it to narrow down the results
      Then The final results should match the selected filter and search keywords