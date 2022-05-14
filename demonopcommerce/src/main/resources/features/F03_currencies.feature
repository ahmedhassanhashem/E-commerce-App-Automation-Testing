@SmokeTesting
Feature: User could switch between currencies [US-Euro]

  Background: User navigates to demo.nopcommerce website

  Scenario: User switch between US and Euro

    Given Look for products currency
    When Change the currency

    Then User could find the selected currency