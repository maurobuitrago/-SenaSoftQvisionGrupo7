Feature: Update user data
  As user of Bon Bonite wants to update his personal data
  Scenario: Update personal data
    Given That i sign in my account on the option account detail
    When enter my correct credentials
    And change my personal data
    Then sould see my data update