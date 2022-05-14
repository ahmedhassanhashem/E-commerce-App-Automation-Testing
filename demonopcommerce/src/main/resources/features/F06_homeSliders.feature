@SmokeTesting
Feature: User could click on slider wrapper

  Background: User navigates to demo.nopcommerce website

  Scenario: Click on Nokia banner on responsive slider wrapper

    Given Click on Nokia banner controller
    When Click on Nokia banner

    Then User could click on the banner and redirect to the Nokia link

  Scenario: Click on Nokia banner on responsive slider wrapper

    Given Click on IPhone banner controller
    When Click on IPhone banner

    Then User could click on the banner and redirect to the IPhone link