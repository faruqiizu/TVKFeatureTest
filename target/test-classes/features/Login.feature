@TVKLogin
Feature: User Login
  @UserLogin
  @Positive-case
  Scenario: Login with valid email and valid password
    Given User open the website traveloka
    When User input "sukendarawi@gmail.com" as a email "@Bojonggede01" as a password before click Login
    Then User click Tutup on information popup
    And User already on dashboard page

  @UserLogin
    @Negative-case
  Scenario Outline: Login with valid or invalid data and invalid input
    Given User open the website traveloka
    When User input <email> as email <pw> as password before click Login
    Then User see popup error message and message contain Login failed
    Examples:
      | email                 | pw            |
      | sukendarawi@gmail.com |               |
      |                       | @Bojonggede01 |
      | 1234                  |               |
      |                       | wasd          |
      |                       |               |