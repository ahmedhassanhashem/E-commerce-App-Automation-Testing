@SmokeTesting
Feature: User could add products to wishlist

  Background: User navigates to demo.nopcommerce website

  Scenario: User choose a product and click on Add to wishlist icon

    Given Scroll down and choose a random product and click on it
    When Click on add to wishlist icon

    Then the product is added to the user's wishlist and message appears says The product has been added to your wishlist