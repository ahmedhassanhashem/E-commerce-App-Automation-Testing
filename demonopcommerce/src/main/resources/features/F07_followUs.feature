@SmokeTesting
Feature: Follow us links open the corresponding URLs

  Background: User navigates to demo.nopcommerce website

  Scenario: Scroll down to the bottom and click on the follow us icons

    Given Scroll down to the bottom
    When Click on facebook icon
    And Click on twitter icon
    And Click on rss icon
    And Click on youtube icon

    Then User could open facebook page
    And User could open twitter page
    And User could open rss page
    And User could open youtube page