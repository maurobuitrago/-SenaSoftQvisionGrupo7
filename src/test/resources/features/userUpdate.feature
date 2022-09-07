Feature: Update user data
  As user of Bon Bonite wants to update his personal data

  Scenario: Update personal data
    Given That i sign in my account on the option account detail
    When enter my correct credentials
      | idUser     | password               |
      | 1031803334 | dscr2005daniel51835436 |
    And change my personal data
      | name   | lastName | email               | currentPassword        | newPassword |
      | Daniel | Roa      | lion35528@gmail.com | dscr2005daniel51835436 | dscr20051234567890    |
    Then should see my data update
    |name|Daniel|