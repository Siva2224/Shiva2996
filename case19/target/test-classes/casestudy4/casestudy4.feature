
Feature: Title of your feature


  @tag1
  Scenario: without add to cart
    Given launch chrome and load TestMeApp
    And naviagte to signin
    And i login
    And search headphone in search bar and click on find details
    And proceed payment without adding item to the cart
    Then TestMeApp should not display the add to cart icon
      