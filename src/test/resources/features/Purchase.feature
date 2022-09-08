Feature: Puchase module

  i as webuser
  i want to buy in bonbonite with my account

  Scenario: Purchase complete
    Given im on the BonBonite page
    When i add some products to the cart
    And finalize the purchase
      | document   | password        |
      | 1014856939 | g.8uw69JywvUmM2 |
    Then i should see the payment gateway