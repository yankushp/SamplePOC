$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AddAndRemoveProductFromEbay.feature");
formatter.feature({
  "line": 1,
  "name": "Ebay feature test",
  "description": "",
  "id": "ebay-feature-test",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Add and remove the product from cart on ebay website",
  "description": "",
  "id": "ebay-feature-test;add-and-remove-the-product-from-cart-on-ebay-website",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Ebay"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I enter test case \"\u003cTestCase Number\u003e\" to execute scenario \"\u003cTestScenario Name\u003e\" test",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I navigate to Ebay website",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I enter the \"\u003cProduct name\u003e\" and search the product",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I select the product from product list page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I see added product in product purchase page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I click on Add to cart button",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I see added product is displayed in cart",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I remove the product from cart",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I see a message you dont have any items in your cart",
  "keyword": "Then "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "ebay-feature-test;add-and-remove-the-product-from-cart-on-ebay-website;",
  "rows": [
    {
      "cells": [
        "TestCase Number",
        "TestScenario Name",
        "Product name"
      ],
      "line": 17,
      "id": "ebay-feature-test;add-and-remove-the-product-from-cart-on-ebay-website;;1"
    },
    {
      "cells": [
        "UI_TC_01",
        "Search and select the product",
        "book"
      ],
      "line": 18,
      "id": "ebay-feature-test;add-and-remove-the-product-from-cart-on-ebay-website;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2865420046,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Add and remove the product from cart on ebay website",
  "description": "",
  "id": "ebay-feature-test;add-and-remove-the-product-from-cart-on-ebay-website;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Ebay"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I enter test case \"UI_TC_01\" to execute scenario \"Search and select the product\" test",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I navigate to Ebay website",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I enter the \"book\" and search the product",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I select the product from product list page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I see added product in product purchase page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I click on Add to cart button",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I see added product is displayed in cart",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I remove the product from cart",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I see a message you dont have any items in your cart",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "UI_TC_01",
      "offset": 19
    },
    {
      "val": "Search and select the product",
      "offset": 50
    }
  ],
  "location": "BaseTest.i_enter_test_case_to_execute_scenario_test(String,String)"
});
formatter.result({
  "duration": 73129143,
  "status": "passed"
});
formatter.match({
  "location": "EbayHomePageSteps.i_navigate_to_Ebay_website()"
});
formatter.result({
  "duration": 2951634494,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "book",
      "offset": 13
    }
  ],
  "location": "EbayHomePageSteps.i_enter_the_and_search_the_product(String)"
});
formatter.result({
  "duration": 5162975399,
  "status": "passed"
});
formatter.match({
  "location": "EbayProductListPageSteps.i_select_the_product_from_product_list_page()"
});
formatter.result({
  "duration": 4534077824,
  "status": "passed"
});
formatter.match({
  "location": "EbayProductAddToCartPageSteps.i_see_added_product_in_product_purchase_page()"
});
formatter.result({
  "duration": 54833363,
  "status": "passed"
});
formatter.match({
  "location": "EbayProductAddToCartPageSteps.i_click_on_Add_to_cart_button()"
});
formatter.result({
  "duration": 2019771122,
  "status": "passed"
});
formatter.match({
  "location": "EbayCartPageSteps.i_see_added_product_is_displayed_in_cart()"
});
formatter.result({
  "duration": 56377588,
  "status": "passed"
});
formatter.match({
  "location": "EbayCartPageSteps.i_remove_the_product_from_cart()"
});
formatter.result({
  "duration": 102229874,
  "status": "passed"
});
formatter.match({
  "location": "EbayCartPageSteps.i_see_a_message_you_dont_have_any_items_in_your_cart()"
});
formatter.result({
  "duration": 627757913,
  "status": "passed"
});
formatter.after({
  "duration": 375988530,
  "status": "passed"
});
formatter.after({
  "duration": 823754236,
  "status": "passed"
});
});