Feature: Pedidos

  Scenario: Cancel orders
    Given im on the BonBonite page
    When i enter my credentials correctly
      | document   | password        |
      | 1014856939 | g.8uw69JywvUmM2 |
    When I want to see my orders and cancel the order
    Then i should see a confirmation alert