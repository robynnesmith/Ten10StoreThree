Feature: Sign In

  Scenario: Sign in as Registered User

    Given the user is on the "sign in" page

    When the user fills in sign in details with a "registered email"

    Then the user has a "signed in account"



  Scenario: Sign in as Unregistered User

    Given the user is on the "sign in" page

    When the user fills in sign in details with a "unregistered email"

    Then the user has a "invalid account"


  Scenario: Sign in but forgotten password
    Given the user is on the "sign in" page

    When the user clicks "forgotten password"
    And The user fills in "password email form" on next page

    Then "alert message" is displayed


  Scenario: Sign out of Account
    Given the user is on the "sign in" page

    When the user clicks "sign out"

    Then the user has a "signed out account"


  Scenario: Change Account Preferences
    Given the user is on the "sign in" page
    And the user fills in sign in details with a "registered email"
    And the user is on the "Information" page

    When The user fills in "change preferences form" on next page

    Then "alert success message" is displayed


  Scenario: Sign in with Invalid password
    Given the user is on the "sign in" page

    When the user fills in sign in details with a "wrong password"

    Then "wrong password alert" is displayed


  Scenario: User adds address
    Given the user is on the "sign in" page
    And the user fills in sign in details with a "registered email"
    And the user is on the "Address" page

    When The user fills in "new address form" on next page

    Then "new address" is displayed


  Scenario: User adds message to order
    Given the user is on the "sign in" page
    And the user fills in sign in details with a "registered email"
    And the user is on the "pre existing order" page

    When The user fills in "a message" on next page

    Then "updated order" is displayed


  Scenario: User inputs invalid E-Mail as forgotten password
    Given the user is on the "sign in" page
    And the user clicks "forgotten password"

    When The user fills in "invalid email form" on next page

    Then "unregistered email alert" is displayed