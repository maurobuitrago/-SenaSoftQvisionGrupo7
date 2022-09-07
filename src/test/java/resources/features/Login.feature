Feature: Login succesful

  as a user
  i want to login on the BonBonite page
  with my credentials
  to enter make a purchase

  Scenario: Login Successful
    Given im on the BonBonite page
    When i enter my credentials correctly
      | document   | password        |
      | 1014856939 | g.8uw69JywvUmM2 |
    Then i should see my document in the screen