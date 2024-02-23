@TVKLogin
Feature: Car Rental Feature
  @UserLogin
  @Positive-case
  Scenario: Verify main flow of cars rental feature
    Given User Open The Website Traveloka
    When User Click Car Rental Menu
    Then User Select Pick-up Location "Jakarta"
    And User Select Pick-up Date & Time Asfollows
    And User Select Drop-off Date & Time Asfollows
    Then User Click button Search Car
    And User Select Car
    And User Select Car Provider
    Then User Click button Continue in Product Detail
    And User Select Pick-up Location in “Rental Office”
    And User Select Drop-off Location in “Other Location”
    And User Input Pick-up or Drop-off notes is optional
    Then User Click button Book Now
    And User Fill Contact Details
    And User Fill Driver Details
    Then User Click Continue
    And User Add a special request is optional
    And User Check all rental requirements
    Then User Click Continue
    And User Select payment method and proceed payment