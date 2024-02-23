@TVKLogin
Feature: Car Rental Feature
  @UserLogin
  @Positive-case
  Scenario: Select cars product
    Given User open the website traveloka
    When User click car rental menu
    Then User click your rental location
    And User choose Gambir Station
    Then User select start date
    And User choose start time
    Then User select end date
    And User choose end time
    And User click search car
    And User select car