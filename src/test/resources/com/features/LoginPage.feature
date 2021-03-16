Feature: This feature file contains test scenario for T-shirt order and verifying it in order history

  Background: 
    Given User is on the login page

  Scenario: As a user I want to validate login Page title
    When User observe the title of the page
    Then Login page title should display "Login - My Store"

  Scenario: As a user I want to login with correct credentials
    When User enters "hemanshutestuser@gmail.com" as a username
    And Enter "Password@1" as a password
    And Click on login button
    Then Home page should display
    And Home page title should be "My account - My Store"
    Then Click T-shirts section
    And Select Faded T-shirt
    Then Add the T-shirt in cart
    Then Proceed to checkout
    Then Agree term and conditions
    And Proceed to final checkout
#    Then User confirms the order
#    Then Make Bank wire Payment
#    When User observe the title of order page
#    Then Order page title should be "Order confirmation - My store"