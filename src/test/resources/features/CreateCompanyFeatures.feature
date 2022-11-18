Feature: in this feature I want to test all the required combinations in create company



  @sample
  Scenario: As an user I want to test create company with public access
    When user opens the company form
    And user enters company data
    And user saves the company
    Then application throws the error



  @sample @Neg
  Scenario: As an user i want to test create company with private access
    When user navigates to company page
    And user enters company data
    And user saves the company
    Then company created successfully.