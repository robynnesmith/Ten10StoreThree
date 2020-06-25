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


    Scenario: Add item to cart from Summer Dresses page
    Given the user is on the "summer dresses" page
    When the user adds an item to cart through quick view
    Then the item is added to cart from summer dresses


    Scenario: Add item via catalogue search
    Given the user is on the "home" page
    When the user types product name into search our catalogue bar
    And completes adding item to cart
    Then item is added to cart from search

    Scenario: Adding high amount of quantity to item
    Given the user is on the "product" page
    When the user enters a high value in the quantity field
    Then insufficient stock message is displayed

    Scenario: Check that the product page displays "Product available with different options"
    Given the user is on the "home" page
    When the user selects a product with different options
    Then the message 'Product available with different options' is displayed
        And the user is on the "sign in" page



