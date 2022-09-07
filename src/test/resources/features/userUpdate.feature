Feature: Update user data
  As user of Bon Bonite wants to update his personal data

  Scenario: Update personal data
    Given That i sign in my account on the option account detail
    When enter my correct credentials
      | idUser      | password               |
      | 1031803334 | dscr2005daniel51835436 |
    And change my personal data
    Then sould see my data update