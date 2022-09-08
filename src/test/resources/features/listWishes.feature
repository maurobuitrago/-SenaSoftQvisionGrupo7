Feature: List Wishes
  As a user of bon bonite i wan to add a product to the list wishes

  Scenario: Product add to list wishes
    Given That i enter to the web page bon-bonite on the module my account
    When Enter correct crendentials
      | document   | password               |
      | 1031803334 | dscr2005daniel51835436 |
    And Add a product to the list wishes
    Then Should see in this list