@SmokeTesting
Feature: User could search for any product

  Background: User navigates to demo.nopcommerce website

  Scenario: User search for desired products with product name

    Given Type "Apple" on search text box
    When Click on SEARCH button or hit enter key

    Then User could find Apple products

  Scenario: User search for desired products with SKU

    Given Type "APPLE_CAM" on search text box
    When Click on SEARCH button or hit enter key

    Then User could find Apple product