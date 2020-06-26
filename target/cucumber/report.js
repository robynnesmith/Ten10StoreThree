$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/buyjourney.feature");
formatter.feature({
  "name": "BuyJourney",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Select item from homepage",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user is on the \"home\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefs.CommonStepDef.theUserIsOnThePage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on more button",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefs.BuyJourneyStepDef.clickMoreButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the item page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.BuyJourneyStepDef.verifyItemDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add product to cart from homepage",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user is on the \"home\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefs.CommonStepDef.theUserIsOnThePage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user adds an item to the basket",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefs.BuyJourneyStepDef.addItemToBasket()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the item is in the basket",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.BuyJourneyStepDef.veryItemAdded()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add product to cart from product page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user is on the \"product\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefs.CommonStepDef.theUserIsOnThePage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user adds item to basket from product page",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefs.BuyJourneyStepDef.addProductToBasket()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the item is in the basket from product page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.BuyJourneyStepDef.verifyItemInBasket()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add a message",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user is on the \"sign in\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefs.CommonStepDef.theUserIsOnThePage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is logged in",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.BuyJourneyStepDef.userLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user fills out message form on previous order",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefs.BuyJourneyStepDef.addMessageToOrder()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the message has been added",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.BuyJourneyStepDef.verifyMessageAdded()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Subscribe to news and special sales",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user is on the \"home\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefs.CommonStepDef.theUserIsOnThePage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user completes the newsletter form with valid email address",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefs.BuyJourneyStepDef.completeNewsletterSubscription()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a successfully subscribed message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.BuyJourneyStepDef.verifySubscribed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Proceed to Contact Us page and send a message",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user is on the \"contact us\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefs.CommonStepDef.theUserIsOnThePage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user completes the contact us form",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefs.BuyJourneyStepDef.completeContactUsForm()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the confirmation message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.BuyJourneyStepDef.verifyConfirmationMessage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add item to cart from Summer Dresses page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user is on the \"summer dresses\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefs.CommonStepDef.theUserIsOnThePage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user adds an item to cart through quick view",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefs.BuyJourneyStepDef.addItemThroughQuickView()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the item is added to cart from summer dresses",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.BuyJourneyStepDef.verifyItemIsInCart()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add item via catalogue search",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user is on the \"home\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefs.CommonStepDef.theUserIsOnThePage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user types product name into search our catalogue bar",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefs.BuyJourneyStepDef.searchProduct()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "completes adding item to cart",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.BuyJourneyStepDef.completeAddingItem()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "item is added to cart from search",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.BuyJourneyStepDef.itemAddedFromSearch()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Adding high amount of quantity to item",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user is on the \"product\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefs.CommonStepDef.theUserIsOnThePage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters a high value in the quantity field",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefs.BuyJourneyStepDef.enterHighQuantity()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "insufficient stock message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.BuyJourneyStepDef.verifyInsufficientStock()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check that the product page displays \"Product available with different options\"",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user is on the \"home\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefs.CommonStepDef.theUserIsOnThePage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user selects a product with different options",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefs.BuyJourneyStepDef.selectFadedShortSleeveShirt()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the message \u0027Product available with different options\u0027 is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.BuyJourneyStepDef.verifyDifferentOptionsMessage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the \"sign in\" page",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.CommonStepDef.theUserIsOnThePage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/registration.feature");
formatter.feature({
  "name": "Registration",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Register User with Already Registered Account",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user is on the \"sign in\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefs.CommonStepDef.theUserIsOnThePage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user completes the registration form with a \"registered\" email address",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefs.RegistrationStepDef.theUserCompletesRegistrationWithAnEmailAddress(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the already registered alert is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.RegistrationStepDef.theAlreadyRegisteredAlertIsDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Register User with New User",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user is on the \"sign in\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefs.CommonStepDef.theUserIsOnThePage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user completes the registration form with a \"unregistered\" email address",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefs.RegistrationStepDef.theUserCompletesRegistrationWithAnEmailAddress(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the account page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.RegistrationStepDef.theIsDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Register User with name using Numeric values",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user is on the \"sign in\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefs.CommonStepDef.theUserIsOnThePage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user completes the registration form with a numeric name",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefs.RegistrationStepDef.theUserCompletedTheRegistrationFormWithAName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the invalid name alert is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.RegistrationStepDef.theInvalidNameAlertIsDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Register User with password using Numeric values",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user is on the \"sign in\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefs.CommonStepDef.theUserIsOnThePage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user completes the registration form with a numeric password",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefs.RegistrationStepDef.theUserCompletesTheRegistrationFormWithANumericPassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the invalid password alert is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.RegistrationStepDef.theInvalidPasswordAlertIsDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Register User with invalid Birthdate",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user is on the \"sign in\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefs.CommonStepDef.theUserIsOnThePage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user completes the registration form with an String birthdate",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefs.RegistrationStepDef.theUserCompletesTheRegistrationFormWithAnStringBirthdate()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the invalid birthdate alert is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.RegistrationStepDef.theInvalidBirthdateAlertIsDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/shoppingcart.feature");
formatter.feature({
  "name": "ShoppingCart",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the user is on the \"homepage\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefs.CommonStepDef.theUserIsOnThePage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Remove item from basket",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user already has an item in their basket",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefs.ShoppingCartStepDef.theUserAlreadyHasAnItemInTheirBasket()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the shopping cart page",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.ShoppingCartStepDef.userIsOnThePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks the \"delete\" button",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefs.ShoppingCartStepDef.theUserClicks(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the \"item is removed from the basket\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.ShoppingCartStepDef.thenVerifyThe(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the user is on the \"homepage\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefs.CommonStepDef.theUserIsOnThePage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Increase quantity of product",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user already has an item in their basket",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefs.ShoppingCartStepDef.theUserAlreadyHasAnItemInTheirBasket()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the \"shopping cart\" page",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.CommonStepDef.theUserIsOnThePage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user \"increases\" quantity of product",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefs.ShoppingCartStepDef.quantityOfProduct(java.lang.String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat pageObjects.BasePage.checkTextExistsOnPage(BasePage.java:67)\r\n\tat pageObjects.ShoppingCartPage.checkThereAreTwoItems(ShoppingCartPage.java:105)\r\n\tat stepdefs.ShoppingCartStepDef.quantityOfProduct(ShoppingCartStepDef.java:36)\r\n\tat ✽.user \"increases\" quantity of product(file:///D:/IdeaProjects/Ten10StoreThree/src/test/resources/features/shoppingcart.feature:16)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "verify the \"basket is updated\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.ShoppingCartStepDef.thenVerifyThe(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify the Product counter is updated.",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the user is on the \"homepage\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefs.CommonStepDef.theUserIsOnThePage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Proceed to checkout - not signed in",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user is on the \"shopping cart\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefs.CommonStepDef.theUserIsOnThePage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user already has an item in their basket",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.ShoppingCartStepDef.theUserAlreadyHasAnItemInTheirBasket()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks the \"proceed to checkout\" button",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefs.ShoppingCartStepDef.theUserClicks(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the \"sign in page is displayed\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.ShoppingCartStepDef.thenVerifyThe(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the user is on the \"homepage\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefs.CommonStepDef.theUserIsOnThePage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Proceed to checkout - signed in",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user is on the \"homepage\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefs.CommonStepDef.theUserIsOnThePage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user hovers over a product and the clicks the add to cart button",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefs.ShoppingCartStepDef.userHoversOverProduct()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the \"item has been added to the cart\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.ShoppingCartStepDef.thenVerifyThe(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "the user is on the \"homepage\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefs.CommonStepDef.theUserIsOnThePage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check quantity in basket decreases",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user is on the shopping cart page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefs.ShoppingCartStepDef.userIsOnThePage()"
});
formatter.result({
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for element to be clickable: By.cssSelector: a.btn.btn-primary (tried for 20 second(s) with 500 MILLISECONDS interval)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:82)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:231)\r\n\tat pageObjects.BasePage.waitAndClick(BasePage.java:31)\r\n\tat pageObjects.ShoppingCartPage.addToCart(ShoppingCartPage.java:34)\r\n\tat stepdefs.ShoppingCartStepDef.userIsOnThePage(ShoppingCartStepDef.java:84)\r\n\tat ✽.the user is on the shopping cart page(file:///D:/IdeaProjects/Ten10StoreThree/src/test/resources/features/shoppingcart.feature:35)\r\nCaused by: org.openqa.selenium.NoSuchElementException: Cannot locate an element using By.cssSelector: a.btn.btn-primary\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.6.0\u0027, revision: \u00276fbf3ec767\u0027, time: \u00272017-09-27T15:28:36.4Z\u0027\nSystem info: host: \u0027LAPTOP-NVKLSVIM\u0027, ip: \u0027192.168.0.12\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.7\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.lambda$findElement$0(ExpectedConditions.java:882)\r\n\tat java.base/java.util.Optional.orElseThrow(Optional.java:408)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.findElement(ExpectedConditions.java:881)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$000(ExpectedConditions.java:43)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:205)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$7.apply(ExpectedConditions.java:201)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$22.apply(ExpectedConditions.java:643)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$22.apply(ExpectedConditions.java:640)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:208)\r\n\tat pageObjects.BasePage.waitAndClick(BasePage.java:31)\r\n\tat pageObjects.ShoppingCartPage.addToCart(ShoppingCartPage.java:34)\r\n\tat stepdefs.ShoppingCartStepDef.userIsOnThePage(ShoppingCartStepDef.java:84)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:566)\r\n\tat io.cucumber.java.Invoker.invoke(Invoker.java:27)\r\n\tat io.cucumber.java.JavaStepDefinition.execute(JavaStepDefinition.java:27)\r\n\tat io.cucumber.core.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:63)\r\n\tat io.cucumber.core.runner.TestStep.executeStep(TestStep.java:64)\r\n\tat io.cucumber.core.runner.TestStep.run(TestStep.java:49)\r\n\tat io.cucumber.core.runner.PickleStepTestStep.run(PickleStepTestStep.java:46)\r\n\tat io.cucumber.core.runner.TestCase.run(TestCase.java:51)\r\n\tat io.cucumber.core.runner.Runner.runPickle(Runner.java:67)\r\n\tat io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:149)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:83)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:24)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:185)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:83)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat io.cucumber.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:219)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\r\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:33)\r\n\tat com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:230)\r\n\tat com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:58)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user has 2 items in basket",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.ShoppingCartStepDef.userHasTwoItemsInTheBasket()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user \"decreases\" quantity of product",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefs.ShoppingCartStepDef.quantityOfProduct(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify the \"basket is updated\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.ShoppingCartStepDef.thenVerifyThe(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify the Product counter is updated.",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "pricing and totals should be updated",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.ShoppingCartStepDef.pricingAndTotalsUpdated()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("file:src/test/resources/features/signin.feature");
formatter.feature({
  "name": "Sign In",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Sign in as Registered User",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user is on the \"sign back in\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefs.CommonStepDef.theUserIsOnThePage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user fills in sign in details with a \"registered email\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefs.SignInStepDef.User(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user has a \"signed in account\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.SignInStepDef.theUserIsSigned(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Sign in as Unregistered User",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user is on the \"sign in\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefs.CommonStepDef.theUserIsOnThePage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user fills in sign in details with a \"unregistered email\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefs.SignInStepDef.User(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user has a \"invalid account\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.SignInStepDef.theUserIsSigned(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Sign in but forgotten password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user is on the \"sign in\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefs.CommonStepDef.theUserIsOnThePage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks \"forgotten password\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefs.SignInStepDef.theUserClicks(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user fills in \"password email form\" on next page",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.SignInStepDef.fillsInOnNextPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"alert message\" is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.SignInStepDef.isDisplayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Sign out of Account",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user is on the \"sign in\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefs.CommonStepDef.theUserIsOnThePage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks \"sign out\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefs.SignInStepDef.theUserClicks(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user has a \"signed out account\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.SignInStepDef.theUserIsSigned(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Change Account Preferences",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user is on the \"home\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefs.CommonStepDef.theUserIsOnThePage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the \"sign in\" page",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.CommonStepDef.theUserIsOnThePage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user fills in sign in details with a \"registered email\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.SignInStepDef.User(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the \"Information\" page",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.CommonStepDef.theUserIsOnThePage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user fills in \"change preferences form\" on next page",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefs.SignInStepDef.fillsInOnNextPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"alert success message\" is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.SignInStepDef.isDisplayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Sign in with Invalid password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user is on the \"sign in\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefs.CommonStepDef.theUserIsOnThePage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user fills in sign in details with a \"wrong password\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefs.SignInStepDef.User(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"wrong password alert\" is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.SignInStepDef.isDisplayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User adds address",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user is on the \"sign in\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefs.CommonStepDef.theUserIsOnThePage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user fills in sign in details with a \"registered email\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.SignInStepDef.User(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the \"Address\" page",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.CommonStepDef.theUserIsOnThePage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user fills in \"new address form\" on next page",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefs.SignInStepDef.fillsInOnNextPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"new address\" is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.SignInStepDef.isDisplayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User adds message to order",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user is on the \"sign in\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefs.CommonStepDef.theUserIsOnThePage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user fills in sign in details with a \"registered email\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.SignInStepDef.User(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the \"pre existing order\" page",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.CommonStepDef.theUserIsOnThePage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user fills in \"a message\" on next page",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefs.SignInStepDef.fillsInOnNextPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"updated order\" is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.SignInStepDef.isDisplayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User inputs invalid E-Mail as forgotten password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user is on the \"sign in\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefs.CommonStepDef.theUserIsOnThePage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks \"forgotten password\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.SignInStepDef.theUserClicks(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user fills in \"invalid email form\" on next page",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefs.SignInStepDef.fillsInOnNextPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"unregistered email alert\" is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.SignInStepDef.isDisplayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});