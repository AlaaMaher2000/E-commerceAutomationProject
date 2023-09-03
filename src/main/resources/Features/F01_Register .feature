@Registration
Feature: this feature will allow users to users could register with new accounts
 Scenario: users could register with new accounts
  Given  user select register button
  And user select gender type
  And user enter first name automation and last name tester
  And user enter date of birth
  And user enter email "test@example.com" field
  And user fills Password fields
  And Check the news letter
  And user clicks on register button
  Then success message is displayed
