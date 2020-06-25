Feature: Registration

  Scenario: Register User with Already Registered Account
    Given the user is on the "sign in" page
    When the user completes the registration form with a "registered" email address
    Then the already registered alert is displayed


  Scenario: Register User with New User
      Given the user is on the "sign in" page
      When the user completes the registration form with a "unregistered" email address
      Then the account page is displayed


  Scenario: Register User with name using Numeric values
    Given the user is on the "sign in" page
    When the user completes the registration form with a numeric name
    Then the invalid name alert is displayed


  Scenario: Register User with password using Numeric values
    Given the user is on the "sign in" page
    When the user completes the registration form with a numeric password
    Then the invalid password alert is displayed


  Scenario: Register User with invalid Birthdate
    Given the user is on the "sign in" page
    When the user completes the registration form with an String birthdate
    Then the invalid birthdate alert is displayed