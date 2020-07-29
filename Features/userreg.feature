Feature: User registration
Scenario Outline: New user registration
Given I am on oscommerce signup page
When I enter info it auto fills
Then I am able to sign up

Examples: 

|GENDER	|FIRST NAME	|LAST NAME	|DOB		|EMAIL			|STREET ADDRESS		|ZIP CODE	|CITY	|STATE	|COUNTRY	|PASSWORD	|CONFIRM PASSWORD|
|MALE	|MOHD		|SALAHUDDIN	|07/15/1989	|xyz@gmail.com	|34-40 71ST STREET	|11372		|JACKSON|NY		|USA		|KINGX		|KINGX|

