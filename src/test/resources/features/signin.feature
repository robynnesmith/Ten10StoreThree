Feature: Sign In

  Scenario: Sign in as Registered User

    Given the user is on the "sign in" page

    When the user fills in sign in details with "registered" email

    Then the user has a "signed-in-account"



  Scenario: Sign in as Unregistered User

    Given the user is on the "sign in" page

    When the user fills in sign in details with "unregistered" email

    Then the user has a "invalid-account"


  Scenario: Sign in but forgotten password
    Given the user is on the "sign in" page

    When the user clicks "forgotten password"
    And fills in "password-email-form" on next page

    Then "alert message" is displayed


  Scenario: Sign out of Account
    Given the user is on the "sign in" page

    When the user clicks "sign out"

    Then the user has a "signed-out-account"


  Scenario: Change Account Preferences
    Given the user has a "signed-in-account"

    When the user navigates to "Information"
    And "change-preferences"

    Then "alert success message" is displayed


  Scenario: Sign in with Invalid password
    Given the user has a "signed-in-account"

    When the users inputs a wrong "password"

    Then "error message" is displayed


  Scenario: User adds address
    Given the user navigates to "Address"

    When the user adds a new address

    Then the new address is displayed


  Scenario: User adds message to order
    Given the user has a "signed-in-account"

    When the user navigates to a pre-existing order
    And adds a message

    Then the "updated order" alert is displayed


  Scenario: User inputs invalid E-Mail to change password
    Given the user is on the "sign in" page

    When the user inputs an "unregistered" email in the forgotten password input

    Then the "unregistered email alert" is displayed