@test
Feature: Is it Moday yet?
  Everybody wants to know when it's Friday

  Scenario: Monday isn't Friday
    Given today is Sunday
    When I ask whether it's Friday yet
    Then I should be told "Nope"
    