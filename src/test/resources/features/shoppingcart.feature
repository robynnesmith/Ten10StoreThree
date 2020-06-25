Feature: ShoppingCart

  Background:
    Given the user is on the "homepage" page

  Scenario: Remove item from basket
    Given the user already has an item in their basket
    And the user is on the shopping cart page
    When the user clicks the "delete" button
    Then verify the "item is removed from the basket" v


  Scenario: Increase quantity of product
    Given the user already has an item in their basket
    And the user is on the "shopping cart" page
    When user "increases" quantity of product
    Then verify the "basket is updated" v
    And verify the Product counter is updated.


  Scenario: Proceed to checkout - not signed in
    Given the user is on the "shopping cart" page
    And the user already has an item in their basket
    When the user clicks the "proceed to checkout" button
    Then verify the "sign in page is displayed" v


  Scenario: Proceed to checkout - signed in
    Given the user is on the "homepage" page
    When the user hovers over a product and the clicks the add to cart button
    Then verify the "item has been added to the cart" v


  Scenario:
    Given the user is on the shopping cart page
    And user has 2 items in basket
    When user "decreases" quantity of product
    Then verify the "basket is updated" v
    And verify the Product counter is updated.
    And pricing and totals should be updated