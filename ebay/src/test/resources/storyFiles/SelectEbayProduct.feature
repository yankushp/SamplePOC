Feature: Search and select the product on ebay

  @Ebay
  Scenario Outline: Search and select the product on ebay website

    Given I enter test case "<TestCase Number>" to execute scenario "<TestScenario Name>" test
    When I navigate to Ebay website
    And I enter the "<Product name>" and search the product
    And I Select the product from product list page
    Then I see product purchase page

    Examples:
      |TestCase Number| TestScenario Name            | Product name                          |
      |  UI_TC_01     | Search and select the product| Coles Little Shop 2 Mini collectables |
