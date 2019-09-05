Feature: Search and select the product on ebay

  @Ebay
  Scenario Outline: Search and select the product on ebay website

    Given I enter test case "<TestCase Number>" to execute scenario "<TestScenario Name>" test
    When I navigate to Ebay website
    And I enter the "<Product name>" and search the product
    And I select the product from product list page
    Then I see added product in product purchase page
    When I click on Add to cart button
    Then I see added product is displayed in cart
    When I remove the product from cart
    Then I see a message you dont have any items in your cart

    Examples:
      |TestCase Number| TestScenario Name            | Product name |
      |  UI_TC_01     | Search and select the product| book         |
