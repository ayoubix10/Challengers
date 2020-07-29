Feature: search quickfind
Scenario Outline: search a valid product
Given I am on the oscommerce homepage
When I enter <search term> quick find
Then I see the list of the associated products

Examples:

|search term|
|samsung|