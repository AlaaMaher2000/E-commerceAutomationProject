@Login
Feature: this feature will allow users to users could To login with new accounts
  Background:
    Scenario: user could login with valid email and password
      Given user go to login page
      And user login with "valid" "test@example.com" and "P@ssw0rd"
      And user press on login button
      Then user login to the system successfully


    Scenario: user could login with invalid email and password
      Given user go to login page
      And user login with "invalid" "wrong@example.com" and "P@ssw0rd"
      And user press on login button
      Then user could not login to the system