$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SelectEbayProduct.feature");
formatter.feature({
  "line": 1,
  "name": "Search and select the product on ebay",
  "description": "",
  "id": "search-and-select-the-product-on-ebay",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Search and select the product on ebay website",
  "description": "",
  "id": "search-and-select-the-product-on-ebay;search-and-select-the-product-on-ebay-website",
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
  "name": "I Select the product from product list page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I see product purchase page",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "search-and-select-the-product-on-ebay;search-and-select-the-product-on-ebay-website;",
  "rows": [
    {
      "cells": [
        "TestCase Number",
        "TestScenario Name",
        "Product name"
      ],
      "line": 13,
      "id": "search-and-select-the-product-on-ebay;search-and-select-the-product-on-ebay-website;;1"
    },
    {
      "cells": [
        "UI_TC_01",
        "Search and select the product",
        "Coles Little Shop 2 Mini collectables"
      ],
      "line": 14,
      "id": "search-and-select-the-product-on-ebay;search-and-select-the-product-on-ebay-website;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3889699956,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Search and select the product on ebay website",
  "description": "",
  "id": "search-and-select-the-product-on-ebay;search-and-select-the-product-on-ebay-website;;2",
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
  "name": "I enter the \"Coles Little Shop 2 Mini collectables\" and search the product",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I Select the product from product list page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I see product purchase page",
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
  "duration": 302581796,
  "status": "passed"
});
formatter.match({
  "location": "EbayHomePageSteps.i_navigate_to_Ebay_website()"
});
formatter.result({
  "duration": 3224667303,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Coles Little Shop 2 Mini collectables",
      "offset": 13
    }
  ],
  "location": "EbayHomePageSteps.i_enter_the_and_search_the_product(String)"
});
formatter.result({
  "duration": 7916357376,
  "status": "passed"
});
formatter.match({
  "location": "EbayProductListPageSteps.i_Select_the_product_from_product_list_page()"
});
formatter.result({
  "duration": 3429293604,
  "status": "passed"
});
formatter.match({
  "location": "EbayProductAddToCartPageSteps.i_see_product_purchase_page()"
});
formatter.result({
  "duration": 311916546,
  "status": "passed"
});
formatter.after({
  "duration": 1875642056,
  "status": "passed"
});
formatter.after({
  "duration": 1577787522,
  "status": "passed"
});
});