Feature: Cart module

  i as a webuser
  I want to add products to my shopping cart
  to see its final price


  Scenario: Add a product and increase its units
    Given im on the BonBonite page
    When i add a product to the cart
    And increased its units
    Then should be able to see its final price


  Scenario: Reserve a product
    Given im on the BonBonite page
    When i add a product out of stock to the cart
    Then should be able to book it