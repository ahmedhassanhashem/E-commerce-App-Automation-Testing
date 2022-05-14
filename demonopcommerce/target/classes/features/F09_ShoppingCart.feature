@SmokeTesting
Feature: User could add products to cart

  Background: User navigates to demo.nopcommerce website

  Scenario: User choose a product and click on ADD TO CART button

    Given Scroll down and choose a random product and click on it
    When Click on ADD TO CART button

    Then the product is added to the user's shopping cart and message appears says The product has been added to your shopping cart