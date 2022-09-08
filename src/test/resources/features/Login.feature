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
      | document | 1014856939 |

  Scenario: Bad login
    Given im on the BonBonite page
    When i enter invalid password
      | document   | password |
      | 1014856939 | 123      |
    Then i will not be able to login

  Scenario: Dont exists user
    Given  im on the BonBonite page
    When  i enter nonexistent user
      | document    | password |
      | 88888888888 | 123      |
    Then print the error that the user does not exist