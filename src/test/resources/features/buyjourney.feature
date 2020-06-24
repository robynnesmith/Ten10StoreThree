Feature: BuyJourney

    Scenario: Select item from homepage
    Given the user is on the "home" page
    When the user clicks on more button
    Then the item page is displayed


    Scenario: Add product to cart from homepage
    Given the user is on the "home" page
    When the user adds an item to the basket
    Then the item is in the basket


    Scenario: Add product to cart from product page
    Given the user is on the "product" page
    When the user adds item to basket from product page
    Then the item is in the basket from product page

    Scenario: Add a message
    Given the user is on the "sign in" page
    And the user is logged in
    When the user fills out message form on previous order
    Then the message has been added


    Scenario: Subscribe to news and special sales
    Given the user is on the "home" page
    When the user completes the newsletter form with valid email address
    Then a successfully subscribed message is displayed


    Scenario: Proceed to Contact Us page and send a message

    Given the user is on the "contact us" page
    When the user completes the contact us form
    Then the confirmation message is displayed

