Feature: Filter shoes by prices
  As user of the web bon bonite i want to filter the prices of shoes
  Scenario: Filter prices
    Given That i enter to the web page on the module shoes
    When select a filter by price
      | range |
      | 1     |
    Then should see the result filter by prices