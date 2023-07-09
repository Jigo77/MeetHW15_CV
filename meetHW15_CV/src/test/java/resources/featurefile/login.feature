Feature: Home Feature
      As user i want check available job


  Scenario: User can see available job in area
    Given User is on Home page
    When I enter jobTitle "Tester"
    And I enter location "Harrow"
    And I select miles "5 miles"
    And I click on link
    And I enter min salary "30000"
    And I enter max salrry "500000"
    And I enter salary type "Per annum"
    And I enter jobtype "Permanent"
    And I click on Find button
    Then I should get job details
