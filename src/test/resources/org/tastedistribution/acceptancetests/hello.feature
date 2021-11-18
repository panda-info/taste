Feature: Say hello to users

  Scenario: The user get his name when he calls say hello
    Given Whe have a user name "Zouhair"
    When The user calls say hello
    Then He gets "Hello Zouhair"